import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCInsertDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college_db";
        String user = "root";
        String password = "your_password";

        String query = "INSERT INTO Student (grno, name, marks) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query);
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter GR Number: ");
            pstmt.setInt(1, scanner.nextInt());
            
            System.out.print("Enter Name: ");
            pstmt.setString(2, scanner.next());
            
            System.out.print("Enter Marks: ");
            pstmt.setInt(3, scanner.nextInt());

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " record(s) successfully inserted into the database.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
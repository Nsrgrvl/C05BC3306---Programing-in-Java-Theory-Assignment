class Student {
    String university = "Marwadi University";
    void displayCommonInfo() {
        System.out.println("University: " + university);
    }
}

class BCAStudent extends Student {
    String course = "BCA";
    void displayBCAInfo() {
        System.out.println("Course: " + course);
    }
}

class BScStudent extends Student {
    String course = "BSc";
    void displayBScInfo() {
        System.out.println("Course: " + course);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- BCA Student ---");
        BCAStudent bca = new BCAStudent();
        bca.displayCommonInfo(); // Inherited method
        bca.displayBCAInfo();

        System.out.println("\n--- BSc Student ---");
        BScStudent bsc = new BScStudent();
        bsc.displayCommonInfo(); // Inherited method
        bsc.displayBScInfo();
    }
}
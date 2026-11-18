class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AdmissionSystem {
    // The 'throws' keyword declares that this method might throw an exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // The 'throw' keyword actually throws the exception instance
            throw new InvalidAgeException("Application rejected: Student is below 18 years of age.");
        } else {
            System.out.println("Application accepted.");
        }
    }

    public static void main(String[] args) {
        int studentAge = 16;
        try {
            System.out.println("Verifying student age: " + studentAge);
            validateAge(studentAge);
        } catch (InvalidAgeException e) {
            // Catching and handling the exception
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
class InvalidAgeException extends Exception {

    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class AgeValidator {

    public static void validate(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("You are not eligible for voting");
        }
        System.out.println("You are eligible for voting");


    }

    public static void main(String[] args) {

        try {
            validate(18);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

}

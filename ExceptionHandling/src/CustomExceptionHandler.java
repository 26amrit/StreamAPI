class MyException extends Exception {

    public MyException(String msg) {
        super(msg);
    }
}

public class CustomExceptionHandler {

    public static void main(String[] args) {

        try {
            throw new MyException("This is Custom Exception");
        } catch (MyException e) {
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}

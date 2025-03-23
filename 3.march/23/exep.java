public class exep {
    public static void main(String[] args) {
        // 1. Handling ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        // 2. Handling NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        // 3. Handling ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // 4. Handling NumberFormatException
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        // 5. Handling FileNotFoundException
        try {
            java.io.FileReader file = new java.io.FileReader("nonexistentfile.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }

        // 6. Handling IOException
        try {
            java.io.FileReader file = new java.io.FileReader("nonexistentfile.txt");
            file.read();
        } catch (java.io.IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }

        // 7. Using finally block
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        // 8. Throwing a custom exception
        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }
}

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

import java.util.Scanner;

class CustomArithmeticException extends ArithmeticException{
    public CustomArithmeticException(String message){
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerator = Integer.parseInt(scanner.nextLine());
        int denominator = Integer.parseInt(scanner.nextLine());

        try{
            int result = divide(numerator, denominator);
            System.out.println("Result: "+ result);
        }catch(CustomArithmeticException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Error.");
        }catch(Exception e){
            System.out.println("An unexpectes error: "+e.getMessage());
        }
        scanner.close();
    }
    public static int divide(int numerator, int denominator) throws CustomArithmeticException {
        if(denominator == 0){
            throw new CustomArithmeticException("Error: Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}

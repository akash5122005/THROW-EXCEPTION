import java.util.Scanner;
class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        try{
            validateAge(age);
            System.out.println("Age is valid: "+age);
        }catch(AgeException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Error: ");
        }catch(Exception e){
            System.out.println("An unexpected error: "+e.getMessage());
        }
        scanner.close();
    }
    public static void validateAge(int age) throws AgeException{
        if(age < 18){
            throw new AgeException("Age must be at least 18.");
        }
    }
}

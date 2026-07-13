import java.util.Scanner;

// Changed class name from 'switch' to 'SwitchExample'
public class switchexample {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         
         System.out.println("Enter a case (1 or 2): ");
         int x = sc.nextInt();
         
         switch (x) {
             case 1 :
                 System.out.println("hello india");
                 break;
             case 2 :
                 System.out.println("hello england");
                 break;
             default:
                 System.out.println("Invalid choice!");
                 break;
         }
         
         sc.close(); // Good practice to close the scanner when done
    }
}
import java.util.Scanner;
public class if_statement {
    public static void main( String[] args){
       Scanner sc = new Scanner(System.in)  ;
       System.out.println("enter a age: ");
       int age = sc.nextInt();
       if(age>=18){
        System.out.println("able to vote ");
       }
       else{
        System.out.println("unable to vote");
       }
    }
}
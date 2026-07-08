import java.util.Scanner;

public class input {
    public static void main(String[] args){
        System.out.print("enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();  // for single word input 
        System.out.print("enter your info:");
        String info = sc.nextLine(); // for multiple word input 
        System.out.println("your name is:" + name);
        System.out.println("your info is:" + info);
    }
}
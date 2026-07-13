import java.util.Scanner;
public class comparision{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number1");
        int num1 = sc.nextInt();
        System.out.println("enter a number1");
        int num2 = sc.nextInt();
        if(num1 == num2 ){
            System.out.println("equal");
        }
        else if(num1 > num2 ){
            System.out.println("num1 is greater than num2");
        }
        else  {
            System.out.println("num2 is greater than num1");
        }

    }
}
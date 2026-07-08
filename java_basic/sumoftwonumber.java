import java.util.Scanner;
public class sumoftwonumber{
    public static void main(String[] args){
        int a;
        int b;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number");
        a = sc.nextInt();
        System.out.println("enter a secound");
        b = sc.nextInt();
        sum = a+b;
        System.out.println(sum);
    }
}
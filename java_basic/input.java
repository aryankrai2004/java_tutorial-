import java .util.Scanner;
public class input {
    public static void main(String[] args){
        System.out.println("enter a name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // nextInt integer value
        // nextFloat() floating value
        System.out.println(name);
    }
}
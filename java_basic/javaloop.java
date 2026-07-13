import java.util.Scanner;
public class javaloop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name: ");
        String name = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println("my name is: " + name);
        }
    }
}

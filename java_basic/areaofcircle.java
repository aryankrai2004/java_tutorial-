import java.util.Scanner;
public class areaofcircle{
    public static void main(String[] args){
        int radius;
        float area;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        radius = sc.nextInt();
        area = 3.14f * radius * radius;
        System.out.println("area of circle is " + area);
    }


    
}
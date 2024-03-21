import java.util.Scanner;
public class floatanddouble {
    public static void main(String Args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("enter the float number");
        float b = a.nextFloat();
        System.out.print("enter the double number");
        double c= a.nextDouble();
        System.out.println(b);
        System.out.println(c);
        a.close();
    }
}

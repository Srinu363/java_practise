import java.util.Scanner;
public class boolean1 {
    public static void main(String Args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the bool values");
        boolean a = obj.nextBoolean();
        System.out.print("enter the bool values");
        boolean b=obj.nextBoolean();
        System.out.println(a);
        System.out.println(b);
        obj.close();
    }
}

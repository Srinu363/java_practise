import java.util.Scanner;
class short2{
    public static void main(String Args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the number");
        short num = obj.nextShort();
        // short is store a number in between -32768 to 32767
        System.out.print(num);
        obj.close();
    }
}

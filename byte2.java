import java.util.Scanner;
class byte2{
    public static void main(String Args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("enter the number");
        byte num = a.nextByte();
        // byte is used to store a number in between -127 to 127
        System.out.print(num);
        a.close();
    }
}

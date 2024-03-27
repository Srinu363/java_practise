import java.util.Scanner;
class array_input{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = a.nextInt();
        int[] array = new int[size];
        System.out.println("enter "+size+"array elements");
        for (int i=0; i<size; i++){
            array[i]=a.nextInt();
        }
        for (int i=0; i<size; i++){
            System.out.print(array[i] + " ");
        }
        a.close();

    }

}

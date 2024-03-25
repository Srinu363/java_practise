class array{
    public static void main(String Args[]){
        int[] numbers;
        numbers = new int[5];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;
        System.out.print("array elements are: ");
        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }

    }
}

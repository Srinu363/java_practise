class Stringmethods{
    public static void main(String b[]){
        String a = "Java programming";
        //char method
        char c = a.charAt(1);
        System.out.println(c);
        //length() method
        int len = a.length();
        System.out.println(len);
        //substring()  method
        String str1 = a.substring(5);
        String str2 = a.substring(0,5);
        System.out.println(str1);
        System.out.println(str2);
        // indexOf method() find the index of chat in a string
        int str3 = a.indexOf("v");
        System.out.println(str3);
        // startWith() method
        boolean str4 = a.startsWith("Java");
        System.out.println(str4);
        // endsWith() method
        boolean str5 = a.endsWith("world");
        System.out.println(str5);

}
}
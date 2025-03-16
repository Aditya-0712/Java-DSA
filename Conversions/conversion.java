package Conversions;

public class conversion {
    public static void main(String[] args) {
        //int to String
        int a = 21;
        String b = Integer.toString(a);

        //int to char
        char ch = (char)a;

        //String to int
        String str = "123";
        int num = Integer.parseInt(str);

        //String to Integer
        Integer num2 = Integer.valueOf(str);

        //String to char
        char x = str.charAt(0);
        char[] arr = str.toCharArray();

        //char to int
        char z = 'z';
        int ok = z-0;

        //char to String
        String str2 = Character.toString(z);

        System.out.println(b+ ch + num + num2 + x + arr[0] + ok + str2);
    }
}

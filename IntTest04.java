public class IntTest04 {
    public static void main(String[] args) {
        //错误
        //byte b = 300;

        //300对应的二进制是：00000000 00000000 00000001 00101100
        //byte类型只能存储8位，所以只取后8位：00101100
        byte b = (byte)300;
        System.out.println(b);//44

        byte x = 1;
        System.out.println(x);
        byte y = 127;
        System.out.println(y);
        //错误
        //byte z = 128;

        short s = 1;
        System.out.println(s);
        short s1 = 32767;
        System.out.println(s1);
        //错误
        //short s2 = 32768;
    }
}

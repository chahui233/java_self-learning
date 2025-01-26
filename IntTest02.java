public class IntTest02 {
    public static void main(String[] args) {
        //不存在类型转换
        int a = 100;
        System.out.println(a);

        //小容量可以自动转换为大容量，自动类型转换
        long b = 200;
        System.out.println(b);

        //不存在类型转换
        long c = 300L;
        System.out.println(c);

        //2147483647是int最大值
        long d = 2147483647;
        System.out.println(d);

        //2147483648超出了int范围
        //long e = 2147483648;
        long e = 2147483648L;
        System.out.println(e);
    }
}

public class IntTest03 {
    public static void main(String[] args) {
        //不存在强制类型转换
        long x = 100L;

        //编译错误，不兼容的类型
        //int y = x;
        int y = (int)x;//强制类型转换
        System.out.println(y);

        int a = 100;
        System.out.println(a);

        int b = a;
        System.out.println(b);
    }
}

public class IntTest06 {
    public static void main(String[] args) {
        
        char c1 = 'a';
        byte b = 1;
        
        //注意这里的+是加法运算
        System.out.println(c1 + b);

        //错误，不兼容的类型: 从byte转换到char可能会有损失
        //编译器不知道加法最后结果，只知道是int类型
        //short s = c1 + b;
        short s = (short)(c1 + b);
        System.out.println(s);

        
    }
}

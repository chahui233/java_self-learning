public class CharTest03{
    public static void main(String[] args) {

        char c1 = 'a';
        System.out.println(c1);

        //97是int类型，此处不需要转换
        char c2 = 97;
        System.out.println(c2);

        //char类型取值范围0～65535
        char c3 = 65535;
        System.out.println(c3);
        
        //错误，不兼容的类型
        //char c4 = 65536;
        char c4 = (char)65536;//强制类型转换
        System.out.println(c4);
    }
}
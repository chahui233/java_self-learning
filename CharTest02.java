public class CharTest02 {
    public static void main(String[] args){
        //这是一个字符
        char c1 = 't';
        System.out.println(c1);
        //这是转义字符，实际上是一个字符
        char c2 = '\t';//制表符，相当于按了Tab键
        System.out.println(c2);

        System.out.println("abctdef");
        // \的出现会将后面的字符变成转义字符
        System.out.println("abc\tdef");

        System.out.print("abc");//print()方法不会换行
        char c3 = '\n';//换行符，相当于按了回车键
        System.out.println(c3); //此处相当于两个换行
        System.out.println("def");

        //输出一个单引号，需要使用\'
        System.out.println('\'');
        //输出一个\，需要使用\\
        System.out.println("\\");

        System.out.println("\"test\"");

        //反斜杠u后面是一个十六进制的Unicode编码
        char x = '\u4e2d';
        System.out.println(x);
    }
}

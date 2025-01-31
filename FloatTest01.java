public class FloatTest01 {
    public static void main(String[] args) {
        
        //不存在类型转换
        double pi = 3.1415926;
        System.out.println(pi);

        //错误，不兼容的类型
        //float f = 3.14;
        float f = 3.14f;
        //强制类型转换，可能会丢失精度
        float F = (float)3.14;

        System.out.println(f);
    }
    
}

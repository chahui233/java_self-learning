public class IntTest07 {
    public static void main(String[] args) {
        
        long a = 10L;
        char c = 'a';
        short s = 100;
        int i = 30;

        System.out.println(a + c + s + i); // 237

        //错误，不兼容的类型: 从long转换到int可能会有损失
        //int x = a + c + s + i;
        int x = (int)(a + c + s + i);
        System.out.println(x);
        
    }
}

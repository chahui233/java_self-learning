public class IntTest05 {
    public static void main(String[] args) {
        //byte b = 150;
        //150的二进制码为00000000 00000000 00000000 10010110
        //强转为byte后为10010110，是一个二进制补码
        //逆推反码为10010101,原码为11101010，即-106
        byte b = (byte)150;
        System.out.println(b);//结果输出-106
    }
}

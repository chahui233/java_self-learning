public class VarTest08{
	int i = 10000;
	public static void main(String []args){
		int i = 100;
		System.out .println(i);//就近原则，所以这里输出应该是100
		//int i = 90;//同一个域中不允许
		for(int n = 0; n < 10; n++){ //这里的n只属于for域，for结束后n就会释放
			//代码
		}
		//System.out.println(n);//错误，无法访问
		int k;
		for(k = 0;k < 10;k++){
			
		}
		System.out .println(k);
	}
	public static void x(){
		//System.out.println(i);//无法访问
		int i = 200;//这个i和main方法中的i不在同一个域中，不冲突
	}
}

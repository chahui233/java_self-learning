//在同一个域中，变量名不能重名（与类型无关）
public class VarTest04{
	public static void main(String[] args){
		int nianLing = 20;
		System.out.println(nianLing);
		nianLing = 30;
		System.out.println(nianLing);
		//错误
		int nianLing = 100;
		System.out.println(nianLing);
		//错误
		double nianLing = 20.5;
		System.out.println(nianLing);
	}
}

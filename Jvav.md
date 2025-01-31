# Java开发环境搭建
## windows常用DOS命令
exit 退出当前dos命令窗口
cls清屏
**窗口内容复制**  在任意位置右键选择标记，然后选中要复制的内容，在任意位置点击鼠标右键，此时选中内容已被复制到剪切板
dir 列出当前目录下所有的子文件/子目录
cd命令
* cd命令表示：change directory(改变目录)
* 用法：cd 目录的路径
* 绝对路径：表示该路径从某个磁盘的盘符下作为出发点的路径
* 相对路径：表示该路径从当前所在的路径下作为出发点的路径
* cd .. 回到上级目录
* cd \ 直接回到根目录
* 切换盘符： 输入盘符: 回车

## 简单的java程序
java注释方式
```java
//这种是单行注释，只注释两个斜杠后面的

/*
这是多行注释
这是多行注释
*/

/**
* 类的注释信息
* @version 1.0
* @author chahui
* 可以自动被javadoc.exe命令解析提取并生成到帮助文档中
*/

```

使用javac编译.java文件生成.class文件，再使用java运行。java+类名（后面不加.class）

```java
public class Test{ //声明/定义一个公开的类，起个名字叫Test
	//这个大括号里面叫类体，方法必须放在类体中，不能放到类体外面
	//下面这一段被称作main方法（程序的入口）,任何程序都必须要有一个入口。
	public static void main(String[] args){
	//上面这行也可以写成 public static void main(String args[])，但不推荐
	//这个大括号里面叫方法体，由一行一行的java语句构成，必须以英文分号;结尾，代表一条语句的结束
	//方法体内的代码遵循自上而下的顺序依次逐行执行
		System.out.println("Test1");
		//System.out.println();向控制台输出一句话，如果小括号里的内容是一个字符串的话必须使用英文双引号""括起来
		System.out.println("Test2");
	}
	// 方法2
	// 方法3
	// 方法4
	//不能定义名称一样的方法
}
```

以下程序可以编译通过，但是无法运行，符合语法规则
提示错误：在类Test2中找不到main方法
```java
public class Test2{

}
```

以下程序没有语法错误，能够编译通过，但是不能运行。
```java
public class Test3{
	static void main(String[] args){

	}
}
```

对于主函数来说，只有args可以改名字，其他的必须一样
```java
public class Test4{
	public static void main(String[] chahui){
		System.out.println("helloworld");
	}
}
```

四则运算`+-*/`
```java
public class Test7{
	public static void main(String[] args){
		System.out.println(100);
		System.out.println("100");
		//上面两行都是输出100,表面输出一样，实际一个是数字一个是字符串，只有数字可以进行+-*/的四则运算
		System.out.println(100+200); //300
		System.out.println(200-100); //100
		System.out.println(100*200); //20000
		System.out.println(200/100); //2
	}
}
```

public class 和 class 的区别
```java
class A{

}
class B{

}
class C{

}
class D{

}
public class Test8{

}
```
* 一个java源文件中可以定义多个class
* public的类不是必须的，可以没有。但如果有，public修饰的类名必须和源文件名一致
* 在源文件中只要有一个class的定义，那么必然会对应生成一个class文件
* public的类只能有一个


# 标识符与关键字
## 标识符
标识符可以标识：类名 方法名 变量名 接口名 常量名
凡是自己有权利命名的单词都是标识符
```java
public class BiaoShiFuTest{
	//main是一个方法的名称，属于标识符，但不能修改
	public static void main(String[] args){
	
	}
	//doSome是一个方法名
	public static void doSome(){
		//k,nianLing是一个变量名
		int k=100;
		int nianLing=20;
	}
}
```

### 标识符的命名规则
* 标识符只能由数字、字母（包括中文)、下划线_、美元符号$组成，不能含有其他符号。
* 标识符不能以数字开头
* 关键字不能做标识符，例如public,class,static,void
* 标识符严格区分大小写
* 标识符理论上没有长度限制

```java
class 123ABC{
	//编译错误，数字开头的标识符不合法
}
class Hello World{
	//编译错误，标识符中不能含有空格
}
class _A{
	//合法
}
class _$114514chahui弔{
	//合法
}
class public{
	//编译错误，关键字不能做标识符
}
class public1{
	//合法
}

```
以下程序在Linux环境下编译后会生成两个文件，而在windows环境下只会生成一个。可能是资源管理器不区分大小写的原因
所以尽量不要让类名相同
```java
class A{

}
class a{

}
```
文件名可以任意，比如123.java，但其中不能定义public的类，因为public类名必须与源文件名保持一致。
### 命名规范
与命名规则的区别：命名规则是语法，不遵守就会编译报错。不遵守命名规范，代码也可以编译通过。统一按照规范进行的话，代码的可读性很好，容易让其他开发人员理解。
具体的命名规范：
- 见名知意，一眼能看出表示什么
- 遵循驼峰命名方式，有利于单词与单词之间很好地进行分隔。例如BiaoShiFuTest
- 类名、接口名首字母大写，后面每个单词首字母大写。例如StudentTest
- 变量名、方法名首字母小写，后面每个单词首字母大写。例如nianLing,mingZi
- 所有常量名全部大写，并且单词和单词之间采用下划线衔接。例如USER_AGE 用户年龄，MATH_PI圆周率3.1415926……
```java
public class IdentifierTest{
	public static void main(String[] args){
		int nianLing = 20;
		String mingZi = "zhangsan";
	}
}
```

## 关键字
在SUN公司开发Java语言的时候，提前定义好了一些具有特殊含义的单词，这些单词全部小写，具有特殊含义，不能用作标识符。
严格区分大小写，如Public与public不一样

# 变量
Java中数据被称为字面量。例如10,true,'a',"abc"
字面量可以分为很多种类：
- 整数型字面量：1,2,3,100,-100,-20 ……
- 浮点型字面量：1.3,1.2,3.14 ……
- 布尔型字面量：true,false表示真和假，true表示真，false表示假
- 字符型字面量：‘a’,'b','中'
- 字符串型字面量："abc","a","b","中国"
其中字符型和字符串型都是描述了现实世界中的文字，**所有字符型只能使用单引号，所有的字符串型只能使用双引号**
字符串一定是**单个字符**才能成为字符型。

```java
public class VarTest01{
	public static void main(String[] args){
		System.out.println(100);
		System.out.println(3.14);
		System.out.println(true);
		System.out.println(false);
		System.out.println('a');
		System.out.println('中');
		System.out.println("abc");
		System.out.println("国");//这是字符串型
		//编译报错，ab是一个串，不是字符型，不能用单引号
		//System.out.println('ab');
	}
}
```

javadoc的使用
在文件中加入如下注释内容
```java
/**
* 这是一个类
*  @author chahui
*  @version 1.5
*  @since 1.0
*/
public class Test{
	/**
	* 这是一个程序的入口
	* @param args是main方法的参选
	*/
	public static void main(String[] args){
		
	}
}
```

运行
```shell
javadoc -d javaapi Test.java
```
其中javaapi为存放的文件夹，Test.java为编译的程序

变量其实就是内存当中存储数据最基本的单元
在Java语言中任何数据都是有数据类型的，不同的数据类型，在内存中分配的大小空间不同。
变量的三要素：
- 数据类型，决定空间的大小
- 名字，标识符，方便以后访问
- 保存的值，变量保存的数据

变量的声明定义：数据类型+变量名
在Java中，变量声明后必须赋值才能访问。变量可以声明的时候赋值，一行上可以同时声明多个变量

```java
public class VarTest02{
	public static void main(String[] args){
		int nianLing;
		//System.out.println(nianLing);
		//编译报错，未初始化变量
		nianLing = 45;
		System.out.println(nianLing);
		//变量可以重复赋值
		nianLing = 80;
		System.out.println(nianLing);
		
		int weight = 80;
		System.out.println(weight);
	}
}
```

```java
//自上而下
public class VarTest03{
	public static void main(String[] args){
		//错误
		System.out.println(k);
		int k=10;
	}
}
```

```java
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
```

变量的分类：
- 局部变量：在方法体当中声明的变量，只在方法体当中有效，方法体执行结束该变量的内存就释放了。
- 成员变量：在方法体之外，类体内声明的变量。
重点依据是声明的位置

```java
public class VarTest07{
	//成员变量
	int i = 100;
	//主方法
	public static void main(String[] args){
		//局部变量
		int k = 100;//main方法结束k内存空间释放
	}
}
```

变量的作用域：出了大括号就不认识了
就近原则，哪个离得近就访问哪个
```java
public class VarTest08{
	int i = 10000;
	public static void main(String []args){
		int i = 100;
		System.out .println(i);//就近原则，所以这里输出应该是100
		int i = 90;//同一个域中不允许
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
		System.out.println(i);//无法访问
		int i = 200;//这个i和main方法中的i不在同一个域中，不冲突
	}
}
```


# 数据类型

数据类型用来声明变量，程序在运行过程中根据不同的数据类型分配不同大小的空间。
在Java中数据类型有两种：
- 基本数据类型（4大类8小种）：
	- 整数型 byte,short,int,long
	- 浮点型 float,double
	- 布尔型 boolean 只有两个值true和false
	- 字符型 char 必须用单引号括起来
- 引用数据类型

| 类型      | 占字节数(byte) | 默认值      |
| ------- | ---------- | -------- |
| byte    | 1          | 0        |
| short   | 2          | 0        |
| int     | 4          | 0        |
| long    | 8          | 0L       |
| float   | 4          | 0.0f     |
| double  | 8          | 0.0      |
| boolean | 1          | false    |
| char    | 2          | '\u0000' |

## 字符型char

- char占用2个字节
- char的取值范围：[0,65535]
- char采用unicode编码方式
- char类型的字面量使用单引号括起来
- char可以存储一个汉字
```java
public class CharTest01{
	public static void main(String[] args){
		char c1='中';
		System.out.println(c1);
		char c2='a';
		System.out.println(c2);
		char c3='0';
		System.out.println(c3);
		//char c4="a";
		//错误，字符常量要用单引号括起来
		//char c5='ab';
		//错误，字符常量只能有一个字符
	}
}
```

```java
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

```

## 整数型int

```java
public class IntTest01 {
    public static void main(String[] args) {
        //十进制
        int a = 10;
        System.out.println(a);

        //八进制
        int b = 010;
        System.out.println(b);

        //十六进制
        int c = 0x10;
        System.out.println(c);
        int x = 16;
        System.out.println(x);

        //二进制
        int d = 0b10;
        System.out.println(d);
    }
}

```

在任何情况下，整数型的“字面量/数据”默认被当作int类型处理。如果希望被当作long来处理，需要在后面添加L

```java
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

```

小容量可以直接赋值给大容量，但大容量不能直接赋值给小容量，需要使用强制类型转换符进行强转。运行时可能会损失精度。

```java
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

```

当这个整数型字面量没有超出byte的取值范围，那么这个整数型字面量可以直接赋值给byte类型的变量

```java
public class IntTest04 {
    public static void main(String[] args) {
        //错误
        //byte b = 300;

        //300对应的二进制是：00000000 00000000 00000001 00101100
        //byte类型只能存储8位，所以只取后8位：00101100
        byte b = (byte)300;
        System.out.println(b);//44

        byte x = 1;
        System.out.println(x);
        byte y = 127;
        System.out.println(y);
        //错误
        //byte z = 128;

        short s = 1;
        System.out.println(s);
        short s1 = 32767;
        System.out.println(s1);
        //错误
        //short s2 = 32768;
    }
}

```

- 当一个整数赋值给char类型变量的时候，会自动转换成char字符型，最终的结果是一个字符。
- 当一个整数没有超出byte,short,char取值范围的时候，这个整数可以直接赋值给变量。

```java
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
```

二进制原码反码补码
```java
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

```

byte,short,char做混合运算的时候，各自先转换成int再做计算
```java
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

```

除上面情况，多种数据类型做混合运算的时候，最终结果的类型是最大容量对应的类型
```java
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

```

## 浮点型


| float  | 单精度 | 4字节 | 容量大 |
| ------ | --- | --- | --- |
| double | 双精度 | 8字节 | 更精确 |
精度更高的类型 java.math.BigDecimal，常用于财务
float和double储存的都是近似值
java中规定，任何一个浮点数据默认被当作double来处理。如果想转为float，需要在字面量后面加f或F
```java
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

```
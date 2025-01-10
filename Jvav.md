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

变量的声明定义：数据类型 变量名：int nianLing
在Java中，变量声明后必须赋值才能访问。变量可以声明的时候赋值

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
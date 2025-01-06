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

标识符的命名规则
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

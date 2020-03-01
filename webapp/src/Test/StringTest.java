package Test;

import static java.lang.String.*;

//Object String
public class StringTest {

    public static void main(String[] args){
        //Object类
        Object obj=new Object();
        Object obj1=new Object();
        //hashCode
        System.out.println(obj.hashCode());
        //getClass()
        System.out.println(obj.getClass());
        //String toString()
        System.out.println(obj.toString());
        System.out.println(obj1.toString());
        //String类
        // “==”比较两个变量本身的值，即两个对象在内存中的首地址
        //“equals()”比较字符串中所包含的内容是否相同
        String s1=new String("hello");
        String s3=new String("hello");
        String s2="hello";
        String s4="hello";
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true
        System.out.println(s3==s2);//false
        System.out.println(s4==s2);//true
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s4));
        //String 类的几种判断方法
        //equals equalsIgnoreCase contains startWith endsWith isEmpty()
        String s5="woshifengfengc";
        String s6="Woshifengfeng";
        String s7="fengfeng11";
        char c='c';
        System.out.println(s5.equalsIgnoreCase(s6));//true
        System.out.println(s5.contains(s7));//true
        System.out.println(s5.startsWith("wo"));//true
        System.out.println(s5.endsWith("feng"));//true
        System.out.println(s5.isEmpty());//true
        //String 获取功能 字符打印？？？
        //length charAt indexof
        System.out.println(s5.length());//13
        System.out.println(s5.charAt(1));//o
        System.out.println(s5.indexOf(99));//'c'=99
        System.out.println(s5.indexOf("feng"));
        System.out.println(s5.substring(1));
        //String类转换功能 大小写toUpperCase toLowerCase 字符、数字转换为字符串 valueof ，连接 concat
        //
        System.out.println(s5.getBytes());
        System.out.println(s5.toCharArray());
        String s11=String.valueOf(new char[]{'1', '2', '3'});
        String hello="HELLO".toUpperCase();
        String war="WAR".toLowerCase();

        System.out.println(hello);
        System.out.println(hello.concat("world"));
        //替换 replace replaceAll
        System.out.println(war.replace('w','W'));
        System.out.println(war.replace("wo","Wo"));
        System.out.println(war.replaceAll("w","M"));
        System.out.println(war.compareTo(hello));
        String java="java";
        String maxString="java1java2java";
        int index=maxString.indexOf(java);
        System.out.println(maxString.indexOf(java));
        System.out.println(maxString.substring(index+java.length()));
        war=war.toLowerCase();
        System.out.println(war);
        System.out.println(maxString.substring(index+java.length()).indexOf(java));


    }
}

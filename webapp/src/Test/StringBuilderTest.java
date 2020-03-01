package Test;

public class StringBuilderTest {
    public static void main(String[]args){
        //构造StringBuilder append  insert
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder(2);
        StringBuilder sb3= sb1.append(1234);
        StringBuilder sb4=new StringBuilder("Hello");

        System.out.println(sb1.append(123).toString());
        System.out.println(sb2.append(1324));
        System.out.println(sb3);
        System.out.println(sb3.insert(3,"wolrd"));
        //delete deleteCharAt
        System.out.println(sb3.deleteCharAt(3));
        System.out.println(sb3.delete(3,"world".length()));
        //reverse
        String sd="World";
        StringBuilder ss=new StringBuilder(sd);
        System.out.println(ss.reverse());
        //replace
        System.out.println(sd);
        System.out.println(ss.replace(1,2,"WWW"));
        //substring
        System.out.println(ss.substring(1));

    }
}

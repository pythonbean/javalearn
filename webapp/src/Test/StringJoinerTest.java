package Test;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[]args){
        String[]names={"wangff","lei","hong"};
        var sj=new StringJoiner(",","Hello ","!!!");
        for(String name:names){
            sj.add(name);

        }
        System.out.println(sj.toString());
        String table="employee";
        String[] fields={"name","position","salary"};

        String select=buildSelectSql(table,fields);
        System.out.println(select);

    }
    static String buildSelectSql(String table,String[] fields)
    {
        var sj1=new StringJoiner(", ","SELECT "," FROM "+table);
        for(String field:fields)
        {
            sj1.add(field);
        }
        return sj1.toString();
    }
}

package com;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SYSDate {
    public SYSDate(){}

    public String OldTime(String s){
        if(s==null || s.length()==0) return s;
        String[] s1=s.split("\\s+");
        if (s1.length<=1) return s1[0];
        return s1[1];
    }

    public String NewTime(String s){
        if (s==null ||s.length()==0) return s;
        String[] s1 = s.split("\\s+");
        return s1[0];
    }

    public String update(String s){
        String str;
        Date d=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmm");
        if(!s.equals("")){
            str=simpleDateFormat.format(d)+" "+NewTime(s);
        }
        else{
            str=simpleDateFormat.format(d);
        }
        return str;
    }

    public static void main(String args[]){
        SYSDate d=new SYSDate();
        System.out.println(d);
    }
}

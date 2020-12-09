package com;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class student {
    private String studentid;
    private int counter;
    private String values;
    private String action;
    private String time;

    public student(){}

    public void setStudentid(String studentid){
        this.studentid=studentid;
    }

    public String getStudentid(){
        return this.studentid;
    }

    public void setCounter(int counter){
       this.counter=counter;
    }

    public int getCounter(){
        return this.counter;
    }

    public void setValues(String values){
        this.values=values;
    }

    public String getValues(){
        return this.values;
    }

    public void setAction(String action){
        this.action=action;
    }

    public String getAction(){
        return this.action;
    }

    public void setTime(String time){
        this.time=time;
    }

    public String getTime(){
        return this.time;
    }
}

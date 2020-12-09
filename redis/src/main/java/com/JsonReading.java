package com;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class




JsonReading {
    private String path;
    private String JsonStr;
    private JSONObject jobj;

    public JsonReading(String path) throws IOException {
        File jsonFile = new File(path);
        FileReader fileReader = new FileReader(jsonFile);
        Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
        int ch = 0;
        StringBuffer sb = new StringBuffer();
        while((ch = reader.read()) != -1) {
            sb.append((char) ch);
        }
        fileReader.close();
        reader.close();
        this.JsonStr = sb.toString();
        this.jobj = JSON.parseObject(this.JsonStr);
        this.path=path;
    }

    public String getStr(){
        return this.JsonStr;
    }

    public JSONObject getJobj(){
        return this.jobj;
    }

    public List<student> getStudents() {
        ArrayList<student> students = new ArrayList<student>();
        Iterator iterator = this.jobj.keySet().iterator();
        while(iterator.hasNext()) {
            student student1 = new student();
            String key = (String) iterator.next();
            JSONObject helper = this.jobj.getJSONObject(key);
            student1.setStudentid(key);
            student1.setCounter(helper.getIntValue("studentNum"));
            student1.setValues(helper.getString("description"));
            student1.setAction(helper.getString("Action"));
            student1.setTime("");

            students.add(student1);
        }

        return students;
    }
}

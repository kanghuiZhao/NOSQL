package com;

import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String args[]) throws Exception {
        JsonReading reader = new JsonReading(JsonReading.class.getClassLoader().getResource("student.json").getPath());
        redisencap getjson = new redisencap();

        getjson.loading();

        List<student>students = reader.getStudents();

        for (student s:students){
            getjson.action(s);
        }

        System.out.println("\n");
        int i=0;
        int increase=1;
        int decrease=1;
        while(i==0){
            System.out.println("1.Add(default:1)");
            System.out.println("2.Set increment");
            System.out.println("3.Displays the current total");
            System.out.println("4.Reduce(default:1)");
            System.out.println("5.Set reduction");
            System.out.println("0.Exit");
            System.out.println("Please enter the corresponding operation number：");

            Scanner input=new Scanner(System.in);
            String choice=input.nextLine();
            switch (choice){
                case "1":{
                    getjson.increase("NUM",increase);
                    System.out.println("Current system hits:" + getjson.getInt());
                    break;
                }
                case "2":{
                    System.out.println("Please input the increase amount：");
                    Scanner in=new Scanner(System.in);
                    increase=Integer.valueOf(in.nextLine());
                    break;
                }
                case "3":{
                    System.out.println("Current system hits:" + getjson.getInt());
                    break;
                }
                case "4":{
                    getjson.dec("NUM",decrease);
                    System.out.println("Current system hits" + getjson.getInt());
                    break;
                }
                case "5":{
                    System.out.println("Please enter the reduction:\n");
                    Scanner in=new Scanner(System.in);
                    decrease=Integer.valueOf(in.nextLine());
                    break;
                }
                case "0":{
                    i=1;
                    break;
                }
            }
        }
        getjson.save();
    }
}

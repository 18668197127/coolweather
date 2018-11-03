package com.example.lib2;


import com.example.lib2.gson.PersonData;
import com.example.lib2.gson.Result;
import com.example.lib2.gson.SchoolInfo;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MyClass {

    public static void main(String[] args) throws Exception {
        Result result=new Result();
        result.setResult(1);
        PersonData personData=new PersonData();
        personData.setName("nate");
        personData.setAge(12);
        personData.setUrl("https://www.imooc.com/video/8331");
        List<SchoolInfo> schoolInfos =new ArrayList<SchoolInfo>();
        SchoolInfo schoolInfo1=new SchoolInfo();
        schoolInfo1.setSchool_name("清华");
        SchoolInfo schoolInfo2=new SchoolInfo();
        schoolInfo2.setSchool_name("北大");
        schoolInfos.add(schoolInfo1);
        schoolInfos.add(schoolInfo2);
        personData.setSchoolInfos(schoolInfos);
        result.setPersonData(personData);

        Gson gson=new Gson();
        String js=gson.toJson(result);
        System.out.println(js);
        System.out.println("清华");
    }

}

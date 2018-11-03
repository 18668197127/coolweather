package com.example.lib2.gson;

import java.util.List;

public class PersonData {
    public String name;
    public int age;
    public String url;
    public List<SchoolInfo> schoolInfos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<SchoolInfo> getSchoolInfos() {
        return schoolInfos;
    }

    public void setSchoolInfos(List<SchoolInfo> schoolInfos) {
        this.schoolInfos = schoolInfos;
    }
}

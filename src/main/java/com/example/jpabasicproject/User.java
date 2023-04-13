package com.example.jpabasicproject;
@Entity
public class User {
     int userId;
    String name;
    int age;
     String mobNo;
    public User(int userId, String name, int age, String mobNo){
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}

package com.example.emile_employee_app;

public class Employee {

    private String Name;
    private String Dept;
    private String Mail;
    private String District;
    private String Password;
    private int Photo;

    public Employee() {
    }

    public Employee(String name, String dept, String mail, String district, String password, int photo) {
        Name = name;
        Dept = dept;
        Mail = mail;
        District = district;
        Password = password;
        Photo = photo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}

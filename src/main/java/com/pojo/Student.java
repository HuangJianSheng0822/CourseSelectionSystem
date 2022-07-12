package com.pojo;


public class Student {

  private String stuId;
  private String stuPwd;
  private String stuName;
  private String stuSex;
  private String stuCardId;
  private String stuClass;

  public Student() {
  }

  public Student( String stuId , String stuPwd , String stuName , String stuSex , String stuCardId , String stuClass ) {
    this.stuId = stuId;
    this.stuPwd = stuPwd;
    this.stuName = stuName;
    this.stuSex = stuSex;
    this.stuCardId = stuCardId;
    this.stuClass = stuClass;
  }

  public String getStuId() {
    return stuId;
  }

  public void setStuId(String stuId) {
    this.stuId = stuId;
  }


  public String getStuPwd() {
    return stuPwd;
  }

  public void setStuPwd(String stuPwd) {
    this.stuPwd = stuPwd;
  }


  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }


  public String getStuSex() {
    return stuSex;
  }

  public void setStuSex(String stuSex) {
    this.stuSex = stuSex;
  }


  public String getStuCardId() {
    return stuCardId;
  }

  public void setStuCardId(String stuCardId) {
    this.stuCardId = stuCardId;
  }


  public String getStuClass() {
    return stuClass;
  }

  public void setStuClass(String stuClass) {
    this.stuClass = stuClass;
  }

}

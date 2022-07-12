package com.pojo;


public class Teacher {

  private String teaId;
  private String teaPwd;
  private String teaName;
  private String teaTitle;
  private String teaSex;

  public Teacher() {
  }

  public Teacher( String teaId , String teaPwd , String teaName , String teaTitle , String teaSex ) {
    this.teaId = teaId;
    this.teaPwd = teaPwd;
    this.teaName = teaName;
    this.teaTitle = teaTitle;
    this.teaSex = teaSex;
  }

  public String getTeaId() {
    return teaId;
  }

  public void setTeaId(String teaId) {
    this.teaId = teaId;
  }


  public String getTeaPwd() {
    return teaPwd;
  }

  public void setTeaPwd(String teaPwd) {
    this.teaPwd = teaPwd;
  }


  public String getTeaName() {
    return teaName;
  }

  public void setTeaName(String teaName) {
    this.teaName = teaName;
  }


  public String getTeaTitle() {
    return teaTitle;
  }

  public void setTeaTitle(String teaTitle) {
    this.teaTitle = teaTitle;
  }


  public String getTeaSex() {
    return teaSex;
  }

  public void setTeaSex(String teaSex) {
    this.teaSex = teaSex;
  }

}

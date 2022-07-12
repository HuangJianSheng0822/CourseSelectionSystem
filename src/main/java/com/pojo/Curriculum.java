package com.pojo;


public class Curriculum {

  private String curId;
  private String curName;
  private String curBefore;
  private String curScore;
  private String teaId;
  public Curriculum() {
  }

  public Curriculum( String curId , String curName , String curBefore , String curScore , String teaId ) {
    this.curId = curId;
    this.curName = curName;
    this.curBefore = curBefore;
    this.curScore = curScore;
    this.teaId = teaId;
  }

  public String getCurId() {
    return curId;
  }

  public void setCurId(String curId) {
    this.curId = curId;
  }


  public String getCurName() {
    return curName;
  }

  public void setCurName(String curName) {
    this.curName = curName;
  }


  public String getCurBefore() {
    return curBefore;
  }

  public void setCurBefore(String curBefore) {
    this.curBefore = curBefore;
  }


  public String getCurScore() {
    return curScore;
  }

  public void setCurScore(String curScore) {
    this.curScore = curScore;
  }

  public String getTeaId() {
    return teaId;
  }

  public void setTeaId( String teaId ) {
    this.teaId = teaId;
  }
}

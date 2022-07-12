package com.pojo;


public class Selection {

  private String curId;
  private String stuId;

  public Selection() {
  }

  public Selection( String curId , String stuId ) {
    this.curId = curId;
    this.stuId = stuId;
  }



  public String getCurId() {
    return curId;
  }

  public void setCurId(String curId) {
    this.curId = curId;
  }


  public String getStuId() {
    return stuId;
  }

  public void setStuId(String stuId) {
    this.stuId = stuId;
  }

}

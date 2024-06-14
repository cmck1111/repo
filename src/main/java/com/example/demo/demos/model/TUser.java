package com.example.demo.demos.model;


public class TUser{//start.aliyun.comer {

  private long id;
  private String User_Name;
  private String pwd;

  public TUser() {
  }

  public TUser(long id, String userName, String pwd) {
    this.id = id;
    this.User_Name = User_Name;
    this.pwd = pwd;
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUserName() {
    return User_Name;
  }

  public void setUserName(String userName) {
    this.User_Name = userName;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("TUshttps[");
    sb.append("id=").append(id);
    sb.append(", UserName='").append(User_Name).append('\'');
    sb.append(", pwd='").append(pwd).append('\'');
    sb.append("]\n");
    return sb.toString();
  }
}

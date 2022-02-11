package org.mybatis.internal.example.pojo;

public class User {

  String name;
  String id;
  String lfPartyId;
  String partyName;
  String username;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLfPartyId() {
    return lfPartyId;
  }

  public void setLfPartyId(String lfPartyId) {
    this.lfPartyId = lfPartyId;
  }

  public String getPartyName() {
    return partyName;
  }

  public void setPartyName(String partyName) {
    this.partyName = partyName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public static class UserMapper {


  }
}

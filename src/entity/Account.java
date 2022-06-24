package entity;

import java.util.ArrayList;
import java.util.Calendar;

import util.Inventory;

public class Account {
  private Calendar creationDate;
  private Inventory<Game> inventory = new Inventory<Game>();
  private String bio = "";
  private String password = "";
  private String username = "";

  public void addGame(Game game) {
    inventory.add(game);
  }

  public void removeGame(Game game) {
    inventory.remove(game);
  }

  public ArrayList<Game> getGames() {
    return inventory.get();
  }

  public Inventory<Game> getInventory() {
    return inventory;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}

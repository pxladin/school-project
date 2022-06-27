package entity;

import java.util.ArrayList;

import util.Inventory;

public class Account {
  private Inventory<Game> inventory = new Inventory<Game>();
  private String username = "";

  public void addGame(Game game) {
    inventory.add(game);
  }

  public ArrayList<Game> getGames() {
    return inventory.get();
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}

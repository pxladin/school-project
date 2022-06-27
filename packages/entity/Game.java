package entity;

public class Game {
  private byte fsk;
  private double price;
  private String genre;
  private String title;

  public String toString() {
    return String.format("Titel: %s\nGenre: %s\nFSK: %s\nPreis: %s", title, genre, fsk, price);
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public byte getFsk() {
    return fsk;
  }

  public void setFsk(byte fsk) {
    this.fsk = fsk;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}

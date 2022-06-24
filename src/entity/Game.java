package entity;

public class Game {
  private byte fsk;
  private double price;
  private double size;
  private short realeaseYear;
  private String genre;
  private String title;
  private String version;

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getSize() {
    return size;
  }

  public void setSize(double size) {
    this.size = size;
  }

  public int getReleaseYear() {
    return realeaseYear;
  }

  public void setReleaseYear(short releaseYear) {
    this.realeaseYear = releaseYear;
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

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

}

package util;

public class Metadata {
  private double hours = 0d;
  private int id;

  public Metadata(int id) {
    this.id = id;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  public int getId() {
    return id;
  }
}

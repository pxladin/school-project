package util;

import java.util.ArrayList;

public class Inventory<T> {
  private ArrayList<T> items = new ArrayList<T>();
  private int currentId = 0;

  public ArrayList<T> get() {
    return items;
  }

  public void add(T item) {
    currentId += 1;

    items.add(item);
  }

  public void remove(T item) {
    items.remove(item);
  }

  public void clear() {
    items.clear();
  }
}

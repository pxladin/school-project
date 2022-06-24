package util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {
  private ArrayList<T> items = new ArrayList<T>();
  private int currentId = 0;
  private Map<T, Metadata> metadata = new HashMap<T, Metadata>(1000);

  public ArrayList<T> get() {
    return items;
  }

  public void add(T item) {
    currentId += 1;

    items.add(item);
    metadata.put(item, new Metadata(currentId));
  }

  public void remove(T item) {
    items.remove(item);
    metadata.remove(item);
  }

  public void clear() {
    items.clear();
    metadata.clear();
  }

  public Metadata getMetadata(T item) {
    return metadata.get(item);
  }
}

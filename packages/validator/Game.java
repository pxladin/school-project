package validator;

import java.util.function.Predicate;

import util.Util;

public final class Game {
  public static final String NO_EMPTY_GENRE = "Das Genre darf nicht leer sein.";
  public static final String NO_EMPTY_TITLE = "Der Titel darf nicht leer sein.";
  public static final String INVALID_PRICE = "Der Preis darf nicht kleiner als 0 sein.";
  public static final String INVALID_FSK = "Die FSK muss größer als 0 sein.";

  public static final Predicate<String> genre = (input) -> {
    if (input.isEmpty()) {
      Util.println(NO_EMPTY_GENRE);

      return false;
    }

    return true;
  };

  public static final Predicate<String> title = (input) -> {
    if (input.isEmpty()) {
      Util.println(NO_EMPTY_TITLE);

      return false;
    }

    return true;
  };

  public static final Predicate<Float> price = (input) -> {
    if (input < 0f) {
      Util.println(INVALID_PRICE);

      return false;
    }

    return true;
  };

  public static final Predicate<Byte> fsk = (input) -> {
    if (input < 0) {
      Util.println(INVALID_FSK);

      return false;
    }

    return true;
  };
}

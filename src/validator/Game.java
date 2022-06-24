package validator;

import java.util.function.Predicate;

import util.Util;

public final class Game {
  public static final Predicate<String> name = (input) -> {
    if (input.isEmpty()) {
      Util.println("Der Name darf nicht leer sein.");

      return false;
    }

    return true;
  };
}

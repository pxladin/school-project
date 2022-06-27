package validator;

import java.util.function.Predicate;

import util.Util;

public final class Account {
  public static final String NO_EMPTY_USERNAME = "Der Username darf nicht leer sein.";

  public static final Predicate<String> username = (input) -> {
    if (input.isEmpty()) {
      Util.println(NO_EMPTY_USERNAME);

      return false;
    }

    return true;
  };
}

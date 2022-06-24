package validator;

import java.util.function.Predicate;

import util.Util;

public final class Account {
  public static final Predicate<String> password = (input) -> {
    if (input.isEmpty()) {
      Util.println("Das Passwort darf nicht leer sein.");

      return false;
    }

    if (input.length() < 6) {
      Util.println("Das Passwort muss mindestens 6 Zeichen lang sein.");

      return false;
    }

    return true;
  };

  public static final Predicate<String> username = (input) -> {
    if (input.isEmpty()) {
      Util.println("Der Username darf nicht leer sein.");

      return false;
    }

    return true;
  };
}

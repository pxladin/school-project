package util;

import java.util.function.Predicate;

public abstract class Util {
  public static void println(String message, Object... args) {
    System.console().printf(message + "\n", args);
  }

  public static String ask(String message) {
    return System.console().readLine(message);
  }

  public static String ask(String message, Predicate<String> verifier) {
    String input = ask(message);

    while (!verifier.test(input)) {
      input = ask(message);
    }

    return input;
  }
}

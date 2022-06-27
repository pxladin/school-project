package util;

import java.util.function.Predicate;

public abstract class Util {
  public static void println(String message, Object... args) {
    System.console().printf(message + "\n", args);
  }

  public static void print(String message, Object... args) {
    System.console().printf(message, args);
  }

  public static String ask(String message) {
    return System.console().readLine(message);
  }

  public static void clearConsole() {
    String CLEAR_SCREEN = "\033[2J";
    String RESET_CURSOR = "\033[0;0H";

    System.out.print(CLEAR_SCREEN + RESET_CURSOR);
    System.out.flush();
  }

  public static String ask(String message, Predicate<String> verifier) {
    String input = ask(message);

    while (!verifier.test(input)) {
      input = ask(message);
    }

    return input;
  }

  public static byte askByte(String message, Predicate<Byte> verifier) {
    String input = ask(message);

    Boolean valid = true;

    byte value = 0;

    try {
      value = Byte.parseByte(input);
    } catch (NumberFormatException e) {
      valid = false;
    }

    while (!valid || !verifier.test(value)) {
      value = askByte(message, verifier);
    }

    return value;
  }

  public static float askFloat(String message, Predicate<Float> verifier) {
    String input = ask(message);

    Boolean valid = true;

    float value = 0;

    try {
      value = Float.parseFloat(input);
    } catch (NumberFormatException e) {
      valid = false;
    }

    while (!valid || !verifier.test(value)) {
      value = askFloat(message, verifier);
    }

    return value;
  }
}

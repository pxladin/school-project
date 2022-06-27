package main;

import java.lang.reflect.Method;

import builder.AccountBuilder;
import builder.GameBuilder;
import entity.Account;
import entity.Game;
import util.Command;
import util.Util;

public class Manager {
  public static Account account;
  public static Boolean closed = false;
  public static Command[] commands = {
      new Command("exit", "Schließt den Spieleverwalter"),
      new Command("help", "Zeigt alle verfügbaren Befehle an"),
      new Command("clear", "Cleared die Konsole"),
      new Command("inv", "Enthält Befehle zur Manipulation deiner Spiele"),
  };

  public static void main(String[] args) {
    Util.println("Erstelle zunächst einen Account.\n");

    account = AccountBuilder.create();

    clear();

    while (!closed) {
      String input = Util.ask("--> ");
      String[] arguments = input.split(" +");

      String command = arguments[0];
      String[] realArguments = new String[arguments.length - 1];

      for (int i = 1; i < arguments.length; i++) {
        realArguments[i - 1] = arguments[i];
      }

      switch (command) {
        case "exit":
          exit();
          break;
        case "help":
          help();
          break;
        case "clear":
          clear();
          break;
        case "inv":
          inv(realArguments);
          break;
        default:
          Util.println("Befehl nicht gefunden.");
          break;
      }

      Util.print("\n");
    }
  }

  public static void inv(String[] arguments) {
    if (arguments.length == 0) {
      Util.println("Folgende Unterbefehle gibt es: get <titel>, create, remove <titel>");

      return;
    }

    String subCommand = arguments[0];

    if (subCommand.equals("get")) {
      account.getGames().forEach((game) -> {
        if (game.getTitle().equals(arguments[1])) {
          Util.println(game.toString());
        }
      });
    } else if (subCommand.equals("create")) {
      Game game = GameBuilder.create();

      account.addGame(game);

      Util.println("Spiel wurde erstellt.");
    } else if (subCommand.equals("remove")) {
      Boolean wasRemoved = account.getGames().removeIf((game) -> game.getTitle().equals(arguments[1]));

      if (!wasRemoved) {
        Util.println("Spiel nicht gefunden.");
      } else {
        Util.println("Spiel wurde entfernt.");
      }
    } else if (subCommand.equals("clear")) {
      account.getGames().clear();
    } else if (subCommand.equals("list")) {
      account.getGames().forEach((game) -> {
        Util.println("%s\n------------", game.toString());
      });
    } else {
      Util.println("Unterbefehl nicht gefunden.");
    }
  }

  public static void help() {
    Util.println("Verfügbare Befehle:");

    for (Command command : commands) {
      Util.println("%s -- %s", command.getName(), command.getDescription());
    }
  }

  public static void exit() {
    closed = true;
  }

  public static void clear() {
    Util.clearConsole();

    Util.println("Willkommen beim Spieleverwalter, %s!", account.getUsername());
  }
}

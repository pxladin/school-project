import java.util.ArrayList;

import builder.AccountBuilder;
import entity.Account;
import util.Util;

public class Manager {
  public static ArrayList<Account> accounts = new ArrayList<Account>();
  public static Account currentAccount;
  public static Boolean closed = false;

  public static void main(String[] args) {
    Util.println("Willkommen beim Spieleverwalter - Hier kannst du mit einem Account deine Spiele verwalten.\n ");

    while (!closed) {
      String input = Util.ask("-> ");
      String command = input.split(" +")[0];

      switch (command) {
        case "login":
          login();
          break;
        case "register":
          register();
          break;
        case "exit":
          closed = true;
          break;
      }
    }
  }

  public static void login() {
    if (accounts.size() == 0) {
      Util.println("Du hast noch keinen Account erstellt.");

      return;
    }

    if (currentAccount != null) {
      Util.println("Du bist bereits angemeldet.");

      return;
    }

    String username = Util.ask("Username: ", validator.Account.username);
    String password = Util.ask("Passwort: ", validator.Account.password);

    for (Account account : accounts) {
      if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
        currentAccount = account;

        Util.println("Du bist nun angemeldet.");

        return;
      }
    }

    Util.println("Falscher Username oder Passwort.");
  }

  public static void register() {
    Account account = AccountBuilder.create();

    accounts.add(account);

    Util.println("Der Account wurde erfolgreich registriert.");

    String choice = Util.ask("Möchtest du dich mit dem Account direkt einloggen? (y/n) ");

    if (choice.equals("y")) {
      currentAccount = account;
    }
  }
}

package builder;

import entity.Account;
import util.Util;

public class AccountBuilder {
  private Account account;

  public AccountBuilder() {
    this.account = new Account();
  }

  public static Account create() {
    AccountBuilder builder = new AccountBuilder()
        .username(Util.ask("Username: ", validator.Account.username));

    return builder.build();
  }

  public Account build() {
    return account;
  }

  public AccountBuilder username(String name) {
    this.account.setUsername(name);

    return this;
  }
}

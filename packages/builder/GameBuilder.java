package builder;

import entity.Game;
import util.Util;

public class GameBuilder {
  private Game game;

  public GameBuilder() {
    this.game = new Game();
  }

  public static Game create() {
    GameBuilder builder = new GameBuilder()
        .fsk(Util.askByte("FSK: ", validator.Game.fsk))
        .price(Util.askFloat("Preis: ", validator.Game.price))
        .genre(Util.ask("Genre: ", validator.Game.genre))
        .title(Util.ask("Titel: ", validator.Game.title));

    return builder.build();
  }

  public Game build() {
    return game;
  }

  public GameBuilder fsk(byte fsk) {
    this.game.setFsk(fsk);

    return this;
  }

  public GameBuilder price(double price) {
    this.game.setPrice(price);

    return this;
  }

  public GameBuilder genre(String genre) {
    this.game.setGenre(genre);

    return this;
  }

  public GameBuilder title(String title) {
    this.game.setTitle(title);

    return this;
  }
}

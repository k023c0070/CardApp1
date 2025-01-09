public class Game {
  Player p;
  Card c;

  Game(){
    p = new Player();
    c = new Card();
  }

  void start(){
    p.turn(c);
    judge();
  }

  void judge(){
    if (c.num >= 10){
      System.out.print("勝ち");
    }
    else {
      System.out.print("負け");
    }
  }
}

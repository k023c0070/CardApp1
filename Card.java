public class Card {
  int mark;
  int num;
  void pull(){
    mark = (int)(Math.random() * 4 + 1);
    num = (int)(Math.random() * 13 + 1);
  }
}

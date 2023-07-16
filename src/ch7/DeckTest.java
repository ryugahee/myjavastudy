package ch7;

class Card {
  final static int KIND_MAX = 4;
  final static int NUM_MAX = 13;
  final static int SPADE = 4;
  final static int DIAMOND = 3;
  final static int HEART = 2;
  final static int CLOVER = 1;

  int kind;
  int number;

  Card() {
    this(SPADE, 1);
  }
  Card(int kind, int number) {
    this.kind = kind;
    this.number = number;
  }

    public  String toString() {
    return "카드 무늬 : " + this.kind + ", 카드 번호 : " + this.number;
    }

}

class Deck {
  final static int CARD_NUM = 52;
  Card[] cardArr = new Card[CARD_NUM];

  Deck () {
    int i = 0;
    for(int k=Card.KIND_MAX; k > 0; k--)
      for(int n=0; n < Card.NUM_MAX; n++)
        cardArr[i++]=new Card(k, n+1);
  }
  Card pick(int idx) {
    return cardArr[idx];
  }
  Card pick() {
    int idx = (int)(Math.random() * CARD_NUM);
    return cardArr[idx];
  }
  void shuffle() {
    for(int i=0; i<cardArr.length; i++) {
      int r = (int)(Math.random() * CARD_NUM);
      Card temp = cardArr[i];
      cardArr[i] = cardArr[r];
      cardArr[r] = temp;
    }
  }
}

public class DeckTest {

  public static void main(String[] args) {
    Deck d = new Deck();
    Card c = d.pick(0);
    System.out.println(c);

    d.shuffle();
    c = d.pick(0);
    System.out.println(c);

  }

}

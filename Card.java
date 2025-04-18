import java.util.*;
import java.io.*;

class Card{

  ArrayList<Integer> cards = new ArrayList<>();
  int suit;
  int rank;
  int id;
  String suitName;
  String rankName;
  int state;
  int value;
  int NUMCARDS;
  int DECK;
  int player;
  int dealer;
  int discard;


  public Card(){
    
  } // end constructor

  public static void main(String[] args){
    Card ca = new Card();
    ca.start();
  } // end main

  public void start(){
    setUpCards();
    randomCard();
    
  } // end start

  public String inCards(int cardNum){
    NUMCARDS = 52;
    String[] RANKNAME = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String[] FILE_RANK_NAME = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
    String[] SUITNAME = {"clubs", "hearts", "spades", "diamonds"};
    String[] STATE = {"deck", "player", "dealer", "discard"};
    int[] VALUE = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    DECK = 0;
    player = 1;
    dealer = 2;
    discard = 3;

    id = cardNum;
    suit = Math.floorDiv(cardNum, 13);
    rank = cardNum % 13;

    suitName = SUITNAME[suit];
    rankName = RANKNAME[rank];

    state = DECK;
    value = VALUE[rank];
    
    String cardName = rankName + "," + suitName + "," + value;

    return cardName;
  } // end inCards

  public int randomCard(){
    Random random = new Random();
    int randomNumber = random.nextInt(52);
    return randomNumber;
  } // end randomCard

  public void playerCards(){
    int num = randomCard();
    if(cards.get(num).equals(0)){
      cards.set(num, 1);
    } // end if
    System.out.print(inCards(num));
  } // end playerCard

  public void dealerCards(){
    int num = randomCard();
    if(cards.get(num).equals(0)){
      cards.set(num, 2);
    } // end if
  } // end dealerCards

  public void discardCards(){
    for(int i = 0; i < 52; i++){
      if(cards.get(i).equals(1) || cards.get(i).equals(2)){
        cards.set(i, 3);
      } // end if
    } // end while
  } // end discardCards
  
  public void setUpCards(){
    for(int i = 0; i < 52; i++){
      cards.add(1);
    } // end for
  } // end setUpCards
} // end card class

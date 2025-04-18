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

  public void randomCard(){
    Random random = new Random();
    int randomNumber = random.nextInt(52);
    cards.get(1);
    if(cards.get(randomNumber).equals(0)){
      cards.set(randomNumber, 1);
    } // end if
  } // end randomCard
  
  public void setUpCards(){
    for(int i = 0; i < 52; i++){
      cards.add(1);
    } // end for
  } // end setUpCards
} // end card class

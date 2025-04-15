import java.util.*;
import java.io.*;

class Card{

  ArrayList<Integer> cards = new ArrayList<>();

  public Card(){
    
  } // end constructor

  public static void main(String[] args){
    Card ca = new Card();
    ca.start();
  } // end main

  public void start(){
    setUpCards();
    Random random = new Random();
    int randomNumber = random.nextInt(52);

  } // end start

  public String inCards(int cardNum){
    int NUMCARDS = 52;
    String[] RANKNAME = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String[] FILE_RANK_NAME = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
    String[] SUITNAME = {"clubs", "hearts", "spades", "diamonds"};
    String[] STATE = {"deck", "player", "dealer", "discard"};

    int DECK = 0;
    int player = 1;
    int dealer = 2;
    int discard = 3;

    int id = cardNum;
    int suit = Math.floorDiv(cardNum, 13);
    int rank = cardNum % 13;

    String suitName = SUITNAME[suit];
    String rankName = RANKNAME[rank];

    int state = DECK;
    int value = rank;
    
    String cardName = rankName + " of " + suitName;

    return cardName;
  } // end inCards
  
  public void setUpCards(){
    for(int i = 0; i < 52; i++){
      cards.add(0);
    } // end for
  } // end setUpCards
} // end card class

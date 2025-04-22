import java.util.*;
import java.io.*;

class Card{

  ArrayList<Integer> cards = new ArrayList<>();
  int suit;
  int rank;
  int id;
  int DECK;
  int PLAYER;
  int DEALER;
  int DISCARD;


  public Card(){
    
  } // end constructor

  public static void main(String[] args){
    Card ca = new Card();
    ca.start();
  } // end main

  public void start(){
    setUpCards();
    for(int i = 0; i < 52; i++){
     playCards(PLAYER);
     printCards(PLAYER);
     discardCards();
    }
  } // end start

  public String inCards(int cardNum){
    String[] RANKNAME = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String[] FILE_RANK_NAME = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
    String[] SUITNAME = {"clubs", "hearts", "spades", "diamonds"};
    String[] STATE = {"deck", "player", "dealer", "discard"};
    int[] VALUE = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    DECK = 0;
    PLAYER = 1;
    DEALER = 2;
    DISCARD = 3;

    id = cardNum;
    suit = Math.floorDiv(cardNum, 13);
    rank = cardNum % 13;

    String suitName = SUITNAME[suit];
    String rankName = RANKNAME[rank];

    int value = VALUE[rank];
    
    String cardName = rankName + "," + suitName + "," + value;

    return cardName;
  } // end inCards

  public int randomCard(){
    Random random = new Random();
    int randomNumber = random.nextInt(52);
    return randomNumber;
  } // end randomCard

  public int playCards(int state){
    int value = -1;
    String cardName;
    int num;
    while(value == -1){
      num = randomCard();
      if(cards.get(num).equals(0)){
        cards.set(num, state);
        cardName = inCards(num);
        String[] cardNames = cardName.split(",");
        value = Integer.parseInt(cardNames[2]);
	      return value;
      } // end if
      checkCards();
    } // end while
    return value;
  } // end playerCard

  public int printCards(int state){
    String cardName;
    String rankName;
    String suitName;
    int value = 0;
    int num = 0;
    for(int i = 0; i < 52; i++){
      if(cards.get(i).equals(state)){
        cardName = inCards(i);
	      String[] cardNames = cardName.split(",");
	      rankName = cardNames[0];
	      suitName = cardNames[1];
        value = Integer.parseInt(cardNames[2]);
	      System.out.println(rankName + " of " + suitName);
        num = num + value;
      } // end if
    } // end for
    return num;
  } // end printPlayer

  public String cardRank(int state){
    String cardName;
    String rankName;
    String cardRanks="";
    int value = 0;
    int num = 0;
    for(int i = 0; i < 52; i++){
      if(cards.get(i).equals(state)){
        cardName = inCards(i);
	      String[] cardNames = cardName.split(",");
	      rankName = cardNames[0];
        cardRanks = rankName + "," + rankName;
      } // end if
    } // end for
    return cardRanks;
  } // end printPlayer

  public void discardCards(){
    for(int i = 0; i < 52; i++){
      if(cards.get(i).equals(1) || cards.get(i).equals(2)){
        cards.set(i, 3);
      } // end if
    } // end for
  } // end discardCards

  public void shuffleCards(){
    for(int i = 0; i < 52; i++){
      cards.set(i, 0);
    } // end for
  } // end shuffleCards

  public void checkCards(){
    Scanner input = new Scanner(System.in);
    int shuffdeck = 0;
    for(int i = 0; i < 52; i++){
      if(cards.get(i).equals(3)){
        shuffdeck = shuffdeck + 3;
      } // end if
    } // end for
    if(shuffdeck > 117){
      shuffleCards();
      shuffdeck = 0;
      System.out.println("\nShuffling");
      input.nextLine();
    } // end if
  } // end checkCards
  
  public void setUpCards(){
    for(int i = 0; i < 52; i++){
      cards.add(0);
    } // end for
  } // end setUpCards
} // end card class

import java.util.*;
import java.io.*;

class Card{

  public Card(){
  int NUMCARDS = 52;
  String[] RANKNAME = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
  String[] FILE_RANK_NAME = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
  String[] SUITNAME = {"clubs", "hearts", "spades", "diamonds"};
  String[] STATE = {"deck", "player", "dealer", "discard"};

  int DECK = 0;
  int player = 1;
  int dealer = 2;
  int discard = 3;
  } // end constructor

  public static void main(String[] args){
    System.out.print(NUMCARDS);
  } // end main



} // end card class

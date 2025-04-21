import java.util.*;
import java.io.*;

class Blackjack extends Card{
  
  User user = new User();
  int bet;

  public Blackjack(){
    
  } // end constructor

  public static void main(String[] args){
    Blackjack BJ = new Blackjack();
    BJ.game();
  } // end main

  public void game(){
    boolean keepGoing = true;
    user.setMoney();
    user.checkMoney();
    setUpCards();
    while(keepGoing){
      if(0 == 0){
        System.out.println("Game Over");
	keepGoing = false;
      } // end if

      playCards(2);
      System.out.print("Dealers Card: ");
      printCards(2);

      playCards(PLAYER);
      playCards(PLAYER);
      System.out.print("Player Cards: ");
      printCards(PLAYER);


    } // end while
  } // end game

  public void hit(){
    
  } // end hit

  public void stand(){
    
  } // end stand

  public void insurance(){
    
  } // end insurance


} // end Blackjack

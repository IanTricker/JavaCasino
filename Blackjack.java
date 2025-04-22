import java.util.*;
import java.io.*;

class Blackjack extends Card{
  
  User user = new User();
  int bet;
  int playVal;
  int dealVal;
  int money;

  public Blackjack(){
    
  } // end constructor

  public static void main(String[] args){
    Blackjack BJ = new Blackjack();
    BJ.game();
  } // end main

  public void game(){
    Scanner input = new Scanner(System.in);
    String response = "0";
    boolean keepGoing = true;
    boolean keepGoing2 = true;
    user.setMoney();
    setUpCards();
    while(keepGoing){
      discardCards();
      money = user.getMon();
      if(money <= 0){
        System.out.println("Game Over");
	keepGoing = false;
      } // end if
      keepGoing2 = true;

      user.checkMoney();
      System.out.print("How much do you bet: ");
      response = input.nextLine();
      bet = tryParseInt(response);

      int topCard = playCards(2);
      System.out.println("\nDealers Card: ");
      dealVal = printCards(2);
      System.out.println("Value: " + dealVal + "\n");

      playCards(PLAYER);
      playCards(PLAYER);
      System.out.println("Player Cards: ");
      playVal = printCards(PLAYER);
      System.out.println("Value: " + playVal + "\n");

      while(keepGoing2){
        if(playVal == 21 && dealVal == 21){
          System.out.println("Tie\n");
	  keepGoing2 = false;
	} // end if
	else if(playVal > 21){
	  subBet();
	  keepGoing2 = false;
	}
	else if(playVal == 21 && dealVal < 21){
	  addBet();
	  keepGoing2 = false;
	} // end if

	else if(topCard == 11){
          topCard = 0;
          System.out.print("Insurance, Hit, Stand: ");
	  String play = input.nextLine().toLowerCase();
	  if(play.equals("insurance")){
            insurance();
	  } // end if
	  if(play.equals("hit")){
            hit();
	  } // end if
	  if(play.equals("stand")){
            stand();
	    keepGoing2 = false;
	  } // end if
	} // end if
	else{
          System.out.print("Hit, Stand: ");
	  String play = input.nextLine().toLowerCase();
	  if(play.equals("hit")){
            hit();
	  } // end if
	  if(play.equals("stand")){
            stand();
	    keepGoing2 = false;
	  } // end if
	} // end else
      } // end while
    } // end while
  } // end game


  public void hit(){
    playCards(PLAYER);
    String[] cardRanks = cardRank(PLAYER).split(",");
    
    System.out.println("\nDealers card: ");
    dealVal = printCards(2);
    System.out.println("Value: " + dealVal + "\n");

    System.out.println("Player Cards: ");
    playVal = printCards(PLAYER);
    for(int i = 0; i < cardRanks.length; i++){
      if(cardRanks[i].equals("Ace") && playVal > 21){
        playVal = playVal - 10;
      } // end if
    } // end for
    System.out.print("Value: " + playVal + "\n");
  } // end hit

  public void stand(){
    Scanner input = new Scanner(System.in);
    if(dealVal > playVal){
      subBet();
    } // end if
    else if(playVal <= 21 && dealVal < playVal && dealVal < 16){
	System.out.println("\nDealers cards: ");
	dealVal = printCards(2);
        System.out.println("Value: " + dealVal + "\n");

	System.out.println("Player Cards: ");
	playVal = printCards(PLAYER);
	System.out.println("Value: " + playVal + "\n");
      while(dealVal < playVal && dealVal < 16){
        playCards(2);
        String[] cardRanks = cardRank(2).split(",");

        System.out.println("\nDealers cards: ");
	dealVal = printCards(2);
	for(int i = 0; i < cardRanks.length; i++){
          if(cardRanks[i].equals("Ace") && dealVal > 21){
            dealVal = dealVal - 10;
	  } // end if
	} // end for
        System.out.println("Value: " + dealVal + "\n");

	System.out.println("Player Cards: ");
	playVal = printCards(PLAYER);
	System.out.println("Value: " + playVal + "\n");
	System.out.println("Press enter to continue");
	input.nextLine();
      } // end while

      if(dealVal == playVal){
        System.out.println("Tie\n");
      } // end if
      else if(dealVal > playVal && dealVal <= 21){
        subBet();
      } // end if
      else{
        addBet();
      } // end else
    } // end if 
    else{
      addBet();
    } // end else
  } // end stand

  public void insurance(){
    if(dealVal == 21){
      System.out.println("Insured\n");
    } // end if
    else{
      subBet();
      stand();
    } // end else
  } // end insurance

  public void addBet(){
    System.out.println("You win $" + bet + "\n");
    user.addMoney(bet);
  } // end addBet

  public void subBet(){
    System.out.println("You lose $" + bet + "\n");
    user.subMoney(bet);
  } // end subBet

  public int tryParseInt(String num){
    try{
      return Integer.parseInt(num);
    } catch(NumberFormatException e){
      return 0;
    } // end try catch
  } // end if

} // end Blackjack

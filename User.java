import java.util.*;
import java.io.*;

class User{
  int money;

  public static void main(String[]args){
    User p1 = new User();
    p1.test();
  } // end main

  public void test(){
    boolean keepGoing = true;
    Scanner input = new Scanner(System.in);
    setMoney();
    while(keepGoing){
      System.out.println();
      System.out.println("0) Quit");
      System.out.println("1) Check Money");
      System.out.println("2) Add Money");
      System.out.println("3) Sub Money");
      String response = input.nextLine();

      if(response.equals("0")){
        keepGoing = false;
      } // end if
      if(response.equals("1")){
        checkMoney();
      } // end if
      if(response.equals("2")){
        System.out.print("Enter money: ");
	int income = input.nextInt();
        addMoney(income);
      } // end if
      if(response.equals("3")){
	System.out.print("Enter money: ");
        int debt = input.nextInt();
	subMoney(debt);
      } // end if 
    } // end keepGoing
  } // end test

  public User(){
    this.money = 0;
  } // end constructor

  public User(int money){
    this.money = money;
  } // end constructor

  public int getMoney(){
    return this.money;
  } // end getMoney

  public void setMoney(){
    Scanner input = new Scanner(System.in);
    System.out.println("What diffucluty do you want");
    System.out.print("Easy, Medium, Hard: ");
    String dif  = input.nextLine().toLowerCase();
    if(dif.equals("easy")){
      this.money = 10000;
    } // end if
    if(dif.equals("medium")){
      this.money = 1000;
    } // end if
    if(dif.equals("hard")){
      this.money = 100;
    } // end if
  } // end setMoney

  public void checkMoney(){
    System.out.println("You have $" + this.money);
  } // end checkMoney

  public void addMoney(int income){
    this.money = this.money + income;
  } // end addMoney

  public void subMoney(int debt){
    this.money = this.money - debt;
  } // end lossMoney
}

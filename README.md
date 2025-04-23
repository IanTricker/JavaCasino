# JavaCasino

## Project Summary
Blackjack game
This project is about making a Blackjack game. In this Blackjack game there will be a dealer, player and a deck. The player has the decision to hit, stand, or if the dealer gets an Ace as the first card they can insure that hand. The dealer will show only the first card till the player stands in which case the dealer will draw till they are at a total value of 16 or above. The dealer and player will compare cards to see in the end to see who has a higher value than the other without going over 21. The deck will be indicative of what cards can be played and were they are in the deck. If the player hits then they will add a card and add the value of that card to there total they can do this till they go over 21. If the player stands the value of the player card will stay the same and the dealer will draw if they are not above and not past 16. If the player has insurance then they will loss money in the case of a Blackjack (the dealer getting 21) and stand. This project is intended for anyone who likes having fun. It also would be good for gamblers and for yonger people. This project could help people with cripling gambling addiction get the high of gambling without the cost. This also could be used for teaching the odds of gambling to yonger people so they will not get into gambling.

## tech and struct
### User class
This class is used to set and add or subtract money. The setMoney() method ask what difficulty and gives money based on what you choose.

### Card class
This class is used as a data base for the cards. I used an array list to hold the cards. 

To make the data base I have a method called setUpCards() which adds 52 zeros to the array list. Zero represents the cards in a deck, one represents cards the player has, two represents cards the dealer has, and three represents discarded cards. 

The inCards(int cardNum) method is used to calculate the what the card is in the deck and output the card name. 

The playCards(int state) takes in the "state" or who the card is going to either the player or dealer and it will get a random number check to see if that card is in the deck still and give you a new card that is in the deck and changes the state in the data base. This method will send back the value of the card.

The printCards(int state) method takes in the state of what you want to output and go through the array list to find all the cards in the data base with the same state and prints it and will return the value of all the cards in that state.

The discardCards() method takes all the cards in the data base that are for the player(1) and dealer(2) and changes them to discard(3).

The shuffleCards() method makes all the cards in the data base deck(0).

The checkCards() method is used to check how many cards are in the discard(3) and if it is over 40 then it will shuffle the deck.


### Blackjack class
The Blackjack method inherits the card class and has an instance of User.

The game() method is used to run the game. It checks the money to make sure that you are above 0. It loops through the if staments to check if you win or lose.

The hit() method is used to add a card to the player hand and add the value.

The stand() method is used to check if the dealer has more or less than the player if less and below 16 the dealer will add cards to his hand till over 16. 

The insurance() method is used to add insurace to your move as a side be if the deal has blackjack. 

The addBet() adds the bet amount to total money.

The subBet() subtracts the bet amount to total money.

## Use case analysis
The users of this game are people who like having fun, have a cripling gambling addiction or people who want to learn how to card count. The user is trying to make as much money as they can without losing it all.

## Data design


## Algorithm


## 

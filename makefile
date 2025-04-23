run: Blackjack.class
	java Blackjack

Blackjack.class: Blackjack.java User.class Card.class
	javac -g Blackjack.java

User.class: User.java
	javac -g User.java

Card.class: Card.java
	javac -g Card.java

clean: 
	rm *.class

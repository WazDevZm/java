package PAST_PAPERS.$2024; // this shows how the packages work with multiple folders



class Card {
    int cardNumber;
    String cardSymbol;

    // a two argument constructor for the card class
    Card (int cardNumber, String cardSymbol) {
        this.cardNumber = cardNumber;
        this.cardSymbol = cardSymbol;
}

}

class Pile {
    Pile () {// write code that creates 52 cards and store them in the Array;
        for (int i = 0; i < 52; i++) {
            int cardNumber = (i % 13) + 1; // card numbers from 1 to 13
            String cardSymbol;
            if (i < 13) {
                cardSymbol = "Hearts";
            } else if (i < 26) {
                cardSymbol = "Diamonds";
            } else if (i < 39) {
                cardSymbol = "Clubs";
            } else {
                cardSymbol = "Spades";
            }
            cardPile[i] = new Card(cardNumber, cardSymbol);
        }
    }
    void shuffle(){ // shuffle the cards in the pile, Objects are passed by reference, so when we shuffle the cards in the pile, we are shuffling the cards in the cardPile array
        for (int i = 0; i < cardPile.length; i++) {
            int randomIndex = (int) (Math.random() * cardPile.length);
            Card temp = cardPile[i];
            cardPile[i] = cardPile[randomIndex];
            cardPile[randomIndex] = temp;
        }

    }
    void printPile(){ // prints all the cards in the pile, we can use a for loop to iterate through the cardPile array and print each card's number and symbol
        for (int i = 0; i < cardPile.length; i++) {
            System.out.println(cardPile[i].cardNumber + " of " + cardPile[i].cardSymbol);
        }

    }
    Card cardPile [] = new Card[52];
}



public class Question_7 {
    public static void main (String[]args) {
        Pile pile = new Pile();
        pile.shuffle();
        pile.printPile(); // trying out the new methods in the pile class, this should print the shuffled cards in the pile
    }
    
}

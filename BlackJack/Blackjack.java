package BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> playerCards = new ArrayList<>();
        ArrayList<Integer> dealerCards = new ArrayList<>();

        // Deal the first two cards to the player and dealer
        playerCards.add((int) (Math.random() * 10 + 1));
        dealerCards.add((int) (Math.random() * 10 + 1));
        playerCards.add((int) (Math.random() * 10 + 1));
        dealerCards.add((int) (Math.random() * 10 + 1));

        // Show the player their cards and the value of their hand
        System.out.println("Your cards are: " + playerCards);
        int playerHand = 0;
        for (int card : playerCards) {
            playerHand += card;
        }
        System.out.println("Your hand is worth: " + playerHand);

        // Ask the player if they want to hit or stand
        System.out.println("Do you want to hit or stand?");
        String playerChoice = input.nextLine();
        while (playerChoice.equals("hit")) {
            int newCard = (int) (Math.random() * 10 + 1);
            playerCards.add(newCard);
            playerHand += newCard;
            System.out.println("Your cards are now: " + playerCards);
            System.out.println("Your hand is worth: " + playerHand);
            if (playerHand > 21) {
                System.out.println("Bust! You lose.");
                return;
            }
            System.out.println("Do you want to hit or stand?");
            playerChoice = input.nextLine();
        }

        // Show the dealer's cards and play out the dealer's hand
        System.out.println("Dealer's cards are: " + dealerCards);
        int dealerHand = 0;
        for (int card : dealerCards) {
            dealerHand += card;
        }
        while (dealerHand < 17) {
            int newCard = (int) (Math.random() * 10 + 1);
            dealerCards.add(newCard);
            dealerHand += newCard;
        }
        System.out.println("Dealer's hand is worth: " + dealerHand);

        // Determine the winner
        if (dealerHand > 21) {
            System.out.println("Dealer busts! You win.");
        } else if (dealerHand > playerHand) {
            System.out.println("Dealer wins.");
        } else if (dealerHand < playerHand) {
            System.out.println("You win.");
        } else {
            System.out.println("It's a tie.");
        }
    }
}


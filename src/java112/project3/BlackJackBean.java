/**
* Class containing the state of the blackjack game
* For Unit 3 MVC challenge
*/

public class BlackJackBean {
    // instance variables
    private int[] dealerHand;
    private int[] playerHand;
    private String latestMove;

    // Constructor

    public BlackJackBean() {
        this.dealerHand = new int[] {0, 0, 0, 0, 0};
        this.playerHand = new int[] {0, 0, 0, 0, 0};
    }

    public BlackJackBean(int[] dealerHand, int[] playerHand) {
        this.dealerHand = dealerHand;
        this.playerHand = playerHand;
    }

    // getters and setters

    public int[] getDealerHand() {
        return this.dealerHand;
    }

    public void setDealerHand(int pos, int value) {
        this.dealerHand[pos] = value;
    }

    public int[] getPlayerHand() {
        return this.playerHand;
    }

    public void setPlayerHand(int pos, int value) {
        this.playerHand[pos] = value;
    }

    public int getDealerCardCount() {
        return numberOfCardsInHand(dealerHand);
    }

    public int getPlayerCardCount() {
        return numberOfCardsInHand(playerHand);
    }

    public String getLatestMove() {
        return this.latestMove;
    }

    public void setLatestMove(String value) {
        this.latestMove = value;
    }

    public int drawCard() {
        int[] deck = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        int draw = 0; // TODO pick something at random
        return deck[draw];
    }

    public int numberOfCardsInHand(int[] hand) {
        int total = 0;
        for (int current: hand) {
            if (current > 0) {
                total++;
            }
        }
        return total;
    }

    public int totalValueOfHand(int[] hand) {
        int total = 0;
        for (int current: hand) {
            total += current;
        }
        return total;
    }

    public boolean isBusted(int[] hand) {
        if (totalValueOfHand(hand) > 21) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPush() {
        if (totalValueOfHand(playerHand) == totalValueOfHand(dealerHand)) {
            return true;
        } else {
            return false;
        }
    }
}

/**
* Class containing the state of the blackjack game
* For Unit 3 MVC challenge
*/

public class BlackJackBean {
    // instance variables
    private int[] dealerHand;
    private int[] playerHand;
    private String latestMove;
    private boolean gameOver;

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

    public boolean isGameOver() {
        return this.gameOver;
    }

    public int drawCard(int[] hand) {
        int[] deck = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        int draw = 0; // TODO pick something at random
        int drawnCard = deck[draw];
        this.latestMove += "draws " + drawnCard + "\n";
        return drawnCard;
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

    /**
    * Checks if a hand is busted (over 21)
    * @return true if the hand's value is over 21, false if not
    */
    public boolean isBusted(int[] hand) {
        if (totalValueOfHand(hand) > 21) {
            return true;
        } else {
            return false;
        }
    }

    /***
    * Checks for a push (a tie)
    * @return true if scores are tied, false if not
    */
    public boolean isPush() {
        if (totalValueOfHand(playerHand) == totalValueOfHand(dealerHand)) {
            return true;
        } else {
            return false;
        }
    }

    /**
    * Plays out the next turn, updating the string summarizing the turn
    * @param playerHit true if the player is drawing, false if they're done
    */
    public void nextTurn(boolean playerHit) {
        if (playerHit) {
            this.latestMove += "Player ";
            drawCard(playerHand);
        } else {
            this.latestMove += "Player stands.\n";
            // dealer's turn, draw until busted or over 17
            while (totalValueOfHand(dealerHand) < 17) {
                this.latestMove += "Dealer ";
                drawCard(dealerHand);
            }
        }
    }

    public void endGame() {
        if (isBusted(dealerHand)) {
            this.latestMove += "Dealer busted. Player wins!\n";
        } else if (isPush()) {
            this.latestMove += "The scores are tied. Push!\n";
        } else if (totalValueOfHand(playerHand) > totalValueOfHand(dealerHand)) {
            this.latestMove += "Player wins with " + totalValueOfHand(playerHand);
        } else {
            this.latestMove += "Dealer wins with " + totalValueOfHand(dealerHand);
        }
        this.gameOver = true;
    }
}

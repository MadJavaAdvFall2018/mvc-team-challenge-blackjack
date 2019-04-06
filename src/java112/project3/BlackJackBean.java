/**
* Class containing the state of the blackjack game
* For Unit 3 MVC challenge
*/

public class BlackJackBean {
    // instance variables
    private int[] dealerHand;
    private int[] playerHand;
    private int dealerCardCount;
    private int playerCardCount;
    private String latestMove;

    // Constructor

    public BlackJackBean() {
        dealerHand = new int[5];
        playerHand = new int[5];
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
        return this.dealerCardCount;
    }

    public void setDealerCardCount(int value) {
        this.dealerCardCount = value;
    }

    public int getPlayerCardCount() {
        return this.playerCardCount;
    }

    public void setPlayerCardCount(int value) {
        this.playerCardCount = value;
    }

    public String getLatestMove() {
        return this.latestMove;
    }

    public void setLatestMove(String value) {
        this.latestMove = value;
    }
}

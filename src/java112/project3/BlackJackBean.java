package java112.project3;
import java.util.*;
/**
* Class containing the state of the blackjack game
* For Unit 3 MVC challenge
*/

public class BlackJackBean {
    // instance variables
    private ArrayList<Integer> dealerHand;
    private ArrayList<Integer> playerHand;
    private String dealerString;
    private String playerString;
    private int dealerScore;
    private int playerScore;
    private String latestMove;
    private boolean gameOver;

    // Constructor

    public BlackJackBean() {
        this.dealerHand = new ArrayList<Integer>();
        this.playerHand = new ArrayList<Integer>();
        this.dealerString = dealerHand.toString();
        this.playerString = dealerHand.toString();
        this.latestMove = "Welcome to Blackjack! Care to try your luck?";
        this.gameOver = false;
    }

    public BlackJackBean(String dealerHand, String playerHand) {
        this.dealerHand = listFromString(dealerHand);
        this.playerHand = listFromString(playerHand);
        this.updateStatus();
        this.latestMove = "";
        this.gameOver = false;
    }

    // constructor helper
    public ArrayList<Integer> listFromString(String source) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        if (source.length() > 2) {
            source = source.substring(1, source.length() - 1); // trim brackets
            for (String current: source.split(", ")) {
                if (!current.isEmpty()) {
                    out.add(Integer.parseInt(current));
                }
            }
        }
        return out;
    }

    // getters and setters

    public ArrayList<Integer> getDealerHand() {
        return this.dealerHand;
    }

    public ArrayList<Integer> getPlayerHand() {
        return this.playerHand;
    }

    public String getDealerString() {
        return this.dealerString;
    }

    public void setDealerString(String value) {
        this.dealerString = value;
    }

    public void setPlayerString(String value) {
        this.playerString = value;
    }

    public String getPlayerString() {
        return this.playerString;
    }

    public int getDealerScore() {
        return this.dealerScore;
    }

    public void setDealerScore(int value) {
        this.dealerScore = value;
    }
    public int getPlayerScore() {
        return this.playerScore;
    }

    public void setPlayerScore(int value) {
        this.playerScore = value;
    }

    public String getLatestMove() {
        return this.latestMove;
    }

    public void setLatestMove(String value) {
        this.latestMove = value;
    }

    public boolean getGameOver() {
        return this.gameOver;
    }
    public void setGameOver(boolean value) {
        this.gameOver = value;
    }

    public void drawCard(ArrayList<Integer> hand) {
        int[] deck = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        Random rando = new Random();
        int draw = rando.nextInt(13); // pick a random card from the deck
        int drawnCard = deck[draw];
        this.latestMove += "draws " + drawnCard + "<br />";
        hand.add(drawnCard);
        this.updateStatus();
    }

    public int totalValueOfHand(ArrayList<Integer> hand) {
        int total = 0;
        for (int current: hand) {
            total += current;
        }
        return total;
    }

    public void updateStatus() {
        this.dealerString = this.dealerHand.toString();
        this.playerString = this.playerHand.toString();
        this.dealerScore = totalValueOfHand(this.dealerHand);
        this.playerScore = totalValueOfHand(this.playerHand);
    }

    /**
    * Checks if a hand is busted (over 21)
    * @return true if the hand's value is over 21, false if not
    */
    public boolean isBusted(ArrayList<Integer> hand) {
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
            if (isBusted(playerHand)) {
                endGame();
            }
        } else {
            this.latestMove += "Player stands.<br />";
            // dealer's turn, draw to 17 or higher than player's score, whichever comes first
            while (totalValueOfHand(dealerHand) < 17 && (totalValueOfHand(dealerHand) <= totalValueOfHand(playerHand))) {
                this.latestMove += "Dealer ";
                drawCard(dealerHand);
            }
            endGame();
        }
    }

    public void endGame() {
        if (isBusted(playerHand)) {
            this.latestMove += "Player busted. Oops.<br />";
        } else if (isBusted(dealerHand)) {
            this.latestMove += "Dealer busted. Player wins!<br />";
        } else if (isPush()) {
            this.latestMove += "The scores are tied. Push!<br />";
        } else if (totalValueOfHand(playerHand) > totalValueOfHand(dealerHand)) {
            this.latestMove += "Player wins with " + totalValueOfHand(playerHand) +"!";
        } else {
            this.latestMove += "Dealer wins with " + totalValueOfHand(dealerHand) + ". Better luck next time.";
        }
        this.gameOver = true;
    }
}

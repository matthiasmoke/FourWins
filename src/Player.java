import java.awt.Color;

/**
 * Represents a player in the game
 */
public class Player implements Cloneable, Comparable {

    private char symbol;
    private boolean isMachine;
    private boolean isWinner;

    /**
     * Creates a new human player.
     *
     * @param symbol Symbol of the player.
     */
    public Player(char symbol) {
        this.symbol = symbol;
        this.isMachine = false;
    }

    /**
     * Creates a new human or machine Player.
     *
     * @param symbol    Symbol of the player.
     * @param isMachine Indicates if player is type of machine or not.
     */
    public Player(char symbol, boolean isMachine) {
        this.symbol = symbol;
        this.isMachine = isMachine;
    }

    /**
     * Gets the player-symbol.
     *
     * @return Symbol of the player.
     */
    public char getSymbol() {
        return symbol;
    }


    /**
     * Gets information about the player type.
     *
     * @return True if player is type of machine, false if not.
     */
    public boolean isMachine() {
        return isMachine;
    }

    /**
     * Sets player to winner or removes him from winners.
     *
     * @param isWinner Set player to winner if true.
     */
    public void setWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }

    /**
     * Checks if player is winner.
     *
     * @return True if player is winner.
     */
    public boolean isWinner() {
        return isWinner;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Player clone() {
        Player clone;

        try {
            clone = (Player) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new Error(ex);
        }

        return clone;
    }

    @Override
    public int compareTo(Object o) {
        Player player = (Player) o;

        if (this.symbol == player.symbol) {
            return 0;
        } else if (this.symbol < player.symbol) {
            return -1;
        } else {
            return 1;
        }
    }
}

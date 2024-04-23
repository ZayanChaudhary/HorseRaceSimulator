
/**
 * Write a description of class Horse here.
 * 
 * @author Zayan Chaudhary
 * @version Version 1 - 19/03/24
 */
public class Horse {
    // Fields of class Horse

    private String horseName;
    private char horseSymbol;
    private int distance;
    private boolean fallen;
    private double horseConfidence;

    // Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence) {
        this.horseSymbol = horseSymbol;
        this.horseName = horseName;
        this.horseConfidence = horseConfidence;
        this.distance = 0;
        this.fallen = false;
    }

    // Other methods of class Horse
    public void fall() {
        fallen = true;
    }

    public double getConfidence() {
        return this.horseConfidence;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }

    public String getName() {
        return this.horseName;
    }

    public char getSymbol() {
        return this.horseSymbol;
    }

    public void goBackToStart() {
        this.distance = 0;
    }

    public boolean hasFallen() {
        if (fallen == true) {
            return true;
        } else {
            return false;
        }
    }

    public void moveForward() {
        this.distance = this.distance + 1;
    }

    public void setConfidence(double newConfidence) {
        this.horseConfidence = newConfidence;
    }

    public void setSymbol(char newSymbol) {
        this.horseSymbol = newSymbol;
    }

}


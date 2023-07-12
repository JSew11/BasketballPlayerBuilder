package player;

import java.lang.Math;

public class Physicals {
    // measurements
    protected int height;
    protected int weight;
    protected int wingspan;
    protected int handSize;
    protected int shoeSize;

    // conditioning
    protected int speed = Constants.MIN_SKILL_VALUE;
    protected int agility = Constants.MIN_SKILL_VALUE;
    protected int vertical = Constants.MIN_SKILL_VALUE;
    protected int strength = Constants.MIN_SKILL_VALUE;

    public Physicals() {
        this.height = Constants.MIN_HEIGHT;
        this.weight = this.minWeight();
    }

    /**
     * Normalized value for the player's height (used to calculate min and max weight).
     *
     * @return double - normalized height (0-1)
     */
    private double normalizedHeight() {
        return ((double) (this.height - Constants.MIN_HEIGHT)) / (Constants.MAX_HEIGHT - Constants.MIN_HEIGHT);
    }

    /**
     * Gives the player height on the scale of 30-99 (same scale used for skills and conditioning values)
     *
     * @return int - height on a scale of 30-99
     */
    public int scaledHeight() {
        return (int) Math.ceil((this.normalizedHeight() * (Constants.MAX_SKILL_VALUE - Constants.MIN_SKILL_VALUE)) +
                Constants.MIN_SKILL_VALUE);
    }

    /**
     * Calculates the minimum allowed weight (lbs) for this player (based off their height).
     *
     * @return int - minimum weight (lbs)
     */
    public int minWeight() {
        return (int) Math.ceil(this.height * (2.5 + (this.normalizedHeight() / 2)));
    }

    /**
     * Calculates the maximum allowed weight (lbs) for this player (based off their height).
     *
     * @return int - maximum weight (lbs)
     */
    public int maxWeight() {
        return (int) Math.ceil(this.height * (3 + (this.normalizedHeight() / 2)));
    }

    /**
     * Gives the player's weight on a scale of 30-99 (same scale used for skills and conditioning values)
     * @return int - weight on a scale of 30-99
     */
    public int scaledWeight() {
        return (int) Math.ceil(((this.weight - Constants.MIN_WEIGHT) / ((double) Constants.MAX_WEIGHT - Constants.MIN_WEIGHT)) *
                (Constants.MAX_SKILL_VALUE - Constants.MIN_SKILL_VALUE) + Constants.MIN_SKILL_VALUE);
    }

    // accessors and mutators
    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        if (height >= Constants.MIN_HEIGHT && height <= Constants.MAX_HEIGHT) {
            this.height = height;
            if (this.weight > maxWeight()) {
                this.weight = maxWeight();
            }
            if (this.weight < minWeight()) {
                this.weight = minWeight();
            }
        }
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        if (weight >= this.minWeight() && weight <= this.maxWeight()) {
            this.weight = weight;
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getHandSize() {
        return this.handSize;
    }

    public void setHandSize(int handSize) {
        this.handSize = handSize;
    }

    public int getShoeSize() {
        return this.shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        if (speed < Constants.MIN_SKILL_VALUE) {
            this.speed = Constants.MAX_SKILL_VALUE;
            return;
        }
        if (speed > Constants.MAX_SKILL_VALUE) {
            this.speed = Constants.MAX_SKILL_VALUE;
            return;
        }
        this.speed = speed;
    }

    public int getAgility() {
        return this.agility;
    }

    public void setAgility(int agility) {
        if (agility < Constants.MIN_SKILL_VALUE) {
            this.agility = Constants.MAX_SKILL_VALUE;
            return;
        }
        if (agility > Constants.MAX_SKILL_VALUE) {
            this.agility = Constants.MAX_SKILL_VALUE;
            return;
        }
        this.agility = agility;
    }

    public int getVertical() {
        return this.vertical;
    }

    public void setVertical(int vertical) {
        if (vertical < Constants.MIN_SKILL_VALUE) {
            this.vertical = Constants.MAX_SKILL_VALUE;
            return;
        }
        if (vertical > Constants.MAX_SKILL_VALUE) {
            this.vertical = Constants.MAX_SKILL_VALUE;
            return;
        }
        this.vertical = vertical;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        if (strength < Constants.MIN_SKILL_VALUE) {
            this.strength = Constants.MAX_SKILL_VALUE;
            return;
        }
        if (strength > Constants.MAX_SKILL_VALUE) {
            this.strength = Constants.MAX_SKILL_VALUE;
            return;
        }
        this.strength = strength;
    }
}

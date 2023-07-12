package player;

public class Player {
    public Physicals physicals;
    public Skills skills;

    public Player() {
        this.physicals = new Physicals();
        this.skills = new Skills();
    }

    /**
     * Calculates the scaled height-weight factor used in calculating a player's position.
     *
     * @return double - scaled height-weight factor
     */
    private double scaledHeightWeightFactor() {
        return ((3 * this.physicals.scaledHeight()) + (2 * this.physicals.scaledWeight())) / 5.0;
    }

    /**
     * Calculates the scaled skills factor used in calculating a player's position.
     *
     * @return int - skills factor
     */
    private double scaledSkillsFactor() {
        int postFactor = (skills.getDunk() + (2 * physicals.getVertical()) + (4 * physicals.getStrength()) + (16 * skills.getPostUp())) / 23;
        int perimeterFactor = (skills.getThreeBall() + (2 * physicals.getSpeed()) + (4 * physicals.getAgility()) + (16 * skills.getHandle())) / 23;
        int skillFactor =  postFactor - perimeterFactor;
        return (((skillFactor - Constants.MIN_SKILL_FACTOR) / ((double) (Constants.MAX_SKILL_FACTOR - Constants.MIN_SKILL_FACTOR))) *
                (Constants.MAX_SKILL_VALUE - Constants.MIN_SKILL_VALUE)) + Constants.MIN_SKILL_VALUE;
    }

    /**
     * Calculates a player's position based off the height-weight factor and skills factor.
     *
     * @return String - name of the calculated position
     */
    public String calcPosition() {
        double positionFactor = ((scaledSkillsFactor()) + (scaledHeightWeightFactor())) / 2.0;
        double maxPositionFactor = Constants.MAX_SKILL_VALUE;
        double minPositionFactor = Constants. MIN_SKILL_VALUE;
        int calculatedPosition = (int) Math.ceil(((positionFactor - minPositionFactor) / ((double) maxPositionFactor - minPositionFactor)) * 5);
        return switch (calculatedPosition) {
            case 1 -> "PG";
            case 2 -> "SG";
            case 3 -> "SF";
            case 4 -> "PF";
            case 5 -> "C";
            default -> "Error";
        };
    }
}

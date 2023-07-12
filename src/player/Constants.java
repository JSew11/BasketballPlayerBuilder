package player;

public class Constants {
    public static int MIN_HEIGHT = 68;
    public static int MAX_HEIGHT = 86;
    public static int MIN_WEIGHT = (int) Math.ceil(MIN_HEIGHT * 2.5);
    public static int MAX_WEIGHT = (int) Math.ceil(MAX_HEIGHT * 3.5);
    public static int MIN_SKILL_VALUE = 30;
    public static int MAX_SKILL_VALUE = 99;
    public static int MAX_SKILL_FACTOR = Constants.MAX_SKILL_VALUE - Constants.MIN_SKILL_VALUE;
    public static int MIN_SKILL_FACTOR = Constants.MIN_SKILL_VALUE - Constants.MAX_SKILL_VALUE;
}

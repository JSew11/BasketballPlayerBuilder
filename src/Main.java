import player.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.physicals.setHeight(82);
        player.physicals.setWeight(245);
        // perimeter skills / physicals
        player.skills.setHandle(91);
        player.physicals.setAgility(82);
        player.physicals.setSpeed(87);
        player.skills.setThreeBall(62);
        // paint skills / physicals
        player.skills.setDunk(94);
        player.physicals.setVertical(84);
        player.physicals.setStrength(72);
        player.skills.setPostUp(55);

        System.out.println(player.calcPosition());
    }
}
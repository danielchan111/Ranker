import java.util.HashSet;

public class Positions {
    HashSet<Skill> skilllist;
    HashSet<Player> playerlist;

    public void addSkill(Skill newSkill){
        skilllist.add(newSkill);
    }

    public void addPlayer(Player newPlayer){
        playerlist.add(newPlayer);
        newPlayer.positionlist.add(this);
    }
}

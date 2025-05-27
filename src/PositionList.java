import java.util.*;

public class PositionList {
    HashMap<Position, HashSet<Player>> playerlist;

public class Position{
        
        HashSet<Skill> skilllist;
        HashSet<Player> players = playerlist.get(this);
        public void addPlayer(Player newPlayer){
            
            players.add(newPlayer);
            newPlayer.positionList.add(this);
    }
        
        public void addSkill(Skill newSkill){
            skilllist.add(newSkill);
            for (Player x : players){
                x.addSkill(newSkill);
        }
    }
    }

    

    
}

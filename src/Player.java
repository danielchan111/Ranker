import java.util.HashSet;

public class Player {
    HashSet<Skill> skilllist;
    String name;
    HashSet<Positions> positionlist;

    public void addSkill(Skill newSkill){
        skilllist.add(newSkill);
    }

    public Player(String newname){
        this.name = newname;
    }

    
}

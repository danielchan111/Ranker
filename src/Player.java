import java.util.HashSet;
import java.util.HashMap;

public class Player {
    HashMap<String, Skill> skillList;
    String name;
    HashSet<PositionList.Position> positionList;

    public void addSkill(Skill newSkill){
        skillList.put(newSkill.name,newSkill);
    }

    public void editSkill(String mySkill, int newLevel){
        Skill s = skillList.get(mySkill);
        s.level = newLevel;
    }

    public Player(String newname){
        this.name = newname;
    }


}

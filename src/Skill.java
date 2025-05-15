public class Skill {
    String name;
    int level;

    public int SkillLevel(){
        return this.level;
    }
    public String SkillName(){
        return this.name;
    }
    @Override
    public boolean equals(Object skill){
        if (this == skill) {
            return true;
            
        }
        if (!(skill instanceof Skill)){
            return false;
        }

        Skill otherSkill = (Skill) skill;

        return name.equals(otherSkill.name);
    }

    

    

}


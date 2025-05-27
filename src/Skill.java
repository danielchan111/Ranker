public class Skill {
    private String name;
    private int level;

    public int SkillLevel(){
        return this.level;
    }
    public String SkillName(){
        return this.name;
    }
    public Skill(String newname, int newlevel){
        this.name = newname;
        this.level = newlevel;
    }

    public Skill(String newname){
        this.name = newname;
        this.level = 0;
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


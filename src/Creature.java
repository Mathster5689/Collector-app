public class Creature {


    private String name;
    private String type;
    private int level;
    private int hp;
    private boolean isShiny;

    public Creature(String name, String type, int level, int hp, boolean isShiny) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hp = hp;
        this.isShiny = isShiny;

    }

    public String getName() {
        return name;


    }


    public String getType() {
        return type;
    }


    public int getLevel(){
        return level;
    }
    public int getHp() {
        return hp;
    }

    public boolean isShiny() {
        return isShiny;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLevel(int level){
        this.level = level;
    }


    public void setHp(int hp){
        this.hp = hp;
    }


    public void setShiny(boolean isShiny) {
        this.isShiny=isShiny;
    }



    public void levelUp() {


        level= level+1;
        hp = hp + 20;
    }


    public void takeDamage(int amount){
        hp = hp - amount;




        if (hp < 0) {
            hp = 0;
        }


    }

    public void attack(Creature target) {

       target.takeDamage(10);


    }

    @Override
    public String toString() {






        return name + "  |  " + type + "  | Level: " + level + "   | HP:  " + hp + "   | Shiny:   " + isShiny;


    }






}



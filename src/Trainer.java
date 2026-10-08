public class Trainer {


    private String name;
    private Creature activeCreature;


    public Trainer(String name, Creature activeCreature) {


        this.name = name;
        this.activeCreature = activeCreature;




    }


    public String getName() {
        return name;
    }


    public Creature getActiveCreature() {
        return activeCreature;
    }




    public void showActive() {
        System.out.println(activeCreature);




    }












}



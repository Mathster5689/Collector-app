import java.util.ArrayList;

public class Party {

    public Party() {
        party = new ArrayList<>();
    }

    public Creature getCreature(int index) {
        return party.get(index);
    }

    public void addCreature(Creature creature) {
        party.add(creature);
    }

    private ArrayList<Creature> party;


    public Creature findByName(String name) {

        for (Creature creature : party) {

            if (creature.getName().equals(name)) {

                return creature;


            }

        }

        return null;

    }
    public ArrayList<Creature>  allOfType(String type) {


        ArrayList<Creature> matches = new ArrayList<>();


        for (Creature creature : party) {


            if (creature.getType().equals(type)) {


                matches.add(creature);


            }

        }


        return matches;


    }


    public void showAll() {


        for (Creature creature : party) {
            System.out.println(creature);


        }


    }


    public int getCount() {


        return party.size();
    }
}




import java.util.Scanner;


import java.util.ArrayList;

public static void main (String[] args) {


    Scanner input = new Scanner(System.in);

    Party party = new Party();

    party.addCreature(new Creature("Mudkip", "Water", 13, 40, false));

    party.addCreature(new Creature("Honedge", "Steel/Ghost", 10, 38, true));

    party.addCreature(new Creature("Bagon", "Dragon", 20, 54, false));

    party.addCreature(new Creature("Bulbasaur", "Grass/Poison", 13, 38, false));

    party.addCreature(new Creature("Elekid", "Electric", 17, 58, false));

    party.addCreature(new Creature("Tepig", "Fire", 13, 52, true));


    boolean running = true;

    while (running) {


        System.out.println("===== CREATURE COLLECTOR =====");
        System.out.println("1. Add a creature");
        System.out.println("2. View collection");
        System.out.println("3. Find a creature");
        System.out.println("4. Show report");
        System.out.println("5. Quit");


        int choice = input.nextInt();


        if (choice == 5) {

            running = false;


        }

        if (choice == 2) {
            party.showAll();
        }

        if (choice == 3) {
            input.nextLine();

            System.out.println("Yo enter what the creature's name is:");
            String name = input.nextLine();

            Creature found = party.findByName(name);

            if (found == null) {
                System.out.println("Creature hasn't been found bro.");


            } else {
                System.out.println(found);
            }
        }

        if (choice == 4) {

            int count = party.getCount();

            if (count == 0) {

                System.out.println("Your party is empty. Add a creature first.");


            }else {
                System.out.println("Your party has " + count + " creatures.");

            }

            }


        if (choice == 1) {

            input.nextLine();


            System.out.println("What is the creature that you are gonna  make?");

            String name = input.nextLine();

            System.out.println("Enter creature's typing:");
            String type = input.nextLine();

            System.out.println("Enter creature's level(it's up to you to decide what it's level is gonna be): ");
            int level = input.nextInt();


            System.out.println("Enter the creature's HP:");
            int hp = input.nextInt();

            System.out.println("Is the creature a shiny? (true/false)");
            boolean isShiny = input.nextBoolean();

            Creature newCreature = new Creature(name, type, level, hp, isShiny);

            party.addCreature(newCreature);

        }

    }


    Creature found = party.findByName("Bagon");
    System.out.println(found);




    Creature notFound = party.findByName("Clauncher");




    System.out.println(notFound);




    ArrayList<Creature> waterCreatures = party.allOfType("Water");

    System.out.println(waterCreatures);




    ArrayList<Creature> iceCreatures = party.allOfType("Ice");


    System.out.println(iceCreatures);


    Creature anotherReference = party.getCreature(5);


    System.out.println(party.getCreature(5).getHp());


    System.out.println(anotherReference.getHp());


    anotherReference.takeDamage(10);


    System.out.println(party.getCreature(5).getHp());


} //hello





package us.mattgreen;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCreate {
    private Scanner sc;
    private ArrayList<Talkable> zoo;

    public AnimalCreate() {
        sc = new Scanner(System.in);
        zoo = new ArrayList<>();
    }

    public void createAnimal() {
        System.out.println("What Animal Would You Like to Create? (Dog or Cat)");
        String answer = sc.nextLine();

        switch (answer.toLowerCase()) {
            case "dog":
                createDog();
                break;

            case "cat":
                createCat();
                break;
            default:
                System.out.println("Please Choose Cat or Dog");
        }
    }
        private void createDog() {
            System.out.println("What Is the Dog's Name?: ");
            String name = sc.nextLine();

            System.out.println("Are They Friendly? (True/False): ");
            boolean isFriendly = Boolean.parseBoolean(sc.nextLine());
            zoo.add(new Dog(isFriendly, name));
        }

        private void createCat() {
            System.out.println("What is the Cat's Name?: ");
            String name = sc.nextLine();

            System.out.println("How Many Mice Have They Killed?: ");
            int mousesKilled = Integer.parseInt(sc.nextLine());

        }

        public ArrayList<Talkable> getZoo() {
        return zoo;
        }
    }

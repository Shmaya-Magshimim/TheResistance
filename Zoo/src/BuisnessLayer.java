import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BuisnessLayer {
    private ArrayList<Animal> animals;
    private Queue<Animal> vetList = new LinkedList<>();

    public void addAnimal()
    {
        // Name, Species, Traits
        System.out.println("Select 1 to add Mammal");
        System.out.println("Select 2 to add Reptile");

        Scanner scanner = new Scanner(System.in);
        int animalType = scanner.nextInt();

        System.out.println("Input animals name: ");
        String name = scanner.next();

        System.out.println("Input animals species:  ");
        String species = scanner.next();

        System.out.println("Input animals traits: ");
        String traits = scanner.nextLine();

        if (animalType == 1)
        {
            Animal newAnimal = new Mammal(name, species, traits, 50, 50);
            animals.add(newAnimal);
        }
        else if (animalType == 2)
        {
            Animal newAnimal = new Mammal(name, species, traits, 50, 50);
            animals.add(newAnimal);
        }
        else
        {
            System.err.println("That wasnt an option. Silly you :(");
        }
        scanner.close();
    }

    public void removeAnimal()
    {
        Animal toRemove = this.selectAnimal();
        animals.remove(toRemove);
    }

    public void addAnimalToVet()
    {
        Animal toAdd = this.selectAnimal();
        vetList.add(toAdd);
    }

    public void treatAnimal()
    {
        vetList.poll();
    }

    public void feedAnimal()
    {
        Animal toFeed = this.selectAnimal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of food points you would like this animal to eat");
        int feedPoints = scanner.nextInt();
        toFeed.feed(feedPoints);
    }

    public void viewAnimal()
    {
        Animal toView = this.selectAnimal();
        toView.viewAnimal();
    }

    public void viewVetList()
    {
        for (Animal animal : vetList)
        {
            System.out.println(animal.getDisplay());
        }
    }

    public void attackAnimal()
    {
        Animal toFeed = this.selectAnimal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of damage points you would like to inflict on this poor animal");
        int dmgPoints = scanner.nextInt();
        toFeed.damage(dmgPoints);
    }

    private Animal selectAnimal()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an animal: ");
        int position = 0;
        for (Animal animal : animals){
            System.out.println(position + " - " + animal.getDisplay());
            position++;
        }
        int choice = scanner.nextInt();
        scanner.close();
        return animals.get(choice);
        
    }
    
    
}

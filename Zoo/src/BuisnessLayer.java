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

    }

    public void addAnimalToVet()
    {

    }

    public void treatAnimal()
    {

    }

    public void feedAnimal()
    {

    }

    public void viewAnimal()
    {

    }

    public void viewVetList()
    {

    }

    public void attackAnimal()
    {

    }

    private Animal selectAnimal()
    {
        return new Animal();
    }
    
    
    
}

import java.util.InputMismatchException;
import java.util.Scanner;

enum MainMenuOptions {
    EXIT,
    ADD_ANIMAL,
    REMOVE_ANIMAL,
    ADD_ANIMAL_VET,
    TREAT_ANIMAL,
    FEED_ANIMAL,
    VIEW_ANIMAL,
    VIEW_VET_LIST,
    ATTACK_ANIMAL
}


public class Menu {
    public void runMenu()
    {
        Scanner scanner = new Scanner (System.in);
        MainMenuOptions option = MainMenuOptions.EXIT;
        int choice;
        BuisnessLayer bi = new BuisnessLayer(scanner);
        
        do
        {
            System.out.printf("%d - Exit\n", MainMenuOptions.EXIT.ordinal());
            System.out.printf("%d - Add an Animal\n", MainMenuOptions.ADD_ANIMAL.ordinal());
            System.out.printf("%d - Remove an Animal\n", MainMenuOptions.REMOVE_ANIMAL.ordinal());
            System.out.printf("%d - Add Animal to vets list for treatment\n", MainMenuOptions.ADD_ANIMAL_VET.ordinal());
            System.out.printf("%d - Treat an animal in the vet waiting list\n", MainMenuOptions.TREAT_ANIMAL.ordinal());
            System.out.printf("%d - Feed Animal\n", MainMenuOptions.FEED_ANIMAL.ordinal());
            System.out.printf("%d - View Animal\n", MainMenuOptions.VIEW_ANIMAL.ordinal());
            System.out.printf("%d - View vets list\n", MainMenuOptions.VIEW_VET_LIST.ordinal());
            System.out.printf("%d - Attack Animal\n\n", MainMenuOptions.ATTACK_ANIMAL.ordinal());

            try 
            {
                choice = scanner.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("That is not a number! Silly you :(. I bet it was you Gavi!");
                continue;
            }

            if (choice >= 0 && choice < MainMenuOptions.values().length)
            {
                option = MainMenuOptions.values()[choice];
                handleInput(option, bi);
            }
            else
            {
                System.out.println("Your option was not valid");
                continue;
            }
            
        } while (option != MainMenuOptions.EXIT);
        scanner.close();
    }

    private void handleInput(MainMenuOptions option, BuisnessLayer bi)
    {
        switch (option)
        {
            case MainMenuOptions.EXIT:
                return;

            case MainMenuOptions.ADD_ANIMAL:
                bi.addAnimal();
                break;

            case MainMenuOptions.REMOVE_ANIMAL:
                bi.removeAnimal();
                break;
 
            case MainMenuOptions.ADD_ANIMAL_VET:
                bi.addAnimalToVet();
                break;
                
            case MainMenuOptions.TREAT_ANIMAL:
                bi.treatAnimal();
                break;

            case MainMenuOptions.ATTACK_ANIMAL:
                bi.attackAnimal();
                break;

            case MainMenuOptions.VIEW_ANIMAL:
                bi.viewAnimal();
                break;

            case MainMenuOptions.FEED_ANIMAL:
                bi.feedAnimal();
                break;

            case MainMenuOptions.VIEW_VET_LIST:
                bi.viewVetList();
                break;
        }
    }
}
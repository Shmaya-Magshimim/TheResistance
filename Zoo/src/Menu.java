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
    VIEW_VET_LIST
}


public class Menu {
    public void runMenu()
    {
        Scanner scanner = new Scanner (System.in);
        MainMenuOptions option = MainMenuOptions.EXIT;
        int choice;
        
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
                handleInput(option);
            }
            else
            {
                System.out.println("Your option was not valid");
                continue;
            }
            
        } while (option != MainMenuOptions.EXIT);
        scanner.close();
    }

    private void handleInput(MainMenuOptions option)
    {
        switch (option)
        {
            case MainMenuOptions.EXIT:
                return;

            case MainMenuOptions.ADD_ANIMAL:
                
            
        }
    }
}
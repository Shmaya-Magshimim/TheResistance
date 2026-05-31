abstract public class Animal {
  protected final String name;
  protected final String traits;
  protected int hunger;
  protected int health;
  private final String type;
  private final String species;
  protected static int count;


  public Animal(String type, String name, String species, String traits, int hunger, int health){
    this.name = name;
    this.traits = traits;
    this.hunger = hunger;
    this.health = health;
    this.species = species;
    this.type = type;
  }

  public final void viewAnimal(){
    System.out.printf("%s is a %s from the %s family \n", name, species, type);
    System.out.printf("Their Traits are: %s\n", health);
    System.out.printf("Hunger Level: %d\n", hunger);
    System.out.printf("Health: %d\n", health);
  }
  public final String getDisplay(){
    return (name + " - " + species);
  }
}

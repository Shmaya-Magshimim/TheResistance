abstract public class Animal {
  protected final String name;
  protected final String traits;
  protected int hunger = 0;
  protected int health = 100;
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

  public final void healHealth(int points){
    health = health + (points);
    if(health > 100){health = 100;}
    if(health < 0) {health = 0;}
  }

  public final void feed(int points){
    hunger = hunger - (points);
    if(hunger >= 100){health = 1;}
    if(hunger <= 0) {hunger = 0;}
  }
  public final void damage(int points) {
    health = health - points;
    if(health <= 0) {health = 1;}
    if(health > 200) {health = 100;}
  }

}

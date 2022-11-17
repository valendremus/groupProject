
public class zooMain {
  public static void main(String[] args) {
    zooFood beef = new zooFood("beef", 50);
    zooAnimal tiger = new zooAnimal("Tiger", 6, "Jungle", beef);
  
    zooFood bamboo = new zooFood("bamboo", 50);
    zooAnimal panda = new zooAnimal("Panda", 2, "Forest", bamboo);
  
    zooFood fish = new zooFood("fish", 50);
    zooAnimal penguin = new zooAnimal("Penguin", 20, "Artic", fish);
    zooAnimal polarBear = new zooAnimal("Polar Bear", 2, "Artic", fish);
  
    zooFood acaciaLeaves = new zooFood("Acacia Leaves", 50);
    zooAnimal giraffe = new zooAnimal("Giraffe", 4, "Safari", acaciaLeaves);
    
    zooFood fishFood = new zooFood("fishFood", 50);
    zooAnimal clownfish = new zooAnimal("Clownfish", 4, "Aquarium", fishFood);
    //zoo animal array
    //animal search function
  }
}

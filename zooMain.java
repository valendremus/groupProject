
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
  
    zooFood fishFood = new zooFood("Fishfood", 50);
    zooAnimal clownFish = new zooAnimal("Clownfish", 4, "Aquarium", fishFood);
    
    zooAnimal[][] anArray = new zooAnimal[2][3];
    anArray[0][0] = tiger;
    anArray[0][1] = panda;
    anArray[1][0] = penguin;
    anArray[1][1] = polarBear;
    anArray[2][0] = giraffe;
    anArray[2][1] = clownFish;
    
    zooFood[] foArray = new zooFood[5];
    foArray[0] = beef;
    foArray[1] = bamboo;
    foArray[2] = fish;
    foArray[3] = acaciaLeaves;
    foArray[4] = fishFood;
    //animal search function
  }
}

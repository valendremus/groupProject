
import java.util.Scanner;
public class zooMain {
  public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	int userNum = 0;
	  
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
    
    while(userNum != 7)
    	{
    	System.out.println("What animal would you like to choose? (choose a number betwen 1 - 6)");
    	userNum = scnr.nextInt();
    	switch (userNum) {
    	  case 1:
    		  userNum = 0;
    		  System.out.println("This is a Tiger!");
    		  while(userNum != 4) {
    		  System.out.println("What would you like to do next?");
    		  System.out.println("1. Check number of animals\n" + "2. check Which enclosure\n" + "3. Check what food is eaten\n" + "4. search for new animal");
    		  userNum = scnr.nextInt();
    		  	if(userNum == 1)
    		  	{
    		  		System.out.println(tiger.getAnimalNum());
    		  	}
    		  	else if(userNum == 2)
    		  	{
    		  		System.out.println(tiger.getEnclosure());
    		  	}
    		  	else if(userNum == 3)
    		  	{
    		  		
    		  	}
    		  	else if(userNum == 4)
    		  	{
    		  		break;
    		  	}
    		  	else
    		  	{
    		  		System.out.println("You entered an invalid number, try again.");
    		  	}
    		  }
    		  
    	    break;
    	  case 2:
    		  System.out.println("This is a Panda!");
    	    break;
    	  case 3:
    		  System.out.println("This is a Penguin!");
    	    break;
    	  case 4:
    		  System.out.println("This is a Polar bear!");
    	    break;
    	  case 5:
    		  System.out.println("This is a Giraffe!");
    	    break;
    	  case 6:
    		  System.out.println("This is a Clownfish!");
      	    break;
    	  case 7:
    	  	break;
    	 }
    //animal search function
    	//look for animal
    	//how many of animal
    	//which enclosure
    	//what food
    	//exit
    	}
  }
}

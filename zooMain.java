
import java.util.Scanner;
public class zooMain {
  public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	int userNum = 0;
	  
    zooFood beef = new zooFood("beef", 50);
    zooMammal tiger = new zooMammal("Tiger", 6, "Jungle", beef, true, "Orange and Black", true, "Carnivore");
  
    zooFood bamboo = new zooFood("bamboo", 50);
    zooMammal panda = new zooMammal("Panda", 2, "Forest", bamboo, true, "Black and White", true, "Herbivore");
  
    zooFood fish = new zooFood("fish", 50);
    zooBird penguin = new zooBird("Penguin", 20, "Artic", fish, "Black and White", false, "Carnivore");
  
    zooFood fishFood = new zooFood("Fishfood", 50);
    zooFish clownFish = new zooFish("Clownfish", 4, "Aquarium", fishFood, "Orange, White, and Black", "Omnivore", 6, "Small");
    zooFish blueTang = new zooFish("Blue Tang", "Aquarium", fisihFood, “Blue, Black, and Yellow”, “Omnivore”, 5, “Small”);
    
    zooAnimal[][] anArray = new zooAnimal[2][3];
    anArray[0][0] = tiger;
    anArray[0][1] = panda;
    anArray[1][0] = penguin;
    anArray[1][1] = toucan;
    anArray[2][0] = blueTang;
    anArray[2][1] = clownFish;
    
    zooFood[] foArray = new zooFood[4];
    foArray[0] = beef;
    foArray[1] = bamboo;
    foArray[2] = fish;
    foArray[3] = fishFood;
    
    while(userNum != 7)
    	{
    	System.out.println("What animal would you like to choose? (choose a number betwen 1 - 6");
    	userNum = scnr.nextInt();
    	if(userNum > 0 & userNum < 7)
    	{
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
    		  		System.out.println(beef.getFoodNum());
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
    		  userNum = 0;
    		  System.out.println("This is a Panda!");
    		  while(userNum != 4) {
        		  System.out.println("What would you like to do next?");
        		  System.out.println("1. Check number of animals\n" + "2. check Which enclosure\n" + "3. Check what food is eaten\n" + "4. search for new animal");
        		  userNum = scnr.nextInt();
        		  	if(userNum == 1)
        		  	{
        		  		System.out.println(panda.getAnimalNum());
        		  	}
        		  	else if(userNum == 2)
        		  	{
        		  		System.out.println(panda.getEnclosure());
        		  	}
        		  	else if(userNum == 3)
        		  	{
        		  		System.out.println(bamboo.getFoodNum());
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
    	  case 3:
    		  userNum = 0;
    		  System.out.println("This is a Penguin!");
    		  while(userNum != 4) {
        		  System.out.println("What would you like to do next?");
        		  System.out.println("1. Check number of animals\n" + "2. check Which enclosure\n" + "3. Check what food is eaten\n" + "4. search for new animal");
        		  userNum = scnr.nextInt();
        		  	if(userNum == 1)
        		  	{
        		  		System.out.println(penguin.getAnimalNum());
        		  	}
        		  	else if(userNum == 2)
        		  	{
        		  		System.out.println(penguin.getEnclosure());
        		  	}
        		  	else if(userNum == 3)
        		  	{
        		  		System.out.println(fish.getFoodNum());
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
    	  case 4:
    		  userNum = 0;
    		  System.out.println("This is a Toucan!");
    		  while(userNum != 4) {
        		  System.out.println("What would you like to do next?");
        		  System.out.println("1. Check number of animals\n" + "2. check Which enclosure\n" + "3. Check what food is eaten\n" + "4. search for new animal");
        		  userNum = scnr.nextInt();
        		  	if(userNum == 1)
        		  	{
        		  		System.out.println(toucan.getAnimalNum());
        		  	}
        		  	else if(userNum == 2)
        		  	{
        		  		System.out.println(toucan.getEnclosure());
        		  	}
        		  	else if(userNum == 3)
        		  	{
        		  		System.out.println(fishFood.getFoodNum());
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
    	  case 5:
    		  userNum = 0;
    		  System.out.println("This is a Blue Tang!");
    		  while(userNum != 4) {
        		  System.out.println("What would you like to do next?");
        		  System.out.println("1. Check number of animals\n" + "2. check Which enclosure\n" + "3. Check what food is eaten\n" + "4. search for new animal");
        		  userNum = scnr.nextInt();
        		  	if(userNum == 1)
        		  	{
        		  		System.out.println(blueTang.getAnimalNum());
        		  	}
        		  	else if(userNum == 2)
        		  	{
        		  		System.out.println(blueTang.getEnclosure());
        		  	}
        		  	else if(userNum == 3)
        		  	{
        		  		System.out.println(beef.getFoodNum());
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
    	  case 6:
    		  userNum = 0;
    		  System.out.println("This is a Clownfish!");
    		  while(userNum != 4) {
        		  System.out.println("What would you like to do next?");
        		  System.out.println("1. Check number of animals\n" + "2. check Which enclosure\n" + "3. Check what food is eaten\n" + "4. search for new animal");
        		  userNum = scnr.nextInt();
        		  	if(userNum == 1)
        		  	{
        		  		System.out.println(clownFish.getAnimalNum());
        		  	}
        		  	else if(userNum == 2)
        		  	{
        		  		System.out.println(clownFish.getEnclosure());
        		  	}
        		  	else if(userNum == 3)
        		  	{
        		  		System.out.println(fishFood.getFoodNum());
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
    	else
    	{
    		System.out.println("This is not a valid number, try again.");
    	}
    	}
    	
  }
}

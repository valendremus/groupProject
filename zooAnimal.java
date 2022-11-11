
public class zooAnimal {
private String animalName;
private int animalNum;
private String enclosure;
private zooFood food;

//constructors
public zooAnimal(){
  animalName = "No name inputted.";
  animalNum = 0;
  enclosure = "No enclosure specified.";
}
public zooAnimal(String name, int num, String enc){
  animalName = name;
  animalNum = num;
  enclosure = enc;
}
  
//setter methods
public void setAnimalName(String n){
  animalName = n;
}
public void setAnimalNum(int num){
  animalNum = num;
}
public void setEnclosure(String e){
	enclosure = e;
}

//getter methods
public String getAnimalName(){
  return this.animalName;
}
public int getAnimalNum(){
  return this.animalNum;
}
public String getEnclosure(){
  return this.enclosure;
}

//get foodName (maybe in zooFood)
//get foodNum (maybe in zooFood)
}

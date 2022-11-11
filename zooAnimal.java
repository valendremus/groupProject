
public class zooAnimal {
private String animalName;
private int animalNum;
private String enclosure;

//constructors
public zooAnimal(){
  animalName = "No name inputted.";
  animalNum = 0;
  enclosure = "No enclosure specified.";
  
}
public zooAnimal(String name, int num, String enc, zooFood food){
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

public void PrintInfo(){
  System.out.println("Animal: " + getAnimalName());
  System.out.println("Number of " + getAnimalName() + "s: " + getAnimalNum());
  System.out.println("Enclosure Name: " + getEnclosure());
}

}

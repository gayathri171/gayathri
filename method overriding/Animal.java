class Animal{
	void Eating(){
		System.out.println("Eating food..");
	}
	void makeSounds(){
		System.out.println("sounds made by animals..");
	}
}
class WildAnimals extends Animal{
	void Eating(){
		System.out.println("wildanimals eat hunted animals..");
	}
}
class DomesticAnimals extends Animal{
	void Eating(){
		System.out.println("domestic animals eat leaves");
	}
}
class Tester{
	public static void main(String[] args){
	System.out.println("main method started..");
	new Animal().Eating();
	new Animal().makeSounds();
	System.out.println("-----------");
	new WildAnimals().Eating();
	System.out.println("-----------");
	new DomesticAnimals().Eating();
	System.out.println("main method ended..");
	}
}
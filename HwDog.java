package JavaBasicAssignmentClass11;

public class HwDog {
String breed;
double weight;
String color;
String name;
int age;

	void bark() {
		System.out.println("dog barks");
	}
	void outgoing() {
		System.out.println("dog likes going out");
	}
	void protect() {
		System.out.println("dog protects");
	}
		public static void main(String[]args) {
		
	
		
		HwDog husky=new HwDog();
		husky.breed= "Huskybreed";
		husky.weight= 55;
		husky.color= "white";
		husky.name= "maxi";
		husky.age= 15;
		husky.outgoing();
		
		HwDog bulldog = new HwDog();
		bulldog.breed="Bulldog";
		bulldog.weight= 75;
		bulldog.color= "brown";
		bulldog.name= "Hunter";
		bulldog.age=15;
		bulldog.protect();
		
		HwDog Labrador=new HwDog();
		Labrador.breed="labrador";
		Labrador.weight=55;
		Labrador.color= "white";
		Labrador.name= "Mari";
		Labrador.age= 20;
		Labrador.bark();
	}	
	}

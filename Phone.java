package JavaBasicAssignmentClass11;

public class Phone {
double size;
String color;
double price; 
String make;
String brand;

	void TurnOn() {
		System.out.println("Welcome to Iphone ");
	}
	void play() {
		System.out.println("plays music");
	}
	void picture() {
		System.out.println("takes picture");
	}
	
	
	public static void main(String[]args) {
		Phone Iphone=new Phone();
		Iphone.size= 6.7;
		Iphone.color= "blue";
		Iphone.price= 1199;
		Iphone.make= "USA";
		Iphone.brand= "Apple";
		Iphone.TurnOn();
		
		Phone pixel=new Phone();
		
		pixel.color="black";
		pixel.size= 5.6;
		pixel.price= 699;
		pixel.make= "USA";
		pixel.brand= "Goole";
		pixel.play();
		
		Phone samsung=new Phone();
		
		samsung.size= 10.5;
		samsung.color= "white";
		samsung.price= 999.99;
		samsung.make= "South Korea";
		samsung.brand= "Samsung";
		samsung.picture();
		
		
		
	}
}
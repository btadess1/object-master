package objects;

public class HumanTester {

	public static void main(String[] args) {
		
		//instantiates different humans (Ninja, Samurai, Wizard,Human)
		Human hum = new Human();
		Human nhum = new Ninja();
		Human whum = new Wizard();
		Human shum = new Samurai();

		System.out.println(nhum.health);
		
		//make the interaction
		hum.attack(nhum);
		System.out.println(nhum.health);
		
		//you can make other tests to see the interaction

	}

}

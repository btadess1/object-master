package objects;

public class HumanTest {

	public static void main(String[] args) {

		Human hum1 = new Human();
		Human hum2 = new Human();
		System.out.println(hum2.health);
		hum1.attack(hum2);
		System.out.println(hum2.health);
		

	}

}

package objects;

public class Human {
	int strength = 3, stealth = 3, intelligence = 3, health= 100;
	
	/**
	 * This method reduces the health of the human attacked by the strength of 
	 * the attacker
	 * @param human Human
	 */
	public void attack(Human human){
		human.health -= this.stealth;
	}
}

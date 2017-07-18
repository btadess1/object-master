package objects;

public class Samurai extends Human{
	static int numOfSamuri = 0;
	
	public Samurai(){
		super();
		this.health = 200;
		numOfSamuri++;
	}
	
	public void deathBlow(Human human){
		human.health = 0;
		this.health /= 2;
	}
	
	public void meditate(){
		this.health += this.health/2;
	}
	
	public int howMany(){
		return numOfSamuri;
	}
}

package duelMark;

public class CharacterB implements Dueler
{
	private int hp;
	
	public void taunt(){
		System.out.println("It's high noon...");
	}
	public String getName(){
		return "Jesse McCree";
	}
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	public int getHP() {
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		return (d.hp > hp);
	}
	public int getAction(Object caller) {
		//return the action chosen for this round
		//Object is the object calling this method. Use it to verify your opponent is not trying to gain the upperhand by figuring out what you are doing.
		//no idea how to do this
		return 0;
	}
	public void hit(Object caller) {
		//likely wrong
		if (caller instanceof Duel) {
			this.hp -= 10;
		}
	}
}

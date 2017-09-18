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
		return 0;
	}
	public void hit(Object caller) {
		if (caller instanceof Duel) {
			caller.this.hp -= 10;
		}
	}
}

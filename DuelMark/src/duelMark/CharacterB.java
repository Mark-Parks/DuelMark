package duelMark;

public class CharacterB implements Dueler
{
	private int hp;
	private boolean enemyLoaded;
	private boolean selfLoaded;
	private Dueler d2;
	
	public void taunt(){
		System.out.println("It's high noon...");
	}
	public String getName(){
		return "Jesse McCree";
	}
	public void setStartingHP(int hp) {
		this.hp = hp;
		enemyLoaded = false;
		selfLoaded = true;
	}
	public int getHP() {
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		d2 = d;
		return (d.getHP() == hp);
	}
	public int getAction(Object caller) {
		//return the action chosen for this round
		//Object is the object calling this method. Use it to verify your opponent is not trying to gain the upperhand by figuring out what you are doing.
		if(caller instanceof Duel) {
			
			Duel duel = (Duel)caller;
		
			if(duel.getLastActionOf(d2) == duel.LOADING)
			{
				enemyLoaded = true;
			}
			if(duel.getLastActionOf(d2) == duel.SHOOTING)
			{
				enemyLoaded = false;
			}
			if(enemyLoaded == false && selfLoaded == false){
				selfLoaded = true;
				return duel.LOADING;
			}
			else if(selfLoaded == true){
				selfLoaded = false;
				return duel.SHOOTING;
			}
			else
			{
				return duel.GUARDING;
			}
		}
		return 3;
	}
	public void hit(Object caller) {
		//likely wrong
		if (caller instanceof Duel) {
			hp -= 10;
		}
	}
}

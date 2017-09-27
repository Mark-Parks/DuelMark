package duelMark;

public class CharacterA implements Dueler
{
	private int hp;
	private boolean loaded;
	private String taunts[] = {"You suck for than a lolipop!","Get on outta here!"};
	
	public CharacterA() {
		loaded = false;
	}
	
	public void taunt(){
		if(Math.random() > .5)
			System.out.println(taunts[0]);
		else
			System.out.println(taunts[1]);
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
		return (d.getHP() > hp);
	}
	public int getAction(Object caller) {
		
		if( caller instanceof Duel) {
			
			if(loaded == false) {
				if(Math.random() > 0.5) {
					return Duel.GUARDING;
				}else {
					return Duel.LOADING;
				}
			}else {
				if(Math.random() > 0.5) {
					return Duel.GUARDING;
				}else {
					return Duel.SHOOTING;
				}
			}
		}
		return Duel.YEAH_RIGHT;
	}
	public void hit(Object caller) {
		if (caller instanceof Duel) {
			this.hp -= 10;
		}
	}
}

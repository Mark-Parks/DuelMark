package duelMark;

public class CharacterB implements Dueler
{
	public void taunt(){
		System.out.println();
	}
	public String getName(String name){
		return name;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setStartingHP(int hp) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getAction(Object caller) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void hit(Object caller) {
		// TODO Auto-generated method stub
		
	}
}

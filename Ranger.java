package pr2.zork;

public class Ranger extends Character 
{
	health = 3; //health
	intelli = 2; //intelligence
	dex = 5; //dexterity
	str = 1; //strength
	private int quiver;
	
	public int dano( Object Arrow )
	{
		quiver--;
		return (Arrow.getDamage() + str);
	}
}


package pr2.zork;

public class Warrior extends Character 
{
	health = 4; //health
	intelli = 1; //intelligence
	dex = 2; //dexterity
	str = 5; //strength
	
	public int dano( Object Sword )
	{
		return (Sword.getDamage() + str);
	}
}


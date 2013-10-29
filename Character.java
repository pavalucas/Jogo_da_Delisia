package pr2.zork;

public abstract class Character
{
	private int health; //health
	private int intelli; //intelligence
	private int dex; //dexterity
	private int str; //strength
	
	public abstract int dano(Object weapon);
	
	public void basicAttack(Object Thing) //Method to define the basic attacks from our classes
	{
		 Thing.setLife( Thing.getLife() - dano() );
	}
	
	
	//getter and setter for health
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	//getter and setter for intelligence
	public int getIntelli() {
		return intelli;
	}
	public void setIntelli(int intelli) {
		this.intelli = intelli;
	}
	
	//getter and setter for dexterity
	public int getDex() {
		return dex;
	}
	public void setDex(int des) {
		this.dex = des;
	}
	
	//getter and setter for strength
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}


}

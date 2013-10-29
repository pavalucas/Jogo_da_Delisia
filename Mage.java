package pr2.zork;

public class Mage extends Character {
	
	public int dano(Object weapon){
		int dmg = weapon.getDamage;
		int dmgTotal = (getIntelli()/5) + dmg;
		return dmgTotal;
	}
	
	public void basicAttack(Object defender){
		defender.setLife(defender.getLife - dano(/*blabla*/));
		System.out.print("Wooosh");
	}
}

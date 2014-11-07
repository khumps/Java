//~Deh

public class Mage
{
	private int level;
	private static Random rng = new Random();
	
	public Mage(int level){
		this.level = level;
	}

	public boolean fireball(int[] hp)
	{
		boolean allDead - true;
		int damage = getFireballDamage();
		for(int i = 0; i < hp.length; i++){
			hp[i] -= damage;
			if(hp[i]<= 0)
				hp[i] = 0;
			else
				allAreDead = false;
		}
	}
	
	public int getFireballDamage(){
		int damage = 0;
		for(int i = 0; i < level; i++){
			
		}
	}
}
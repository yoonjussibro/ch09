package ch09;

public class Player {
	public void cMove(character c) {
		c.move();
	}
	
	public void cStop(character c) {
		c.stop();
	}
	
	public void cAttack(character c) {
		c.attack();
	}
	
	public void cSkill(character c) {
		c.skill();
	}
}

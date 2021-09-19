package task6;

public class TaskStart {

    public static void main(String[] args) {
	Hero warrior = new Warrior(3, 5, 10, "Воин");
	Hero mage = new Mage(1, 4, 10, 100, "Маг");
	Hero archer = new Archer(1, 4, 3, 100, "Лучник");
	
	while(warrior.getHealth() > 0) {
	    warrior.makeMove();
	}
	System.out.println("-------");
	while(mage.getResource() > 2) {
	    mage.makeMove();
	}
	System.out.println("-------");
	while(archer.getResource() > 0) {
	    archer.makeMove();
	}
    }

}

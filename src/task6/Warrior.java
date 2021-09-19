package task6;

public class Warrior extends Hero {

    public Warrior(int armor, int damage, int health, String name) {
	super(armor, damage, 0, health, name);
    }

    @Override
    public void attackTarget() {
	System.out.printf("%s атакует цель на %d урона мечом\n", getName(), (int)(Math.random() * 10));
    }

}

package task6;

public class Mage extends Hero {

    public Mage(int armor, int damage, int resource, int health, String name) {
	super(armor, damage, resource, health, name);
    }

    @Override
    public void attackTarget() {
	int manaSpent = (int)(Math.random() * 5);
	String s;
	if(manaSpent <= getResource()) {
	    setResource(getResource() - manaSpent);
	    s = String.format("%s атакует цель на %d урона заклинанием, тратя %d маны. Осталось %d маны\n", 
		    getName(), (int)(Math.random() * 10), manaSpent, getResource());
	} else {
	    s = String.format("%s не хватает маны чтобы произнести заклинание!\n", getName());
	}
	
	System.out.print(s);
    }

}

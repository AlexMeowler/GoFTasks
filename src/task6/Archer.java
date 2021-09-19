package task6;

public class Archer extends Hero {

    public Archer(int armor, int damage, int resource, int health, String name) {
	super(armor, damage, resource, health, name);
    }

    @Override
    public void attackTarget() {
	String s;
	if(getResource() >= 1) {
	    setResource(getResource() - 1);
	    s = String.format("%s стреляет в цель на %d урона. Осталось %d стрел\n", 
		    getName(), (int)(Math.random() * 10), getResource());
	} else {
	    s = String.format("%s не хватает стрел чтобы выстрелить!\n", getName());
	}
	
	System.out.print(s);
    }

}

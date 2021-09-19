package task6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Hero {
    
    private int armor;
    private int damage;
    private int resource;
    private int health;
    private String name;
    
    public void makeMove() {
	chooseTarget();
	attackTarget();
	receiveDamage((int)(Math.random() * 10));
    }
    
    private void chooseTarget() {
	System.out.printf("%s: цель выбрана\n", name);
    }
    
    protected abstract void attackTarget();
    
    private void receiveDamage(int damage) {
	int damageGot = Math.max(damage - armor, 0);
	health -= damageGot;
	System.out.printf("%s получил %d урона, осталось %d здоровья\n", getName(), damageGot, health);
    }

}

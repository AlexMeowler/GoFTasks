package task10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class AutoBase {
    
    private String name;
    private String description;
    private double costBase;
    
    public abstract double getTotalCost();
    
    @Override
    public String toString() {
	return String.format("Ваш автомобиль %s\nОписание %s\nСтоимость %.2f", name, description, getTotalCost());
    }
}

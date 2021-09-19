package task4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractCar {

    private String name;

    public abstract int maxSpeed(AbstractEngine engine);

}

package task10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class DecoratorOptions extends AutoBase {
    
    private AutoBase autoProperty;
    private String title;

}

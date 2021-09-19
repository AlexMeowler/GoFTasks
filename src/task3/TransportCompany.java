package task3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class TransportCompany {
    
    private String name;
    
    public TransportCompany(String name) {
	setName(name);
    }
    
    @Override
    public String toString() {
	return name;
    }
    
    public abstract TransportService create(String name, int category);
}

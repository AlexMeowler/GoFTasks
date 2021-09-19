package task5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Search {
    
    private SearchType type;
    
    public abstract String buildWay(int destination);
    
    enum SearchType {
	AUTO_ROADS,
	CYCLING_ROADS,
	PEDESTRIAN_ROADS,
	PUBLIC_TRANSPORT_ROADS,
	SIGHTSEEING
    }
}

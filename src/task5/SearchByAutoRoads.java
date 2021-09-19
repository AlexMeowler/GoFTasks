package task5;

public class SearchByAutoRoads extends Search {
    
    public SearchByAutoRoads() {
	setType(SearchType.AUTO_ROADS);
    }

    @Override
    public String buildWay(int destination) {
	return String.format("Постройка маршрута по автодорогам до пункта %d", destination);
    }
    
}

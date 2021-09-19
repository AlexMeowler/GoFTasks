package task5;

public class SearchByPedestrianRoads extends Search {
    
    public SearchByPedestrianRoads() {
	setType(SearchType.PEDESTRIAN_ROADS);
    }

    @Override
    public String buildWay(int destination) {
	return String.format("Постройка маршрута по пешеходным дорогам до пункта %d", destination);
    }

}

package task5;

public class SearchByCyclingRoads extends Search {
    
    public  SearchByCyclingRoads() {
	setType(SearchType.CYCLING_ROADS);
    }

    @Override
    public String buildWay(int destination) {
	return String.format("Постройка маршрута по велодорожкам до пункта %d", destination);
    }

}

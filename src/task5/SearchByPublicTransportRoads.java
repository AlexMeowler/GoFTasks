package task5;

public class SearchByPublicTransportRoads extends Search {
    
    public SearchByPublicTransportRoads() {
	setType(SearchType.PUBLIC_TRANSPORT_ROADS);
    }

    @Override
    public String buildWay(int destination) {
	return String.format("Постройка маршрута на общественном транспорте до пункта %d", destination);
    }
    
}

package task5;

public class SearchBySightseeing extends Search {
    
    public SearchBySightseeing() {
	setType(SearchType.SIGHTSEEING);
    }

    @Override
    public String buildWay(int destination) {
	return String.format("Постройка маршрута с посещением достопримечательностей до пункта %d", destination);
    }

}

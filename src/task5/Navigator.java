package task5;

import java.util.List;

import task5.Search.SearchType;

public class Navigator {
    
    private String map;
    private List<Search> searchMethods;
    
    public Navigator() {
	map = "Карта";
	searchMethods = List.of(new SearchByAutoRoads(), new SearchByCyclingRoads(), 
		new SearchByPedestrianRoads(), new SearchByPublicTransportRoads(), 
		new SearchBySightseeing());
    }
    
    public String getMap() {
	return map;
    }
    
    public String findWay(SearchType type, int destination) {
	return searchMethods.stream() // все стратегии
		.filter(method -> method.getType().equals(type)) // фильтруем по типу выбраной стратегии
		.findFirst().orElseThrow(() -> new NullPointerException("Стратегия не поддерживается")) // берем стратегию или выкидываем ошибку если не найдено (такого быть не должно)
		.buildWay(destination);
    }
}

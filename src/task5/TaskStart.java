package task5;

import task5.Search.SearchType;

public class TaskStart {

    public static void main(String[] args) {
	
	Navigator navigator = new Navigator();
	
	System.out.println(navigator.findWay(SearchType.AUTO_ROADS, 1));
	System.out.println(navigator.findWay(SearchType.CYCLING_ROADS, 2));
	System.out.println(navigator.findWay(SearchType.PEDESTRIAN_ROADS, 3));
	System.out.println(navigator.findWay(SearchType.PUBLIC_TRANSPORT_ROADS, 4));
	System.out.println(navigator.findWay(SearchType.SIGHTSEEING, 5));
    }

}

package homeWork_22;


public class MainExmpl {

    public static void main(String[] args) throws InterruptedException {

        CacheCreator cacheCreator = new CacheCreator();

        cacheCreator.put("cache_1", "Ivanov", "034");
        cacheCreator.put("cache_2", "Petrov", "125");
        cacheCreator.put("cache_3", "Sidorov", "567");
        cacheCreator.put("cache_4", "Dmitriev", "321");

        cacheCreator.get("cache_2", "Petrov");

        cacheCreator.clear("cache_2");
        cacheCreator.get("cache_2", "Petrov");

        cacheCreator.clear();
        System.out.println("Give all the elements of the map: "+cacheCreator.mpMaps);
        cacheCreator.get("cache_3", "Sidorov");


    }
}

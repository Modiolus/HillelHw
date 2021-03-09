package homeWork_22;

import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

@ToString
public class CacheCreator implements CacheHW {
    private static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
    private static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");

    Map<String, Object> mp;
    Map<String, Object> mpMaps = new HashMap<String, Object>();

    /**
     * Method puts element with parameters
     *
     * @param cache - cache
     * @param key   - key
     * @param o     - o
     * @return true
     */
    @Override
    public boolean put(String cache, String key, Object o) {
        mp = new HashMap<String, Object>();
        mp.put(key, o);

        mpMaps.put(cache, mp);
        loggerDebug.debug("put: " + cache + "=" + mp);

        return true;
    }

    /**
     * Method gets element with parameters
     *
     * @param cache - cache
     * @param key   - key
     * @return If there is no such object - returns null. If such an object is present it returns this object
     */
    @Override
    public Object get(String cache, String key) {

        if (!mpMaps.isEmpty()) {
            Map<String, Object> temp = (Map<String, Object>) mpMaps.get(cache);
            if (mpMaps.get(cache) == null) {
                loggerWarn.warn("getObject: (" + cache + ") That cache doesn't exist!");
            } else if (temp.get(key) == null) {
                loggerWarn.warn("getObject: (" + key + ") That key doesn't exist!");
            } else {
                loggerDebug.debug("getObject: (" + cache + ", " + key + ") = " + temp.get(key));
                return temp.get(key);
            }

        } else {
            loggerWarn.warn("Map is empty!");
        }
        return null;
    }

    /**
     * Method clears all the elements in the map
     */
    @Override
    public void clear() {
        mpMaps = new HashMap<String, Object>();
        loggerDebug.debug("The method clear was called");
        if (mpMaps.isEmpty()) {
            loggerWarn.warn("Map is empty!");
        }
    }

    /**
     * Method clears element with parameters in map
     *
     * @param cache - cache
     */
    @Override
    public void clear(String cache) {
        loggerDebug.debug("The method clear with (" + cache + ") was called");
        if (!mpMaps.isEmpty()) {
            mpMaps.remove(cache);

        }
    }

}

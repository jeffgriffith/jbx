package jbx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JbxUtil {
	
	@SafeVarargs
	public static <T> List<T> list(T... values) {
		List<T> mutableList = new ArrayList<>();
		Arrays.stream(values).forEach(mutableList::add);
		return mutableList;
	}
	
	@SafeVarargs
	public static <T> Set<T> set(T... values) {
		Set<T> set = new HashSet<T>();
		Arrays.stream(values).forEach(set::add);
		return set;
	}
	
    @SuppressWarnings("unchecked")
    public static <K, V> Map<K, V> map(Object... values) {

        if (values.length % 2 != 0)
            throw new IllegalArgumentException("Value array must come in pairs.");

        Map<K, V> map = new HashMap<K, V>();

        for (int i = 0; i < values.length; i += 2) {
            map.put((K) values[i], (V) values[i + 1]);
        }
        return map;
    }
}

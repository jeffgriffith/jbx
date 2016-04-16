package jbx;

import static jbx.JbxCollections.list;
import static jbx.JbxCollections.map;
import static jbx.JbxCollections.set;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestCollections {

	@Test
	public void testList() {
		List<String> l = list("a", "b", "c");
		l.add("d");
		assertEquals(4, l.size());
		
		List<String> empty = list();
		assertEquals(0, empty.size());
	}

	@Test
	public void testSet() {
		Set<String> s = set("a", "b", "c");
		s.add("d");
		assertEquals(4, s.size());
		
		Set<String> empty = set();
		assertEquals(0, empty.size());
	}
	
	@Test
	public void testMap() {
		Map<String,Integer> m = map("Foo", 1, "Bar", 2, "Baz", 3);
		assertEquals(3, m.get("Baz").intValue());
		assertEquals(null, m.get("Splat"));
	}
}

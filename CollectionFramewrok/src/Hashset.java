//import java.util.*;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		

Map<Integer,String> indmap = new HashMap<Integer, String>();
indmap.put(7, "Dohni");
indmap.put(8, "Virat");
indmap.put(10, "Rohit");
Map<Integer,String> ausmap = new HashMap<Integer, String>();
ausmap.put(1, "Smith");
ausmap.put(22, "Warner");
ausmap.put(12, "Maxwell");

Map<Integer,String> iplmap = new HashMap<Integer, String>();
iplmap.putAll(indmap);
iplmap.putAll(ausmap);
System.out.println("size:"+iplmap.size());
System.out.println("Boolean:"+iplmap.isEmpty());
iplmap.remove(22);
System.out.println("key:"+iplmap.containsKey(1));
System.out.println("value"+iplmap.containsValue("Rohit"));
System.out.println(iplmap.get(8));
System.out.println(iplmap.get(12));
System.out.println(iplmap.size());
}}

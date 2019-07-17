import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

@SuppressWarnings("rawtypes")
public static void main(String[] args) {
	TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
	tm.put(34,"ygcty");
	tm.put(65, "gctucgh");
	tm.put(67, "gcftgg");
	tm.put(90007, "gxrfrxxf");
	
	for(Map.Entry m:tm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	tm.remove(90007);
	tm.putIfAbsent(6754, "arg1");
	System.out.println(tm);
}
}

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
	LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
	lhm.put(3667, "gsxhvdsah");
	lhm.put(120,"gsxvwydcvy");
	lhm.put(7388,"gfcytch");
	lhm.put(656, "gfcytch");
	
	for(Map.Entry m:lhm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	long startTime 
    = System.nanoTime(); 
for (int i1 = 0; i1 < 6; i1++) { 
    lhm.put(i1, null); 
} 
long endTime = System.nanoTime(); 
System.out.println("Total time to insert ArrayList in sec : "+ (endTime - startTime));
}
}

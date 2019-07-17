import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(101, "hxbhs");
	hm.put(3646, "gsvshag");
	hm.put(103, "hwdvwy");
	hm.put(16, "gvcdgs");
	hm.put(10007, "hwdvwy");
	
	
	for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	hm.remove(106);
	System.out.println();
	 hm.replaceAll((k,v) -> "fgdf");  
	 System.out.println(hm);
	 long startTime 
	    = System.nanoTime(); 
	for (int i1 = 0; i1 < 6; i1++) { 
	    hm.put(i1, null); 
	} 
	long endTime = System.nanoTime(); 
	System.out.println("Total time to insert ArrayList in sec : "+ (endTime - startTime));

	
}
}

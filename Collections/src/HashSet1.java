import java.util.HashSet;

public class HashSet1 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add("remove");
	hs.add("123");
	hs.add("");
	//hs.add(null);
	HashSet hs1=new HashSet();
	hs1.add("anoohya");
	hs1.add("123");
//	hs1.add(123);
	hs.addAll(hs1);
//	hs.removeIf(str-> ((String) str).contains("123"));
//	hs.clear();
	System.out.println(hs);
	hs.removeAll(hs);
	System.out.println(hs);
	long startTime 
    = System.nanoTime(); 
for (int i = 0; i < 10; i++) { 
    hs.add(i); 
} 
long endTime = System.nanoTime(); 
System.out.println("Total time to insert HashSet in sec : "+ (endTime - startTime)); 

}
}

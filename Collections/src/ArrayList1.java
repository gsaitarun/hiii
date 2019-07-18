import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("anoohya");
	a.add("swathi");
	a.add(2,"tarun");
	a.add("sreelekha");
	a.add("hema");

	a.add(2,"rahul");

	a.remove(1);

	//System.out.println(a);
	/*a.removeAll(a);
	System.out.println(a.isEmpty());*/
	Iterator i=a.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		
	}
	long startTime 
    = System.nanoTime(); 
for (int i1 = 0; i1 < 6; i1++) { 
    a.add(i1); 
} 
long endTime = System.nanoTime(); 
System.out.println("Total time to insert ArrayList in sec : "+ (endTime - startTime)); 

}
}

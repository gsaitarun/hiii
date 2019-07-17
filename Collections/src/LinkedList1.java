
import java.util.LinkedList;

public class LinkedList1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList b=new LinkedList();
		b.add("anoohya");
		b.add("swathi");
		b.add("sreelekha");
		b.add("hema");
		//b.removeFirst();
		System.out.println(b);
		long startTime 
        = System.nanoTime(); 
    for (int i = 0; i < 6; i++) { 
        b.add(i); 
    } 
    long endTime = System.nanoTime(); 
    System.out.println("Total time to insert  LinkedList in sec : " + (endTime - startTime)); 

	}
}

import java.util.LinkedList;
import java.util.Queue;


public class Queue1 {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	Queue pq=new LinkedList();
	pq.add("anoohya");

	pq.add("swathi");
	pq.add("hema");
	pq.add("sreelekha");

	System.out.println(pq);
	/*Iterator i=pq.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		
	}*/

	System.out.println(pq.element());
	System.out.println(pq.poll());
	System.out.println(pq.peek());

	System.out.println(pq);
	System.out.println(pq.remove());
	}
	}



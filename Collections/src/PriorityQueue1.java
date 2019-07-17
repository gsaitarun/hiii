import java.util.Iterator;
import java.util.PriorityQueue;

@SuppressWarnings("unused")
public class PriorityQueue1 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
PriorityQueue pq=new PriorityQueue();
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

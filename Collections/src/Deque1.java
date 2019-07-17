import java.util.ArrayDeque;
import java.util.Deque;
public class Deque1 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	Deque de=new ArrayDeque();
	
	de.add("swathi");
	de.offerLast("anoohya");
	de.add("sreelekha");
	de.offerFirst("hema");
	System.out.println(de);
	
	
}
}

import java.util.*;
public class LinkedHashSet1 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add("1st year");
	lhs.add("2nd year");
	lhs.add("3rd year");
	Iterator i=lhs.iterator();
	while(i.hasNext()) {
	System.out.println(i.next());
	}
}
}

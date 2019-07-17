import java.util.TreeSet;

public class TreeSet1 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add("a");
	ts.add("b");
	ts.add("c");
	ts.add("d");
	ts.add("e");
	ts.add("f");
	ts.add("g");
	System.out.println(ts.headSet("d",true));
	System.out.println(ts.tailSet("c",true));
	System.out.println(ts.subSet("a",true, "d", false));
	System.out.println(ts.headSet("a",false));
	System.out.println(ts.tailSet("c",false));
	System.out.println(ts.subSet("a",false, "d", true));
	System.out.println(ts.subSet("a",false, "d", false));
	System.out.println(ts.subSet("a",true, "d", true));
}
}

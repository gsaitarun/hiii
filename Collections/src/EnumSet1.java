import java.util.EnumSet;
import java.util.Set;
import java.util.Iterator;


class Enum1{
	enum months {
	
		JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
	}
	}
public class EnumSet1 {
public static void main(String[] args) {
	Set<months> es=EnumSet.of(months.APRIL);
	
 Iterator    iter = es.iterator();  
    while (iter.hasNext())  {
      System.out.print(iter.next());  
  }  
}  
}


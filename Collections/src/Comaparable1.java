import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class Breed  implements Comparable<Breed>
{
	int serial;
	String BreedName;
	int price;
	public Breed(int serial, String breedName, int price) {
		super();
		this.serial = serial;
		this.BreedName = breedName;
		this.price = price;
	}
	public int compareTo(Breed b) {
		if(price==b.price) 
			return 0;
		else if  ((price)<(b.price))
	     	return 1;
		else 
		return -1;
		
	}
}

public class Comaparable1  {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args)
{
	ArrayList a=new ArrayList();
	a.add(new Breed(1,"pug",4000));
	a.add(new Breed(2,"boo",35000));
	a.add(new Breed(3,"goldenretreiver",15000));
	a.add(new Breed(4,"bulldog",10000));
	a.add(new Breed(5,"german sheperd",5000));
	a.add(new Breed(6,"chihuahua",5600));
	Collections.sort(a);
	Iterator i=a.iterator();
	while(i.hasNext()) {
		Breed s=(Breed)i.next();
		System.out.println(s.serial+" "+s.BreedName+" "+s.price);

}
}
}

package Utils2;

import java.util.TreeSet;

public class TreeSeet {

	
	public static TreeSet<Object> PriceList1 = new TreeSet<Object>();
	
	public static void main(String[] args) {
		PriceList1.add(15999);
		PriceList1.add(5999);
		StringBuilder str = new StringBuilder("15999");
		
		String s = "5,999";
		int index = s.indexOf(",");
		str.insert(index, ",");
		System.out.println("str"+str);
		//System.out.println("Treeset"+PriceList1);

	}

}

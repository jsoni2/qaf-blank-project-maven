package j.j2003;

import java.util.ArrayList;

public class Java2003 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myitems = new ArrayList<Integer>(5);
		myitems.add(20);
		myitems.add(15);
		myitems.add(30);
		myitems.add(45);
		
		Integer removed = myitems.remove(0);
		System.out.println(removed);
		

	}

}

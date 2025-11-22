import java.util.HashMap;

public class Hm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     HashMap<Integer, String> hm=new HashMap<Integer, String>();
	       
	       hm.put(1, "Red");
	       hm.put(2, "Green");
	       hm.put(3, "Black");
	    
	       
     HashMap<Integer, String> hm2=new HashMap<Integer, String>();

	       hm2.put(6, "Pink");
	       hm2.put(5, "White");
	       hm2.put(4, "Blue");
	       
	       System.out.println("Values in first map: "+hm);
	       System.out.println("Values in 2nd map: "+hm2);
	       
	       hm.putAll(hm2); 
	       System.out.println(hm);
	       
	}

}

import java.util.HashMap;
import java.util.Map;

public class Hm10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, String> hm=new HashMap<Integer, String>();
	       
	       hm.put(1, "Red");
	       hm.put(2, "Green");
	       hm.put(3, "Black");
	       hm.put(4, "White");
	       hm.put(5, "Blue");
	       System.out.println(hm);
	       for(Map.Entry k : hm.entrySet()){
	    	   
	    	   System.out.println(k.getValue());
	       }
	       
	}

}

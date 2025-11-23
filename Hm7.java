import java.util.HashMap;

public class Hm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     HashMap<String, Integer> hm=new HashMap<String, Integer>();
	       
	        hm.put("Red", 1);
	        hm.put("White", 4);
	        hm.put("Blue", 5);
	        hm.put("Black", 3);
	        hm.put("Green", 2);
	       
	       String key1 = "Green";
	        if (hm.containsKey(key1)) {
	            System.out.println("Is key '" + key1 + "' exists?");
	            System.out.println("yes! - " + hm.get(key1));
	        } else {
	            System.out.println("Is key '" + key1 + "' exists?");
	            System.out.println("no!");
	        }
	        String key2 = "Orange";
	        if (hm.containsKey(key2)) {
	            System.out.println("Is key '" + key2 + "' exists?");
	            System.out.println("yes! - " + hm.get(key2));
	        } else {
	            System.out.println("Is key '" + key2 + "' exists?");
	            System.out.println("no!");
	        }
	}

}

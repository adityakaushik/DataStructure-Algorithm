import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SherlockAadTheValidString {

	
	
	public static String isValid(String s) {
	    // Write your code here
		
		HashMap<String, Integer> hm= new HashMap<>();
		 for(int i=0; i<s.length(); i++) {
			 
			 if(i==0) {
				 hm.put(String.valueOf(s.charAt(i)),1);
				
			 }else {
				 if(hm.containsKey(String.valueOf(s.charAt(i)))) {
					 hm.put(String.valueOf(s.charAt(i)),hm.get(String.valueOf(s.charAt(i)))+1);
					// System.out.println(hm);
				 }else {
					 hm.put(String.valueOf(s.charAt(i)),1);
					 
				 }
			 }
			 
			 
		 }
		
		System.out.println(hm);
		HashMap<Integer,Integer> hs=new HashMap<>();
		int k=0;
		for(Map.Entry<String, Integer> entry: hm.entrySet()) {
			 if(k==0) {
				 hs.put(entry.getValue(),1);
				
			 }else {
				 if(hs.containsKey(entry.getValue())) {
					 hs.put(entry.getValue(),hs.get(entry.getValue())+1);
					// System.out.println(hm);
				 }else {
					 hs.put(entry.getValue(),1);
					 
				 }
			 }
			 k++;
		}
		String result="";
		System.out.println(hs);
		if(hs.size()==1) {
			
			result= "YES";
		}else {
			if(hs.size()==2) {	
				
				if(hs.containsKey(1)) {
					if(hs.get(1)==1) {
						return "YES";
					}
					}
					int o=0;
					int t=0;
					int l=0;
					int ko=0;
					int kt=0;
					for(Map.Entry<Integer, Integer> entry: hs.entrySet()) {
						if(l==0) {
							o=entry.getValue();
							ko=entry.getKey();
						}
						else {
							t=entry.getValue();
							kt=entry.getKey();
						}
							
						l++;
					}
					 if(o==1||t==1) {
						 if(Math.pow(ko-kt, 2)==1) {
  							result= "YES";
							}else {
								result= "NO";
							}
						 
					 }
//					if(Math.pow(o-t, 2)==1) {
//						result= "YES";
//					}
					else {
						result= "NO";
					}
				
				
				
			}else {
				result= "NO";
			}
		}
		
		return result;
	    
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isValid("aaaaacd"));
	}

}

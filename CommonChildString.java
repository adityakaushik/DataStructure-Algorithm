import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CommonChildString {
	public static int commonChild(String s1, String s2) {
	    // Write your code here
		char[] arrA=s1.toCharArray();
		char[] arrB=s2.toCharArray();
		String subA="";
		String subB="";
		
		for(int i=0; i< s1.length(); i++) {
			if(s2.contains(String.valueOf(arrA[i]))) {
				subA=subA+String.valueOf(arrA[i]);
			}
			if(s1.contains(String.valueOf(arrB[i]))) {
				subB=subB+String.valueOf(arrB[i]);
			}
		}
		System.out.println(subA);
		System.out.println(subB);
		System.out.println(getAllSubstr(subA,subB));
		List<Integer> ls=(getAllSubstr(subA,subB));
		if(ls.size()>0) {
		Collections.sort(ls);
		return ls.get(ls.size()-1);
		}else {
			return 0;
		}
	    }
	static List<Integer> getAllSubstr(String s, String s2){
		
		List<Integer> ls=new ArrayList<Integer>();
		char[] arr= s.toCharArray();
		
		for (int i=0; i<s.length();i++) {
			String sub="";
			 for(int k=i+1; k<s.length(); k++) {
				// if(i!=k) {
				if(s2.contains(s.substring(i,k+1))){
					System.out.println(s.substring(i,k+1));
					ls.add(s.substring(i,k+1).length());
				}
				 //}
				
				 
			 }
			 
		}
		return ls;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS";
		String b="FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC";
//		SHINCHAN
//		NOHARAAA
		System.out.println(commonChild(a,b));
	
	}

}

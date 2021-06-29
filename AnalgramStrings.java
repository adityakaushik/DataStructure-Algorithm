import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AnalgramStrings {
	
	public static int makeAnagram(String a, String b) {
	    // Write your code here
		char [] arrA =a.toCharArray();
		char [] arrB =b.toCharArray();
		
		List<String> listA=new ArrayList<String>();
		List<String> listB=new ArrayList<String>();
		
		HashMap<String, Integer> hm1= new HashMap<>();
		int count=0;
		HashMap<String, Integer> hm2= new HashMap<>();
		for (int i=0; i<arrA.length; i++) {
			if(!b.contains(String.valueOf(arrA[i]))) {
				count=count+1;
				listA.add(String.valueOf(arrA[i]));
				
			}else {
				if(hm1.isEmpty()) {
					hm1.put((String.valueOf(arrA[i])),1);
				}else if(hm1.containsKey(String.valueOf(arrA[i]))){
					hm1.put((String.valueOf(arrA[i])),hm1.get(String.valueOf(arrA[i]))+1);
				}else {
					hm1.put((String.valueOf(arrA[i])),1);
				}
				
			}
		}
		System.out.println("After itr1"+count+"Values"+listA);
		for (int j=0; j<arrB.length; j++) {
			if(!a.contains(String.valueOf(arrB[j]))) {
				count=count+1;
				listB.add(String.valueOf(arrB[j]));
				
			}else {
				if(hm2.isEmpty()) {
					hm2.put((String.valueOf(arrB[j])),1);
				}else if(hm2.containsKey(String.valueOf(arrB[j]))){
					hm2.put((String.valueOf(arrB[j])),hm2.get(String.valueOf(arrB[j]))+1);
					//System.out.println(hm2.toString());
				}else {
					hm2.put((String.valueOf(arrB[j])),1);
				}
			}
		}
		System.out.println("After itr2, values of s"+hm2.get("s"));
		//List<List<String>> k=Arrays.asList(listA, listB);
		//listA.addAll(listB);
		
		Iterator hmIterator = hm1.entrySet().iterator();
		while(hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry)hmIterator.next();
			if(!(hm1.get(mapElement.getKey())==hm2.get(mapElement.getKey()))) {
				count=count+Math.abs(hm1.get(mapElement.getKey())-hm2.get(mapElement.getKey()));
			}
//			if(((int)mapElement.getValue())>2) {
//				count=count+((int)mapElement.getValue()-2);
//			}
			
		}
		System.out.println(count);
		return count;
		
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a="fcrxzwscanmligyxyvym";
//		String b="jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		//Expected Output:-107
		String a="tttttttttttttttttttttttttttttttttttttsssssssssssssssss";
		String b="sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss";
		System.out.println(makeAnagram(a,b));
	}

}

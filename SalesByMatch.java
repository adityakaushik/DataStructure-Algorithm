import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

	
	public static int sockMerchant(List<Integer> ar) {
		HashMap<Integer, Integer> hm=new  HashMap();
		for (int i=0; i<ar.size(); i++) {
			
			if(i==0) {
				hm.put(ar.get(i),1);
			}
			else {
				if(hm.containsKey(ar.get(i))) {
					hm.put(ar.get(i), hm.get(ar.get(i))+1);
				}else {
					hm.put(ar.get(i),1);
				}
			}
			
			
		}
		System.out.println(hm);
		int count=0;
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue()%2==0) {
				count=count+(entry.getValue()/2);
			}
			else {
				if (entry.getValue()!=1&&entry.getValue()%2==1) {
					count=count+(entry.getValue()/2);
				}
			}
		}
		return count;
	    // Write your code here

	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
		System.out.println(sockMerchant(ls));
		
	}

}

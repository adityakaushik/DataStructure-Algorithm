import java.util.List;
import java.util.ArrayList;

public class ArraysLeftRotation {

	
	public static List<Integer> arrayRotaion(ArrayList<Integer> arr, int unit){
		List<Integer> arr1= new ArrayList<Integer>();
		arr1=(arr.subList(unit, arr.size()));
		System.out.println(arr1);
		arr1.addAll(arr.subList(0,unit));
		return arr1;
		
	}
	
	public static void countbribe(ArrayList<Integer> q){
		
		int bribes=0;
		String msg="";
		
		for(int i=0 ;i<q.size();i++) {
			if(i!=q.size()-1) {
			if(q.get(i)>q.get(i+1)) {
				
				bribes++;
				System.out.println(q.get(i)+">>"+q.get(i+1));
				
			}
			if(i!=q.size()-2) {
				if(q.get(i)>q.get(i+2)) {
					System.out.println(q.get(i)+">>"+q.get(i+2));
					bribes++;
				}
				}
			
			if(i<q.size()-3) {
				if(q.get(i)>q.get(i+1)&&q.get(i)>q.get(i+2) &&q.get(i)>q.get(i+3)) {
					msg="Too chaotic";
					break;
				}
			}
			}
		}
		if(msg.equals("")) {
		System.out.println(bribes);
		}else {
			System.out.println(msg);
		}
	}
	
	
	
	public static void countbribe2(ArrayList<Integer> q){
		int count=0;
		String msg="";
		for(int i=1 ;i<=q.size();i++) {
			if(i==q.get(i-1)) {
			//	System.out.println(i);
			}else {
				//System.out.println("Number"+i+", postion:"+(q.indexOf(i)+1));
//				if(q.indexOf(i)>=i) {
					//System.out.println("----Number"+i+", postion:"+(q.indexOf(i)+1));
					if(q.indexOf(i)>=i) {
						for(int j=0; j<=(q.indexOf(i));j++) {
							if(q.get(j)>i) {
								count++;
							}
						}
					}
					
//					count=count+((q.indexOf(i)+1)-i);
//				}
			}
			if(i<q.size()-2) {
				if(q.get(i-1)>q.get(i)&&q.get(i-1)>q.get(i+1) &&q.get(i-1)>q.get(i+2)) {
					msg="Too chaotic";
					//break;
				}
			}
		}
		if(msg.equals("")) {
			System.out.println(count);
			}else {
				System.out.println(msg);
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int unit=4;
		ArrayList<Integer> arr= new ArrayList<Integer>();
//		arr.add(1);
//		arr.add(5);
//		arr.add(2);
//		
//		arr.add(3);
//		
//		arr.add(1);
//		arr.add(2);
//		arr.add(5);
//		arr.add(3);
//		arr.add(4);
//		arr.add(7);
//		arr.add(8);
//		arr.add(6);
		//1 2 5 3 7 8 6 4
		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.add(3);
		arr.add(7);
		arr.add(8);
		arr.add(6);
		arr.add(4);
		//arr.add(9);
		System.out.println(arr);
		//System.out.println(arrayRotaion( arr,unit));
		countbribe2(arr);
	}

}

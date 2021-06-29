
public class AlternatingCharacterString {
	
	
	public static int alternatingCharacters(String s) {
	    // Write your code here
		char [] arr=s.toCharArray();
		int count=0;
		for(int i=0; i<s.length();i++) {
			if(i!=0) {
				if(arr[i]==arr[i-1]) {
					count=count+1;
				}
			}
		}
		return count;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

import java.util.ArrayList;

public class FacebookBracket {

	
	public static int countpossibilities(int pair) {
		 String bracketsleft="";
		 String bracketsright="";
		 String brackets="";
		 ArrayList<String> arr= new ArrayList<>();
		for(int i=0; i<pair; i++) {
			bracketsleft=bracketsleft+"(";
			bracketsright=bracketsright+")";
			brackets=bracketsleft+bracketsright;
			arr.add(brackets);
			System.out.println(brackets);
		}
		System.out.println("----------------------------------------------------");
		int l=1;
		for(int k=0; k<arr.size(); k++) {
			l++;
			System.out.println(arr.get(k)+arr.get(arr.size()-l));
		}
		return 1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String brackets="(((())))";
		
		//countpossibilities(6);
		StringBuilder braclets=new StringBuilder("");
		backtrack(3,0,0,braclets);
		System.out.println(braclets);
	}
	
	
	public static void backtrack(int max, int open, int close, StringBuilder braclets) {
	System.out.println(braclets.length());
		int k=braclets.length();
		if(k==max*2) {
			return;
		}
		else if (open < max) {
			braclets.append("(");
			backtrack(max,open+1, close, braclets);
			braclets
		}
		else if(close < open) {
			braclets.append(")");
			backtrack(max,open, close+1, braclets);
		}
	}
}

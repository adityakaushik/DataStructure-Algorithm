class StringReverse
{
    /* Function to print reverse of the passed string */
    void reverse(String str, StringBuffer temp)
    {
        if ((str==null)||(str.length() <= 1)) {
//           System.out.println(str);
//           System.out.println(temp);
        }
        else
        {
            temp=temp.append(String.valueOf(str.charAt(str.length()-1)));
            reverse(str.substring(0,str.length()-1),temp);
        }
    }
     
    void  reverse2(String str, int i, int k)
    {
    	if(i<k) {
    		char ch[] = str.toCharArray();
            char temp = ch[i];
            ch[i] = ch[k];
            ch[k] = temp;
            str=String.valueOf(ch);
           // System.out.println("Inside :- "+str);
            reverse2(str,i+1, k-1 );
    	}else {
    		System.out.println (str);
    	}
       
    }
    boolean palidrome(String str,int i, int j) {
    	//char ch[] = str.toCharArray();
    	
    	if(i<j) {
    	
    	if( str.charAt(i)!=str.charAt(j)) {
    		return false;
    	}
    	
    	palidrome(str,i+1,j-1);
    	
    	
    	}
    	return true;
    	}
    
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        String str = "Geeks for Geeks";
        StringReverse obj = new StringReverse();
        StringBuffer x= new StringBuffer("");
        obj.reverse(str,x);
        System.out.println(x);
       // obj.reverse2(str, 0 , str.length()-1);
        String palidrome="abcbaff";
        System.out.println(obj.palidrome(palidrome,0, palidrome.length()-1));
    }   
}
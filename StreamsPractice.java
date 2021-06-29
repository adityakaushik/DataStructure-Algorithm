import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Function;
public class StreamsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(0, 2, 4, 6,
                8, 10, 12);
		String b="10100";
		
		 Stream.of(b.split("")).
		 map(s->Integer.valueOf(s)).
		 filter(x->x<1).
		 forEach(System.out::println);
//		 map(String::valueOf).
//		 filter(x->x.equals("0")).forEach(System.out::println);
//		//System.out.println(total);
		 
		 
		 //Functional Programming beauty:- instead of writing code as 3 function we can make 
		 //use of Function Interface java.util.function.Function and pass it as an
		 // argument to another function
		 Function <Integer,Double> area= x -> Math.PI * x *x;
		 Function <Integer,Double> circumfrance= x -> 2*Math.PI * x ;
		 Function <Integer,Double> diameter= (x ->Double.valueOf(2) * x) ;
		 calculateAndShow(3,circumfrance);
		 calculateAndShow(9,area);
		 calculateAndShow(4, diameter);
		 
		 //Using Streams for the above functions;
		 List<Double> radius=Arrays.asList(Double.valueOf(2),Double.valueOf(9),Double.valueOf(2));
		 radius.stream().map(x ->Double.valueOf(2) * x).forEach(System.out::println);
		 radius.stream().map( x -> 2*Math.PI * x).forEach(System.out::println);
		 
		 ///Getting Unique value of Arraylist withous loosing its order
		 LinkedHashSet<Double> lhs=new LinkedHashSet(radius);
		 System.out.println(lhs);
		 
		 //Convert HashMap to List
		 HashMap<String, Integer> employeeMap = new HashMap<String, Integer>(); 
         
	        employeeMap.put("emp01", 1);
	        employeeMap.put("emp02", 2);        
	        employeeMap.put("emp03", 3);
	        employeeMap.put("emp04", 4);
	        
	        /*
	         * Convert HashMap to List(ArrayList) containing map keys
	         * using keySet method of HashMap.
	         */
	        List<String> aListEmployeeIds = new ArrayList<String>(employeeMap.keySet());
	        System.out.println(aListEmployeeIds);
	        List<Integer> aListEmployeeI = new ArrayList<Integer>(employeeMap.values());
	        System.out.println(aListEmployeeI);
	        HashSet<Integer> hs=  new HashSet();
	        Integer i=new Integer(1);
	        Integer k=new Integer(1);
	        hs.add(i);
	        hs.add(k);
	        
	       System.out.println(hs);
	        
		 
		

	}
public static void calculateAndShow(int i ,Function<Integer,Double> func) {
	System.out.println( func.apply(i));
}
}

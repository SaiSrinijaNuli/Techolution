import java.util.*;
public class Balance {
	 static int isMatch(char c,char c1)
	 {
		 if(c=='('&&c1==')'||c=='{'&&c1=='}'||c=='['&&c1==']')
		 {
			 return 1;
		 }
		 return 0;
	 }
	 static boolean balancing(String str)
	 {
		 Stack<String> st = new Stack<String>();
		 for(int i=0;i<str.length();i++)
		 {
			 if(str.charAt(i)=='('||str.charAt(i)=='('||str.charAt(i)=='(')
			 {
				 st.push(str.substring(i, i+1));
			 }
			 else if(!st.isEmpty()&&isMatch(st.peek().charAt(0),str.charAt(i))==1)
			 {
				 st.pop();
			 }
			 else
			 {
				 return false;
			 }
		 }
		 return st.isEmpty();
	 }
     public static void main(String args[])
     {
    	 int t;
    	 Scanner sc = new Scanner(System.in);
    	 t=sc.nextInt();
    	 for(int i=0;i<t;i++) {
    		 String str=sc.next();
    		 if(balancing(str))
    		 {
    			 System.out.println("YES");
    		 }
    		 else
    		 {
    			 System.out.println("NO");
    		 }
    	 }
    	 sc.close();
     }
}

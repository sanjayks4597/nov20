package Stack;
import java.util.Stack;
public class BackSpaceStringCompare {

	public static void main(String[] args) {
		
		String s="#a#c";
		String t="##ac";
		
		boolean flag=backspaceCompare(s, t);
		System.out.println(flag);

	}
	
public static boolean backspaceCompare(String s, String t) {
        
        Stack <Character> stk1=new Stack<Character>();
        Stack <Character> stk2=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='#' && stk1.size()>0)
            {
                stk1.pop();
            }
            else if(ch!='#'){
                stk1.push(ch);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(ch=='#' && stk2.size()>0)
            {
                stk2.pop();
            }
            else if(ch!='#'){
                stk2.push(ch);
            }
        }
       if(stk1.size()!=stk2.size())
       {
            return false;
       }
      else{
             while(stk1.size()>0)
               {
                if(stk1.pop()!=stk2.pop())
                    return false;
                 }
        }
       
        
        return true;
    }

}

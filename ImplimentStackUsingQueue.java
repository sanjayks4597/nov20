package queue;


import java.util.LinkedList;
import java.util.Queue;

class Stack2{
		Queue<Integer> q1=new LinkedList<Integer>();
		Queue<Integer> q2=new LinkedList<Integer>();
		
		int size()
		{
			return q1.size();
		}
		int pop() {
			return q1.remove();
		}
		int peek() {
			return q1.peek();
		}
		void push(int x)
		{
			while(q1.isEmpty()==false)
			{
				q2.add(q1.remove());
			}
			q1.add(x);
			while(q2.isEmpty()==false)
			{
				q1.add(q2.remove());
			}
		}
	}
public class ImplimentStackUsingQueue {

	public static void main(String[] args) {
		
		Stack2 stk=new Stack2();
		stk.push(25);
		stk.push(14);
		stk.push(17);
		System.out.println(stk.peek());
		stk.pop();
		System.out.println(stk.peek());

	}

}

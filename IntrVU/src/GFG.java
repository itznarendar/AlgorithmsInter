/* Java Program to implement a queue using two stacks */
// Note that Stack class is used for Stack implementation

import java.util.Iterator;
import java.util.Stack;

public class GFG
{
	/* class of queue having two stacks */
		Stack<Integer> stack1 ;
		Stack<Integer> stack2 ;
		Stack<Integer> temp ;
	
	
	/* Function to push an item to stack*/
	 void push(int new_data)
	{
		//Push the data onto the stack
		
		if(stack1.isEmpty())
		
		{stack1.push(new_data);
		System.out.println(new_data+" 1new  mmmmmmm");
		}
		
		
		if(stack2.isEmpty()&&!stack1.isEmpty())
		{stack2.push(new_data);
		
		System.out.println(new_data+"new  elem   inserted");
		stack2.push(stack1.pop());
		
		Stack<Integer> s = stack1;
		stack1=stack2;
		stack2=s;}
		
		//stack2.clear();
		
		Iterator<Integer> itr=stack1.iterator();
		while(itr.hasNext())
		{
			System.out.println("E$$$itter$$$#"+itr.next());
		}
		
		for(Integer item:stack1)
		{
			System.out.println("###########for loop####"+item);
		}
		
	}
	
	/* Function to pop an item from stack*/
//	static int pop(Stack<Integer> top_ref)
//	{
//		/*If stack is empty then error */
//	q.stack1.pop();
//	}
	//Function to enqueue an item to the queue
	 void enQueue(int x)
	{
		push(x);
		
	}
	/* Function to dequeue an item from queue */
	 int deQueue()
	{
		if(!stack1.isEmpty())
		{
			System.out.println("call for del; 1 "+stack1.peek());
		return stack1.pop();
		}
		else
			return 222;
		
	}
	
	/* Driver function to test anove functions */
	public static void main(String args[]) 
	{
		/* Create a queue with items 1 2 3*/
		GFG q= new GFG();
		
		q.stack1 = new Stack<>();
		q.stack2 = new Stack<>();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		
		
		/* Dequeue items */
		System.out.println(q.stack1.size()+" ????????????????????????s");
//		System.out.println(q.stack1.pop()+" ");
//		System.out.println(q.stack1.pop()+" ");
		
		System.out.println(q.stack1.size()+":::::::::::::::::::::: ");
	}
}
//This code is contributed by Sumit Ghosh

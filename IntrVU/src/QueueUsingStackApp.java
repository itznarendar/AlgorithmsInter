
 
import java.util.Stack;
 
public class QueueUsingStackApp { 
 public static void main(String[] args) {
  QueueUsingSingleStack queueUsingStack = new QueueUsingSingleStack();
 
  queueUsingStack.enQueue(10);
  queueUsingStack.enQueue(20);
  queueUsingStack.enQueue(30);
  queueUsingStack.enQueue(40);
 
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();
 
  queueUsingStack.enQueue(50);
  queueUsingStack.enQueue(60);
 
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();
 }
}
 
class QueueUsingSingleStack{
 Stack<Integer> stack = new Stack<Integer>();
 
 public void enQueue(int data){
  stack.add(data);
 }
 
 public void deQueue(){
  if(stack.size()<1){
   System.out.println("Nothing to deQueue");
   return;
  }
 
  if(stack.size()==1){
   System.out.println(stack.pop()+" ikkada");
   return;
  }
  System.out.println("ENNNNNNNNNNNNNDIRA   ikkada");
  int data = stack.pop();
  System.out.println("confused");
  deQueue();
  System.out.println("ggggggggggggggg"+data+stack.size());
  stack.push(data);
 }
}


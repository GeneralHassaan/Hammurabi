/*Team Taurus: Tanvir Ahmad, Mohammad hassaan
Date:- 11-12-19
*/
import java.util.LinkedList;

public class GenericStack<T>
{
// generic linked list
 private LinkedList<T> stack;

// constructor
   public GenericStack()
   {
    stack = new LinkedList<T>();
   }

// push: adding element at last
   public void push(T element)
   {
    System.out.println("push: "+element);
    stack.addLast(element);
   }

// pop: removing and returning element from last
   public T pop()
   {
   if(stack.size() == 0)

   return null;
    return stack.removeLast();
   }

// peek: returning last element
   public T peek()
   {
   if(stack.size() == 0)
   return null;
   return stack.getLast();
   }

   public int size()
   {
   return stack.size();
   }

}

class GenericStackTest 
{
   public static void main(String[] args)
   {
   GenericStack<String> stack = new GenericStack<>();

       stack.push("Apple");
       stack.push("Oranges");
       stack.push("Bananas");

       System.out.println("The stack contains "+stack.size()+" items");
       System.out.println("Peak: "+stack.peek()+" The stack contains "+stack.size()+" items");
       System.out.println("Pop: "+stack.pop());
       System.out.println("Pop: "+stack.pop());
       System.out.println("Pop: "+stack.pop());
       System.out.println("The stack contains "+stack.size()+" items");
   }
}
import java.util.Vector;

public class Stack {
  private static Vector<Object> stack = new Vector<Object>();

  public static void main(String[] args){
    System.out.println(empty());
    push("Hello");
    System.out.println(empty());
    push("What");
    push("Hey");
    push("Greetings");
    push("Steve");
    System.out.println(pop());
    System.out.println(pop());
    System.out.println(peek());
    System.out.println(peek());
  }

  public static boolean empty(){
    return stack.isEmpty();
  }

  public static Object peek(){
    return stack.lastElement();
  }

  public static Object pop(){
    Object obj = stack.lastElement();
    stack.remove(obj);
    return obj;
  }

  public static void push(Object obj){
    stack.addElement(obj);
  }
}

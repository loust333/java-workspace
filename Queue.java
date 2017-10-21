import java.util.Vector;

public class Queue{
  private static Vector<Object> queue = new Vector<Object>();

  public static void main(String[] args){
    enqueue("a");
    enqueue("b");
    enqueue("c");
    enqueue("d");
    enqueue("e");
    System.out.println(dequeue());
    System.out.println(dequeue());
    System.out.println(dequeue());
    System.out.println(dequeue());
    System.out.println(dequeue());
  }

  public static boolean empty(){
    return queue.isEmpty();
  }

  public static Object dequeue(){
    return queue.remove(0);
  }

  public static void enqueue(Object obj){
    queue.add(obj);
  }
}

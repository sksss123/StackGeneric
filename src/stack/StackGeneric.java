package stack;

public class StackGeneric {
	public static void main(String arg[]){
		Stack<Integer> stackInteger = new Stack<Integer>();	
		stackInteger.push(1);
		stackInteger.push(2);
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		
		Stack<String> stackString = new Stack<String>();	
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}
}


class Stack<T> {
	private Node<T> top;
	
	public T pop() {
		T temp = top.getData();
		top = top.getNext();
		return temp;
	}
	
	public void push(T data) {
		Node<T> temp = new Node<T>(data);
		temp.setNext(top);
		top = temp;
	}
}

class Node<T> {
	private Node<T> next;
	private T data;
	public Node(T data) {
		this.data = data;
        }
	
	public T getData() {
		return this.data;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
}
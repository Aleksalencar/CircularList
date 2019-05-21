package lista;

public class CircularList {
	 
	
	protected DNode head;
	protected DNode tail;
	protected int size;
	
	public CircularList() { //Construtor
		head = null;
		tail = null;
		size = 0;
	}
	
	public Boolean isEmpty() {
		return head == null;
	}

	/*
	  	if (isEmpty()) {
			System.out.println("A lista esta vazia");
		} else {
		
		}
	*/
	
	// public DNode getFirst/Last () throws Exceptions (){ }
	public DNode getFirst () throws Exception {
		if (isEmpty()) {
			throw new Exception();
		} 
		return head;
	}
	
	public DNode getLast() throws Exception {
		if (isEmpty()) {
			throw new Exception();
		} 
		return tail;
	}
	
	// public void insertFirst/Last (DNode newNode ) { }
	
	public void insertFirst(DNode newNode) {
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			size ++;
		} else {
			newNode.SetNext(tail);
			head.SetPrevius(newNode);
			head = newNode;
			size ++;
		}
	}
	
	public void insertLast(DNode newNode) {
		if (isEmpty()) {
			insertFirst(newNode);
		} else {
			newNode.SetPrevius(head);
			tail.SetNext(newNode);
			tail = newNode;
			size ++;
		}		
	}
	
	public DNode removeFirst() throws Exception{
		if (isEmpty()) {
			throw new Exception ();
		}
		DNode removedIten = head;
		if
		size --;
	}
	
	public void show() {
		if (isEmpty()) {
			System.out.println("A lista esta vazia");
		} else {
			System.out.println("A lista é :");
			DNode current = head;
			do {
				
				System.out.println(current.getElement());
				current = current.getNext();
				
			} while (current != head);
		}			
	}
		
	}
	

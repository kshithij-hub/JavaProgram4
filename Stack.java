package library;
public class Stack {

	private int a[];
	private int top;
	private int capacity;
	
	Stack(int size){
		this.capacity = size;
		this.top = -1;
		this.a = new int[size];
		}
	
	Stack(int[] inputa){
		this.capacity=inputa.length;
		this.top = this.capacity - 1;
		this.a=new int[capacity];
		
		for(int i=0;i<inputa.length;i++) {
			a[i]=inputa[i];
		}
	}
	
	void push(int x) {
		if(top==capacity-1) {
			System.out.println("Stack overflow!,cannot perform push "+ x);
			return;
		}
		else {
			top++;
			a[top]=x;
			System.out.println(x+"pushed into stack");
		}
	}
	void push(int x, int y) {
		push(x);
		push(y);
	}
	int pop() {
		if(top==-1) {
			System.out.println("Stack underflow!,NO ELEMENT");
			return -1;
			}
		return a[top--];
	}
	void pop(int n) {
        for (int i = 0; i < n; i++) {
            int val = this.pop();
            if (val == -1) break; 
            System.out.println("Popped: " + val);
        }
    }
	void display(int n) {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        	}
        if (n > top + 1) {
            n = top + 1; 
        	}
        System.out.println("Top " + n + " elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(a[i] + " ");
        	}
        System.out.println();
    	}
	}
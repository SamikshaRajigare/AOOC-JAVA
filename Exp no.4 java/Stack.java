public class Stack {
    int size = 5;
    int stack[] = new int[size];
    int top = -1;
    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow! Cannot push " + data);
        } else {
            stack[++top] = data;
            System.out.println(data + " pushed into stack");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop");
        } else {
            System.out.println(stack[top--] + " popped from stack");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);   

        s.display();

        s.pop();
        s.pop();

        s.display();
    }
}
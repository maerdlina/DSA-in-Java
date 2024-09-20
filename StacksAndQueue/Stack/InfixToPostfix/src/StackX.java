public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int s){
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char ch){
        stackArray[++top] = ch;
    }

    public char pop(){
        return stackArray[top--];
    }

    public char peek(){
        return stackArray[top];
    }

    public char peekN(int n){
        return stackArray[n];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public int size(){return top+1;}

    public void displayStack(String s){
        System.out.println(s);
        System.out.println("Stack (bottom -> top): ");
        for(int i = 0; i < size(); i++){
            System.out.print(peekN(i) + " ");
        }
        System.out.println();
    }
}

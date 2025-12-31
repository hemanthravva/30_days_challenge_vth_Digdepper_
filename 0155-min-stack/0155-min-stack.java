class MinStack {
    Stack<Integer> main_stack;
    Stack<Integer> minstack;

    public MinStack() {
         main_stack = new Stack<>();
         minstack=new Stack<>();
        
    }
    
    public void push(int val) {
            main_stack.push(val);

        if(minstack.isEmpty() || val <=minstack.peek()){
            minstack.push(val);
        }
        
    }
    
    public void pop() {
        int remove=main_stack.pop();

        if(remove == minstack.peek()){
            minstack.pop();
        }
    }
    
    public int top() {
        return main_stack.peek();
        
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
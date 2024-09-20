public class BracketChecker {
    private String input;
    public BracketChecker(String in){
        input = in;
    }
    public void check(){
        int stackSize = input.length();
        StackX stack = new StackX(stackSize);

        for(int j = 0; j < input.length(); j++){
            char ch = input.charAt(j);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!stack.isEmpty()){
                        char chX = stack.pop();
                        if ((ch == '{' && chX != '}') ||
                                (ch == '[' && chX != ']') ||
                                (ch == '(' && chX != ')')) {
                            System.out.println("Error: " + ch + " at " + j);
                        }
                    }
                    else
                        System.out.println("Error: " + ch + " at " + j);
                    break;
                default:
                    break;
            }
        }
        if(!stack.isEmpty()){
            System.out.println("Error: missing right delimiter");
        }
    }
}

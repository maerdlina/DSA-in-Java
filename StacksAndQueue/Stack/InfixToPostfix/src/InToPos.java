public class InToPos {
    private StackX stackX;
    private String input;
    private String output = "";

    public InToPos(String in){
        input = in;
        int stackSize = input.length();
        stackX = new StackX(stackSize);
    }

    public String doTranslate(){
        for(int j = 0; j < input.length(); j++){
            char ch = input.charAt(j);
            stackX.displayStack("For "+ ch + " ");
            switch (ch){
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    stackX.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output += ch;
                    break;
            }
        }
        while(!stackX.isEmpty()){
            stackX.displayStack("While ");
            output += stackX.pop();
        }
        stackX.displayStack("End ");
        return output;
    }

    public void gotOper(char opThis, int prec1){
        while(!stackX.isEmpty()){
            char opTop = stackX.pop();
            if(opTop == '('){
                stackX.push(opTop);
                break;
            }
            else{
                int prec2;

                if(opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if(prec2 < prec1){
                    stackX.push(opTop);
                    break;
                }
                else
                    output += opTop;
            }
        }
        stackX.push(opThis);
    }

    public void gotParen(char ch){
        while(!stackX.isEmpty()){
            char chx = stackX.pop();
            if(chx == '(')
                break;
            else output+=chx;
        }
    }
}

import java.util.Stack;
public class BalancingSymbol {

        public static boolean BalancedSym( String S){
            Stack<Character> stack = new Stack<Character>();

            for(int i= 0; i<S.length(); i++){
                char c=S.charAt(i);

                if(c=='(' || c== '[' || c== '{'){
                    stack.push(c);
                } else if (c==')' || c== ']' || c=='}') {
                    if(stack.isEmpty()) {
                        return false;
                    }
                    char top= stack.pop();

                    if(c=='(' && top !=')' || c=='[' && top!= ']' || c== '{' && top!='}'){
                        return false;
                    }

                }

            }

            return stack.isEmpty();
        }

        public static void main(String[] args) {
            String CharToCheck="{[{][}";
            String CharToCheck2= "{[]}";
            System.out.println(BalancedSym(CharToCheck));
            System.out.println(BalancedSym(CharToCheck2));
        }
    }


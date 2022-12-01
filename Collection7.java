import java.util.Stack;

public class Collection7 {
    public static void main(String[] args) {
        Stack<Character>sobj = new Stack<Character>();
         
        sobj.push('a');
        sobj.push('b');
        sobj.push('c');
        sobj.push('d');
        sobj.push('e');

        System.out.println("Element of stack : "+sobj);

        System.out.println("Poped element is : "+sobj.pop());

        System.out.println("Element of stack : "+sobj);

    }
}

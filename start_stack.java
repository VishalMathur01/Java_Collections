import java.util.Stack;

public class start_stack {
    public static void main(String [] args){
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Cat");
        animals.push("Dog");
        animals.push("Horse");

        System.out.println("Stack: "+animals);
        System.out.println("Stack Top: "+animals.peek());

        animals.pop();
        System.out.println("Stack: "+animals);
    }
} 
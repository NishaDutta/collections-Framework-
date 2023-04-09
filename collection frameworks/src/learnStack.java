import java.util.*;
public class learnStack {
    public static void main(String[] args){
        Stack<String> food= new Stack<>();

        food.push("Fruits");
        food.push("Bread");
        food.push("vegetables");
        food.push("Cookies");

        System.out.println(food);
        System.out.println(food.peek());
        food.pop();
        System.out.println(food);



    }
}

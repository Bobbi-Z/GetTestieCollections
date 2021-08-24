package rocks.zipcode;

import java.util.Stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class StackTest{


    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertFalse(stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
}

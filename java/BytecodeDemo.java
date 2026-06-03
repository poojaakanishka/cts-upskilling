/*
37. Using javap to Inspect Bytecode
• Objective: Explore compiled .class files.
• Task: Compile a Java class and inspect its bytecode using javap.
• Instructions:
o Create a class with a method.
o Compile it and run javap -c ClassName.
o Interpret the bytecode output.
*/
public class BytecodeDemo {

    public void greet() {
        System.out.println("Hello from Bytecode!");
    }

    public static void main(String[] args) {
        BytecodeDemo obj = new BytecodeDemo();
        obj.greet();
    }
}
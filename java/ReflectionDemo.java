/*
39. Reflection in Java
• Objective: Use Java Reflection API.
• Task: Load a class and invoke methods dynamically.
• Instructions:
o Use Class.forName(), getDeclaredMethods(), and invoke() to call a method without
directly referencing it in code.
o Print the method names and parameters.
*/
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Student {

    public void sayHello() {
        System.out.println("Hello from Student class!");
    }

    public void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ReflectionDemo {

    public static void main(String[] args) {

        try {

            Class<?> cls = Class.forName("Student");

            System.out.println("Class Name: " + cls.getName());

            Method[] methods = cls.getDeclaredMethods();

            System.out.println("\nMethods in class:");

            for (Method method : methods) {

                // Print method name
                System.out.println("\nMethod: " + method.getName());

                // Print parameters
                Parameter[] params = method.getParameters();
                System.out.print("Parameters: ");

                if (params.length == 0) {
                    System.out.print("None");
                } else {
                    for (Parameter p : params) {
                        System.out.print(p.getType().getSimpleName() + " " + p.getName() + " ");
                    }
                }

                System.out.println();
            }

            Object obj = cls.getDeclaredConstructor().newInstance();

            Method m1 = cls.getMethod("sayHello");
            m1.invoke(obj);

            Method m2 = cls.getMethod("displayInfo", String.class, int.class);
            m2.invoke(obj, "Kani", 21);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
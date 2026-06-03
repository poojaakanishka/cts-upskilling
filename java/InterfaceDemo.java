/*
19. Interface Implementation
• Objective: Use interfaces in Java.
• Task: Define an interface Playable with a method play().
• Instructions:
o Implement the interface in classes Guitar and Piano.
o Each class should provide its own implementation of play().
o Instantiate the classes and call the method.
*/
interface Playable {

    void play();
}

class Guitar implements Playable {

    @Override
    public void play() {
        System.out.println("Playing the Guitar 🎸");
    }
}

class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("Playing the Piano 🎹");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Playable g = new Guitar();
        g.play();

        Playable p = new Piano();
        p.play();
    }
}
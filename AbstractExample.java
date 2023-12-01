abstract class Shape {
    // Abstract method (to be implemented by subclasses)
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("Displaying shape");
    }
}

// Concrete subclass extending the abstract class
class Circle extends Shape {
    // Implementation of the abstract method
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        // Creating an object of the concrete subclass
        Circle circle = new Circle();

        // Calling methods
        circle.draw();
        circle.display();
    }
}

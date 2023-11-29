public class TestCloning {

    public static void main(String[] args){

        // Handles routing makeCopy method calls to the
        // right subclasses of Shape

        CloneFactory animalMaker = new CloneFactory();

        // Creates a new Sheep instance

        Circle originalCircle = new Circle();

        // Creates a clone of Circle and stores it in its own
        // memory location

        Circle clonedCircle = (Circle) animalMaker.getClone(originalCircle);

        // These are exact copies of each other

        System.out.println(originalCircle);

        System.out.println(clonedCircle);

        System.out.println("Original Circle HashCode: " + System.identityHashCode(System.identityHashCode(originalCircle)));

        System.out.println("Cloned Circle HashCode: " + System.identityHashCode(System.identityHashCode(clonedCircle)));
    }

}
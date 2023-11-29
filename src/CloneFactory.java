public class CloneFactory {

    // Receives any Shape, or Shape subclass and
    // makes a copy of it and stores it in its own
    // location in memory

    // CloneFactory has no idea what these objects are
    // except that they are subclasses of Shape

    public Shape getClone(Shape shapeSample) {

        // Because of Polymorphism the Shape makeCopy()
        // is called here instead of Animals

        return shapeSample.makeCopy();

    }

}
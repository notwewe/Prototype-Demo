public class Circle implements Shape {

    public Circle(){

        System.out.println("Circle is Made");

    }

    public Shape makeCopy() {

        System.out.println("Circle is Being Cloned");

        Circle circleObject = null;

        try {

            // Calls the Shape super classes clone()
            // Then casts the results to Circle

            circleObject = (Circle) super.clone();

        }

        // If Shape didn't extend Cloneable this error
        // is thrown

        catch (CloneNotSupportedException e) {

            System.out.println("The Circle was not cloned");

            e.printStackTrace();

        }

        return circleObject;
    }

    public String toString(){

        return "It's a circle";

    }

}
public class Main {

    public static void main(String[] args) {

        // creating Instances of House class:
        // all pointing to the same house object:
        House blueHouse = new House("blue"); //new instance of House class
        House anotherHouse = blueHouse; // creates Reference

        System.out.println(blueHouse.getColor()); // prints blue
        System.out.println(anotherHouse.getColor()); // blue

        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor()); // red
        System.out.println(anotherHouse.getColor()); // red

        // pointing to a new house object:
        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor()); // red
        System.out.println(greenHouse.getColor()); // green
        System.out.println(anotherHouse.getColor()); // green

        // Reference vs Object:
        new House("red"); // house object gets created in memory
        House myHouse = new House("beige"); // house object gets created in memory
                                                  // and it's location (reference) is
                                                  // assigned to myHouse
        House redHouse = new House("red"); // house object gets created in memory
                                                 // and it's location (reference) is
                                                 // assigned to redHouse

    }
}

public class Main {

    public static void main(String[] args) {

        // Static Variables
        DogStatic rex = new DogStatic("rex");           // create instance (rex)
        DogStatic fluffy = new DogStatic("fluffy");     // create instance (fluffy)
        rex.printName();                                      // prints fluffy
        fluffy.printName();                                   // prints fluffy

        // Instance Variables
        DogInstance rexi = new DogInstance("rexi");         // create instance (rexi)
        DogInstance fluffo = new DogInstance("fluffo");     // create instance (fluffo)
        rexi.printName();                                         // prints rexi
        fluffo.printName();                                       // prints fluffo

    }
}

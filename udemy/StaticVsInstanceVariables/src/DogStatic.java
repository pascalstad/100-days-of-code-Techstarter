class DogStatic {

    // Static Variables
    static String genus = "Canis";

    void printData() {

        DogStatic d = new DogStatic();
        System.out.println(d.genus); // Confusing!!
        System.out.println(DogStatic.genus); // Clearer!
    }

    private static String name;

    public DogStatic(String name) {
        DogStatic.name = name;
    }

    public void printName() {
        System.out.println("name = " + name); // using Dog.name is less confusing
    }
}

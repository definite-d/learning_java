public class _3_Classes {
    static class Animal {
        String name;
        String species;

        public Animal(String name, String species) {
            this.name = name;
            this.species = species;
        }
    }

    static class Cat extends Animal {
        String species = "Felis catus";

        public Cat(String name) {
            super(name, ""); // Haven't learned how optional parameters work in Java yet.
        }
    }

    public static void main(String[] args) {
        Cat felix = new Cat("Felix");
        System.out.println("Name: " + felix.name);
        System.out.println("Species: " + felix.species);
    }
}

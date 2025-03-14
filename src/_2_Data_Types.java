public class _2_Data_Types {
    public static void main(String[] args) {
        // Apparently, these are the main primitives: int, double, boolean and char.
        // If they could abbreviate "character", why not "boolean"...
        int theMeaningOfLife = 42;
        double eulerIdentity = 0.0;
        boolean isRaining = false;
        char e = 'e';

        System.out.println("The Meaning of Life: " + theMeaningOfLife);
        System.out.println("Euler's Identity: " + eulerIdentity);
        System.out.println("Is it raining?: " + (isRaining ? "Yes" : "No"));
        System.out.println("Eeeeeeeeeee: " + e);

        // I'll have to unlearn the habit of # for comments... CSS Mode.
        // Let's check out the derived types.
        String programmingLanguage = "Java";
        System.out.println("Programming Language: " + programmingLanguage);
        // Java's String is a reference type, not a primitive type. <- That's Tabnine cautioning me.
        // I don't know any other "reference types". To Google we go.
    }
}

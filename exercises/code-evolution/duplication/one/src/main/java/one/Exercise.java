package one;

public class Exercise {
    String name;

    public Exercise() {
        name = "";
    }
    
    public boolean requiresWeights() {
        return false;
    }

    public void doExercise() {
        System.out.println("Wow, I totally just did a " + name);
    }
}

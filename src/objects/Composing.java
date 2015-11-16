package objects;

public class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared){
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    public void dispose(){
        System.out.println("Disposing " + this);
        this.shared.dispose();
    }
    public String toString(){
        return "Composing " + id;
    }
}

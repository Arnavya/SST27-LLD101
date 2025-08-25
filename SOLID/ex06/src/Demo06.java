
public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();

        Sparrow s = new Sparrow();
        Penguin p = new Penguin();

        aviary.release(s);

        p.makeSound();
    }
}

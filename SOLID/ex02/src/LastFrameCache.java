public class LastFrameCache implements Cache{
    private Frame last;
    public void store(Frame f) {
        last = f;
        System.out.println("Cached last frame? " + (last != null));
    }
}

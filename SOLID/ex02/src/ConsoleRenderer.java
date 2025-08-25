public class ConsoleRenderer implements Renderer{
    public void render(Frame f) {
        System.out.println("Playing " + f.getData().length + " bytes");
    }
}

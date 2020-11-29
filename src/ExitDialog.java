public class ExitDialog implements Strategy{
    @Override
    public void initialize() {
        System.out.println("Exit dialog --> initialize");
    }

    @Override
    public void show() {
        System.out.println("Exit dialog --> show");
    }

    @Override
    public void dismiss() {
        System.out.println("Exit dialog --> dismiss");
    }
}

public class RateDialog implements Strategy {
    @Override
    public void initialize() {
        System.out.println("Rate dialog --> initialize");
    }

    @Override
    public void show() {
        System.out.println("Rate dialog --> show");
    }

    @Override
    public void dismiss() {
        System.out.println("Rate dialog --> dismiss");
    }
}

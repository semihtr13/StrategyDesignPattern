public class PaymentDialog implements Strategy {
    @Override
    public void initialize() {
        System.out.println("Payment dialog --> initialize");
    }

    @Override
    public void show() {
        System.out.println("Payment dialog --> show");
    }

    @Override
    public void dismiss() {
        System.out.println("Payment dialog --> dismiss");
    }
}

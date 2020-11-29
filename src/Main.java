public class Main {
    public static void main(String[] args) {
        StrategyManager strategyManager=new StrategyManager(new PaymentDialog());
        strategyManager.initialize();
        strategyManager.show();
        strategyManager.dismiss();
    }
}

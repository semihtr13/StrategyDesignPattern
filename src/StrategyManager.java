public class StrategyManager {
    private Strategy strategy;

    public StrategyManager(Strategy strategy) {
        this.strategy=strategy;
    }
    public void initialize(){
        strategy.initialize();
    }
    public void show(){
        strategy.show();
    }
     public void dismiss(){
        strategy.dismiss();
     }
}

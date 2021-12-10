import java.util.Objects;

public class HumanClient implements Client{

    private OrderingStrategy clientType;

    HumanClient(){
        clientType = new ImpatientStrategy();
    };
    HumanClient(OrderingStrategy strategy){
        clientType = strategy;
    }

    public void happyHourStarted(Bar bar) {
        clientType.happyHourStarted((StringBar) bar);
    }

    public void happyHourEnded(Bar bar) {
        clientType.happyHourEnded((StringBar) bar);
    }

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        clientType.wants(drink,recipe,bar);
    }
}

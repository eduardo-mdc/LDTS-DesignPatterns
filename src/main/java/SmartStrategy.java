import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{

    private List<StringBar> happyBars;

    SmartStrategy(){
        happyBars = new ArrayList<StringBar>();
    }

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(happyBars.contains(bar)) bar.order(drink,recipe);
    }

    public void happyHourStarted(StringBar bar) {
        happyBars.add(bar);
    }

    public void happyHourEnded(StringBar bar){
        while(happyBars.contains(bar)){
            happyBars.remove(bar);
        }
    }
}

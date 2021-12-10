import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{

    private List<StringDrink> drinks;
    private List<StringRecipe> recipes;

    SmartStrategy(){
        drinks = new ArrayList<StringDrink>();
        recipes = new ArrayList<StringRecipe>();
    }

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour()){
            bar.order(drink,recipe);
        }
        else{
            drinks.add(drink);
            recipes.add(recipe);
        }
    }

    public void happyHourStarted(StringBar bar) {
        for(int i = 0; i < drinks.size() ; i++){
            bar.order(drinks.get(i),recipes.get(i));
            drinks.remove(i);
            recipes.remove(i);
        }
    }

    public void happyHourEnded(StringBar bar){

    }
}

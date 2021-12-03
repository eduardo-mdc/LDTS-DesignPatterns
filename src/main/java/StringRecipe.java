import java.util.List;

public class StringRecipe{
    private List<StringTransformer> transformerList;
    public StringRecipe(List<StringTransformer> list){
        transformerList = list;
    }
    public void mix(StringDrink drink){
        for(int i = 0; i < transformerList.size(); i++){
            transformerList.get(i).execute(drink);
        }
    }
}

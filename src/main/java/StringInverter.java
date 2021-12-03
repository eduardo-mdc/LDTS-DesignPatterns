public class StringInverter implements StringTransformer{
    public void execute(StringDrink drink){
        StringBuilder build = new StringBuilder(drink.getText());
        drink.setText(build.reverse().toString());
    }
}

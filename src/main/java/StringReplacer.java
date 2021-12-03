public class StringReplacer implements StringTransformer{
    private char char1,char2;
    public StringReplacer(char c1, char c2){
        char1 = c1;
        char2 = c2;
    }
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(char1,char2));
    }
}

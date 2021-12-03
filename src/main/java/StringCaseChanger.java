public class StringCaseChanger implements StringTransformer{
    public void execute(StringDrink drink) {
        char[] chars = drink.getText().toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(Character.isLowerCase(chars[i])){
                chars[i] = Character.toUpperCase(chars[i]);
            }
            else if(Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        drink.setText(String.valueOf(chars));
    }
}

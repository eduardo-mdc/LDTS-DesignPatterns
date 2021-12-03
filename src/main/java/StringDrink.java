public class StringDrink {
    private String contentString;
    public StringDrink(String str){
        contentString = str;
    }
    public String getText(){
        return contentString;
    }
    public void setText(String text){
        contentString = text;
    }
}

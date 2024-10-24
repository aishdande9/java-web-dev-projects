package technology;

public class SmartPhone extends Computer{

    private String displayType;
    private boolean isTouch = false;

    public SmartPhone(String name, String os, double price,String displayType) {
        super(name, os, price);
        this.displayType = displayType;
    }
    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String switchOff(){
        return "my phone switched off";

    }
    public boolean screenType(String displayType){
        if(displayType.equalsIgnoreCase("touch")){
            isTouch = true;
        } else {
            isTouch = false;
        }
        return isTouch;
    }





}

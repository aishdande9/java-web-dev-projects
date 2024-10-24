package technology;

public class Computer extends AbstractEntity {
    private String name;
    private String os;
    private double price;


    public Computer(String name,String os,double price){
        this.name = name;
        this.os = os;
        this.price=price;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
public String sleep(){
 return "computer is in sleep mode";
}

public String restart(){
 return "computer is restarting";
}



}

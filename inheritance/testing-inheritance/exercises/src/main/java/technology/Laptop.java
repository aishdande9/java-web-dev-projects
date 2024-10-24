package technology;

public class Laptop extends Computer{
    private int weight;

    public Laptop(String name,String os,double price,int weight){
        super(name, os, price);
        this.weight=weight;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String update(){
        return "laptop needs to be updated";
    }

   public String shutdown(){
        return "laptop is shutting down";
   }

}

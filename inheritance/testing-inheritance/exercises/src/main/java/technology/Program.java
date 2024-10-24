package technology;

public class Program {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Mac","ios",2165.25,180);

        Computer computer = new Computer("Dell","Windows",999.00);
        System.out.println(computer.getName());
        System.out.println(computer.getOs());
        System.out.println(computer.getPrice());
        computer.sleep();
        computer.restart();
        System.out.println("unique ID for computer :"+computer.uniqueId());


        System.out.println("Price :"+laptop.getPrice());
        System.out.println("Name :"+laptop.getName());
        System.out.println("Weight :"+laptop.getWeight());
        System.out.println("Os :"+laptop.getOs());

        laptop.update();
        laptop.shutdown();
        System.out.println("unique ID for laptop : "+laptop.uniqueId());

     SmartPhone smartPhone = new SmartPhone("apple","ios",999.2,"led");

        System.out.println(smartPhone.getName());
        System.out.println(smartPhone.getOs());
        System.out.println(smartPhone.getPrice());
        System.out.println(smartPhone.getDisplayType());
        System.out.println(smartPhone.screenType(smartPhone.getDisplayType()));

        System.out.println("unique ID for smartPhone : "+smartPhone.uniqueId());

smartPhone.switchOff();
    }
}



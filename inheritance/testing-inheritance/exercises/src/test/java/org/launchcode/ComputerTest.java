package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import technology.Computer;
import technology.Laptop;
import technology.SmartPhone;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
    Computer computer;

    @BeforeEach
    public void initComputer(){
        computer = new Computer("apple","ios",2000.56);
    }

    @Test
    public void constructorInComputer(){
        assertEquals("apple",computer.getName());
        assertEquals("ios",computer.getOs());
        assertEquals(2000.56,computer.getPrice(),0.01);
    }
    @Test
    public void checkSleepMethodInComputer(){
        assertEquals("computer is in sleep mode",computer.sleep());
    }
    @Test
    public void checkRestartMethodInComputer(){
        assertEquals("computer is restarting",computer.restart());
    }
    @Test
    public void InheritsSuperInLaptop(){
        Laptop laptop = new Laptop("Mac","ios",8900,4);
        assertEquals("Mac",laptop.getName());
        assertEquals("ios",laptop.getOs());
        assertEquals(8900,laptop.getPrice());
        assertEquals(4,laptop.getWeight());
    }
    @Test
    public void checkUpdateMethodInLaptop(){
        Laptop laptop = new Laptop("Mac","ios",8900,4);
        assertEquals("laptop needs to be updated",laptop.update());
    }

    @Test
    public void checkShutDownMethodInLaptop(){
        Laptop laptop = new Laptop("Mac","ios",8900,4);
        laptop.shutdown();

    }
    @Test
    public void InheritsSuperInSmartPhone() {
        SmartPhone smartPhone = new SmartPhone("apple","ios",999.0,"led");
        assertEquals("apple",smartPhone.getName());
        assertEquals("ios",smartPhone.getOs());
        assertEquals(999.0,smartPhone.getPrice());
        assertEquals("led",smartPhone.getDisplayType());


    }
    @Test
    public void checksSwitchOffMethodInSmartPhone(){
        SmartPhone smartPhone = new SmartPhone("apple","ios",999.0,"led");
        assertEquals("my phone switched off",smartPhone.switchOff());
    }

    @Test
    public void checksScreenStatusInSmartPhone(){
        SmartPhone smartPhone = new SmartPhone("apple","ios",999.0,"touch");
        assertTrue(smartPhone.screenType(smartPhone.getDisplayType()));
    }

    @Test
    public void checksFalseStatusInSmartPhone(){
        SmartPhone smartPhone = new SmartPhone("apple","ios",999.0,"led");
        assertFalse(smartPhone.screenType(smartPhone.getDisplayType()));

    }

}

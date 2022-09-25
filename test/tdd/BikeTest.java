package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    @Test
    public void bikeCanBeTurnedOn(){
        //given that there is a bike
        Bike myBike = new Bike();
        //when bike is turned on
        myBike.isOn(true);
        //check that bike is on
        assertEquals(true, myBike.getTurnedOn());
    }

    @Test
    public void bikeCanBeTurnedOff(){
        //given that there is a bike
        Bike myBike = new Bike();
        //when bike is turned on
        myBike.isOn(false);
        //check that bike is on
        assertEquals(false, myBike.getTurnedOn());
    }

    @Test
    public void bikeCanBeAcceleratedByGearOne(){
        //given that there is a bike
        Bike myBike = new Bike();
        //given that bike is turned on
        myBike.isOn(true);
        //when you increase acceleration
        myBike.setAcceleration(1);
        //when i increase the acceleration by 1
        myBike.setAcceleration(1);
        //check that it accelerates in increment of one
        assertEquals(1, myBike.getAcceleration());


    }

    @Test
    public void bikeCanBeAcceleratedByGearTwo(){
        //given that there is a bike
        Bike myBike = new Bike();
        //given that bike is turned on
        myBike.isOn(true);
        //when you increase acceleration
        myBike.setAcceleration(2);
        //when i increase the acceleration by 1
        myBike.setAcceleration(2);
        //check that it accelerates in increment of one
        assertEquals(2, myBike.getAcceleration());


    }

    @Test
    public void bikeCanBeAcceleratedByGearThree(){
        //given that there is a bike
        Bike myBike = new Bike();
        //given that bike is turned on
        myBike.isOn(true);
        //when you increase acceleration
        myBike.setAcceleration(3);
        //when i increase the acceleration by 1
        myBike.setAcceleration(3);
        //check that it accelerates in increment of one
        assertEquals(3, myBike.getAcceleration());


    }

    @Test
    public void bikeCanBeAcceleratedByGearFour(){
        //given that there is a bike
        Bike myBike = new Bike();
        //given that bike is turned on
        myBike.isOn(true);
        //when you increase acceleration
        myBike.setAcceleration(4);
        //when i increase the acceleration by 1
        myBike.setAcceleration(4);
        //check that it accelerates in increment of one
        assertEquals(4, myBike.getAcceleration());


    }

    @Test
    public void bikeCanBeDeceleratedByGearOne(){
        //given that there is a bike
        Bike myBike = new Bike();
        //given that bike is turned on
        myBike.isOn(true);
        //when you increase acceleration
        myBike.setAcceleration(-1);
        //when i increase the acceleration by 1
        myBike.setAcceleration(-1);
        //check that it accelerates in increment of one
        assertEquals(-1, myBike.getAcceleration());


    }

    @Test
    public void bikeCanBeDeceleratedByGearTwo(){
        //given that there is a bike
        Bike myBike = new Bike();
        //given that bike is turned on
        myBike.isOn(true);
        //when you increase acceleration
        myBike.setAcceleration(-2);
        //when i increase the acceleration by 1
        myBike.setAcceleration(-2);
        //check that it accelerates in increment of one
        assertEquals(-2, myBike.getAcceleration());


    }

    @Test
    public void bikeCanBeDeceleratedByGearThree(){
        //given that there is a bike
        Bike myBike = new Bike();
        //given that bike is turned on
        myBike.isOn(true);
        //when you increase acceleration
        myBike.setAcceleration(-3);
        //when i increase the acceleration by 1
        myBike.setAcceleration(-3);
        //check that it accelerates in increment of one
        assertEquals(-3, myBike.getAcceleration());


    }

    @Test
    public void bikeCanBeDeceleratedByGearFour(){
        //given that there is a bike
        Bike myBike = new Bike();
        //given that bike is turned on
        myBike.isOn(true);
        //when you increase acceleration
        myBike.setAcceleration(-4);
        //when i increase the acceleration by 1
        myBike.setAcceleration(-4);
        //check that it accelerates in increment of one
        assertEquals(-4, myBike.getAcceleration());

    }

    @Test
    public void gearCanChangeAutomatically(){
        Bike myBike = new Bike();
        myBike.isOn(true);
        myBike.setSpeed();
    }
}
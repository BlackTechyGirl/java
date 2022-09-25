package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AirConditionerTest {
    @Test
    public void airConditionerCanBeTurnedOn() {
        //given that you have an AC
        AirConditioner myAirConditioner = new AirConditioner();
        //when i turn on the AC
        myAirConditioner.isOn(true);
        //check that its on
        assertEquals(true, myAirConditioner.getTurnedOn());
    }

    @Test
    public void airConditionerCanBeTurnedOff(){
        //given that you have an AC
        AirConditioner myAc = new AirConditioner();
        //when i turn off the AC
        myAc.isOn(false);
        //check that its off
        assertEquals(false,myAc.getTurnedOn());
    }

    @Test
    public void airConditionerCanIncreaseInTemperature(){
        //given that i have an ac
        AirConditioner myAc = new AirConditioner();
        //given that ac is on
        myAc.isOn(true);
        //given that temperature is decreased
        myAc.setTemperature(1);
        //when you increase temperature
        myAc.setTemperature(1);
        //check that temperature increased
        assertEquals( 1,myAc.getTemperature());
    }

    @Test
    public void airConditionerCanDecreaseInTemperature(){
        //given that i have an ac
        AirConditioner myAc = new AirConditioner();
        //given that ac is on
        myAc.isOn(true);
        //when you increase temperature
        myAc.setTemperature(-1);
        //check that temperature increased
        assertEquals(-1,myAc.getTemperature());
    }

    @Test
    public void airConditionerCannotIncreaseBeyond30Degrees() {
        //given that i have an ac
        AirConditioner myAc = new AirConditioner();
        //given that ac is on
        myAc.isOn(true);
        //when you increase temperature
        myAc.setTemperature(30);
        //check that temperature increased
        assertEquals(30, myAc.getTemperature());
    }

        @Test
        public void airConditionerCannotDecreaseBeyond16Degrees(){
            //given that i have an ac
            AirConditioner myAc = new AirConditioner();
            //given that ac is on
            myAc.isOn(true);
            //when you increase temperature
            myAc.setTemperature(16);
            //check that temperature increased
            assertEquals(16, myAc.getTemperature());
        }

}
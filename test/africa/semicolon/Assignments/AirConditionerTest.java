package africa.semicolon.Assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test
    void testThatTvNameIsSet(){
        //given
        AirConditioner newAC;
        //when
        newAC = new AirConditioner("LG-AC");
        //assert
        assertEquals("LG-AC", newAC.getProductName());
    }

    @Test
    void thatAcIsSetOnTo16DegreesWhenPoweredOnForTheFirstTimeIfElseSetAcToZero(){
        //given
        AirConditioner newAC;
        //when
        newAC = new AirConditioner("LG-AC");
        newAC.setOn(true);
        //assert
        assertEquals(16, newAC.getTemperature());

    }

    @Test
    void thatAcCanIncreaseTemperature(){
        //given
        AirConditioner newAC;
        //when
        newAC = new AirConditioner("LG-AC");
        newAC.setOn(true);
        newAC.increaseTemperature();
        //assert
        assertEquals(17, newAC.getTemperature());
    }


    @Test
    void thatAcCanDecreaseTemperature(){
        //given
        AirConditioner newAC;
        //when
        newAC = new AirConditioner("LG-AC");
        newAC.setOn(true);
        newAC.increaseTemperature();
        newAC.increaseTemperature();
        newAC.decreaseTemperature();
        //assert
        assertEquals(17, newAC.getTemperature());
    }

}

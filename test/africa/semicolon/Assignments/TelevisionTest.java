package africa.semicolon.Assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionTest {

    @Test
    void testThatTvNameIsSet(){
        //given
        Television newTV;
        //when
        newTV = new Television("Don-blacky TV");
        //assert
        assertEquals("Don-blacky TV", newTV.getName());
    }

    @Test
    void testThatTvCanPowerOff() {
        Television newTV;
        newTV = new Television("Don-blacky ");
        newTV.setOn(false);
        assertEquals(false, newTV.isOn());

    }

    @Test
    void testThatTvCanPowerOn() {
        Television newTV;
        newTV = new Television("Don-blacky ");
        newTV.setOn(true);
        assertEquals(true, newTV.isOn());

    }

    @Test
    void testThatVolumeIsSetToZero(){
        Television newTV;
        newTV = new Television("Don-blacky ");
        newTV.setOn(true);
        newTV.setVolume(0);
        assertEquals(0, newTV.getVolume());
    }

    @Test
    void testThatChannelIsSetToOne(){
        Television newTV;
        newTV = new Television("Don-blacky ");
        newTV.setOn(true);
        newTV.setChannel(1);
        assertEquals(1, newTV.getCurrentChannel());
    }

    @Test
    void testThatTvChannelCanMoveToNextChannel(){
        Television newTV;
        newTV = new Television("Don-blacky ");
        newTV.setOn(true);
        newTV.nextChannel();
        assertEquals(101, newTV.getCurrentChannel());
    }

    @Test
    void testThatTvChannelCanMoveToPreviousChannel(){
        Television newTV;
        newTV = new Television("Don-blacky ");
        newTV.setOn(true);
        newTV.previousChannel();
        assertEquals(99, newTV.getCurrentChannel());
    }

    @Test
    void testThatTvCanReduceVolume() {
        Television newTV;
        newTV = new Television("Don-blacky ");
        newTV.setOn(true);
        newTV.increaseVolume();
        newTV.decreaseVolume();
        assertEquals(0, newTV.getVolume());
    }

    @Test
    void testThatTvCanIncreaseVolume() {
        Television newTV;
        newTV = new Television("Don-blacky ");
        newTV.setOn(true);
        newTV.increaseVolume();
        assertEquals(1, newTV.getVolume());
    }
}


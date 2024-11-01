package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    public void checkIn_RoomInitialStatus_RoomIsOccupiedAndDirty() {
        Room room = new Room(2, 100.0);

        room.checkIn();

        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    public void checkOut_RoomIsOccupied_RoomIsNotOccupied() {
        Room room = new Room(1, 50.0);
        room.checkIn();

        room.checkOut();

        assertFalse(room.isOccupied());
    }

    public void checkIn_RoomWasPreviouslyUsed_RoomIsNotOccupied() {
        Room room = new Room(2, 100.0);
        room.checkIn();
        room.checkOut();

        room.checkIn();

        assertFalse(room.isOccupied());
    }
  
}
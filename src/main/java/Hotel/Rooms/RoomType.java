package Hotel.Rooms;

public enum RoomType {
    SINGLE(1, "Single"),
    DOUBLE(2, "Double"),
    SUITE(5, "Suite"),
    DININGROOM(100, "Dining"),
    CONFERENCEROOM(50, "Conference");

    private int capacity;
    private String roomName;



    RoomType(int capacity, String roomName){
        this.capacity = capacity;
        this.roomName = roomName;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getRoomName(){
        return this.roomName;
    }


}

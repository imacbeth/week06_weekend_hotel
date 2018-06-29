package Hotel.Rooms;

public enum RoomType {
    SINGLE(1, "Single"),
    DOUBLE(2, "Double"),
    SUITE(5, "Suite"),
    DININGROOM(100, "Dining"),
    CONFERENCEROOM(50, "Conference");

    private int capacity;
    private String roomType;



    RoomType(int capacity, String roomType){
        this.capacity = capacity;
        this.roomType = roomType;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getRoomType(){
        return this.roomType;
    }


}

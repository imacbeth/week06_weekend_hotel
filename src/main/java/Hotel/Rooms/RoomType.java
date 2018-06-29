package Hotel.Rooms;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    SUITE(5),
    DININGROOM(100),
    CONFERENCEROOM(50);

    private int capacity;



    RoomType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }


}

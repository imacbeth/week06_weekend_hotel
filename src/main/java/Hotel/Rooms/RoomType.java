package Hotel.Rooms;

public enum RoomType {
    SINGLE(1, 50, "Single"),
    DOUBLE(2, 75, "Double"),
    SUITE(5, 125, "Suite"),
    DININGROOM(100, 0, "Dining Room"),
    CONFERENCEROOM(50, 150, "Conference Room");

    private int capacity;
    private double price;
    private String roomName;

    RoomType(int capacity, int price, String roomName){
        this.capacity = capacity;
        this.price = price;
        this.roomName = roomName;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public double getPrice(){
        return this.price;
    }

    public String getRoomName(){
        return this.roomName;
    }
}

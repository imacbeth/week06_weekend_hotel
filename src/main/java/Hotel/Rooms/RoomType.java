package Hotel.Rooms;

public enum RoomType {
    SINGLE(1, 50),
    DOUBLE(2, 75),
    SUITE(5, 125),
    DININGROOM(100, 0),
    CONFERENCEROOM(50, 150);

    private int capacity;
    private double price;


    RoomType(int capacity, double price){
        this.capacity = capacity;
        this.price = price;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public double getPrice(){
        return this.price;
    }

}

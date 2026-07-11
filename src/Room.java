public class Room {
    private int number;
    private int block;
    private int capacityMax;

//    Contructors
    public Room() {
    }

    public Room(int number, int block, int capacityMax) {
        this.number = number;
        this.block = block;
        this.capacityMax = capacityMax;
    }

    //    Getters and Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getCapacityMax() {
        return capacityMax;
    }

    public void setCapacityMax(int capacityMax) {
        this.capacityMax = capacityMax;
    }
}

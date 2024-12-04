
package OOP_EXERCISE_DRIVE.Ex9;

public class MeetingRoom extends Room{
private int capacity;

    public MeetingRoom(int capacity, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }

    public MeetingRoom() {
    }

    @Override
    public double calculateCost() {
        if(this.capacity > 50) {
            return getBaseCost() + getBaseCost() * 0.2;
        }
        return getBaseCost();
    }
@Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("; Capacity: "+this.capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}

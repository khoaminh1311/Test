
package OOP_EXERCISE_DRIVE.Ex9;

public class BedRoom extends Room{
private int numberOfBeds;

    public BedRoom(int numberOfBeds, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.numberOfBeds = numberOfBeds;
    }

    public BedRoom() {
    }

    @Override
    public double calculateCost() {
        if(this.numberOfBeds >= 3) {
            return getBaseCost() + getBaseCost() * 0.1;
        }
        return getBaseCost();
    }
@Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("; number of beds: "+this.numberOfBeds);
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    
}

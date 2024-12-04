
package OOP_EXERCISE_DRIVE.Ex9;

public abstract class Room implements IRoom{
    private String id,name;
    private double baseCost;

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    public Room() {
    }

    @Override
    public abstract double calculateCost();
    @Override
    public void displayDetails() {
        System.out.print("ID: "+this.id+"; name: "+this.name+"; base cost: "+calculateCost());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    
    }
    

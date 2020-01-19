package snackBar;

public class Snack 
{
    //fields
    private int id;
    private String name;
    private double quantity;
    private double cost;
    private int vendingMachineId;

    //methods - getters
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }

    public double getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }
}
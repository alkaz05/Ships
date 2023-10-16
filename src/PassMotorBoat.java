public class PassMotorBoat extends MotorBoat{
    int maxAmount;
    int amount;
    String[] passengers;

    public PassMotorBoat(double maxCargo, double engineV, int maxAmount) {
        super(maxCargo, engineV);
        this.maxAmount = maxAmount;
        passengers = new String[maxAmount];
    }

    public void takePassenger(String name){
        if(amount< maxAmount){
            passengers[amount] = name;
            amount++;
        }
        else
            System.out.println("места кончились");
    }

    public String unloadLastPassenger()
    {
        if(amount>0){
            String name = passengers[amount-1];
            passengers[amount-1] = null;
            amount--;
            return name;
        }
        return "никого не было";
    }

}

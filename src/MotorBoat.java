public class MotorBoat extends Boat{
    double engineV;
    boolean engineOn;

    public MotorBoat(double maxCargo, double engineV) {
        super(maxCargo);
        this.engineV = engineV;
    }

    public void startEngine()
    {
        engineOn= true;
    }

    public void stopEngine()
    {
        engineOn = false;
    }

    public void sound(){
        if (engineOn)
            System.out.println("тарахтит мотор объемом "+engineV);
    }

    @Override
    public String toString() {
        return "MotorBoat{" +
                "engineV=" + engineV +
                ", maxCargo=" + maxCargo +
                ", cargo=" + cargo +
                '}';
    }
}

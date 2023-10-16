public class Boat {
    double maxCargo;
    double cargo;

    public Boat(double maxCargo) {
        this.maxCargo = maxCargo;
    }

    public void addCargo(double x)
    {
        if(cargo+x <= maxCargo)
            cargo+=x;
    }

    public void removeCargo(double x){
        if (cargo-x >=0)
            cargo-=x;
    }

    public double getCargo() {
        return cargo;
    }
}

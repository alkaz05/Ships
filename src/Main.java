public class Main {
    public static void main(String[] args) {
        exampleBoat1();
        exampleBoat2();
    }

    private static void exampleBoat2() {
        SailBoat sb = new SailBoat(130, 1);
        sb.raiseSail();
        sb.downSail();
        sb.addCargo(110);
        System.out.println(sb.cargo);
    }

    private static void exampleBoat1() {
        Boat boat1 = new Boat(135);
        Boat boat2 = new Boat(50);
        System.out.println(boat1.getCargo() + "     "+ boat2.getCargo());
        boat1.addCargo(45);
        boat2.addCargo(45);
        System.out.println(boat1.getCargo() + "     "+ boat2.getCargo());
        boat1.addCargo(70);
        boat2.addCargo(70);
        System.out.println(boat1.getCargo() + "     "+ boat2.getCargo());
        boat1.removeCargo(25);
        boat2.removeCargo(25);
        System.out.println(boat1.getCargo() + "     "+ boat2.getCargo());
    }
}
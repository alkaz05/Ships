import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // exampleBoat1();
       // exampleBoat2();
        examplePassBoat1();
    }

    private static void examplePassBoat1() {
        PassMotorBoat pmb = new PassMotorBoat(100, 1.0, 2);
        pmb.takePassenger("Нина");
        System.out.println(pmb.getPassengersStr());
        pmb.takePassenger("Вася");
        System.out.println(pmb.getPassengersStr());
        pmb.takePassenger("кузнец");
        System.out.println(pmb.getPassengersStr());

        String person = pmb.unloadLastPassenger();
        System.out.println("на берег сошел "+person);
        System.out.println("в лодке сейчас: "+ pmb.getPassengersStr());
        person = pmb.unloadLastPassenger();
        System.out.println("на берег сошел "+person);
        System.out.println("в лодке сейчас: "+ pmb.getPassengersStr());
        person = pmb.unloadLastPassenger();
        System.out.println("на берег сошел "+person);
        System.out.println("в лодке сейчас: "+ pmb.getPassengersStr());

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
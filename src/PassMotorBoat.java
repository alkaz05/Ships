import java.util.Arrays;

public class PassMotorBoat extends MotorBoat{
     //Пассажирская моторка это наследник Моторки
    int maxAmount;      //поля, которые есть у Пассажирской моторки, но отсутствуют у обычной
    int amount;
    String[] passengers;

    //конструктор с параметрами
    public PassMotorBoat(double maxCargo, double engineV, int maxAmount) {
        super(maxCargo, engineV);   //явный вызов родительского конструктора
        this.maxAmount = maxAmount;
        passengers = new String[maxAmount];
        startEngine();  //вызов метода данного объекта
        sound();
        stopEngine();
        System.out.println("список пассажиров: "+getPassengersStr());
    }

    public void takePassenger(String name){
        if(amount< maxAmount){
            passengers[amount] = name; // количсетво занятых мест в лодке совпадает
                                       // с номером первого свободного места
            amount++;
        }
        else
            System.out.println("места кончились");
    }

    public String unloadLastPassenger()
    {
        if(amount>0){
            //количество занятых мест на 1 больше, чем номер последнего занятого места
            String name = passengers[amount-1];
            passengers[amount-1] = null;
            amount--;
            return name;
        }
        return "никого не было";
    }

    public String getPassengersStr(){
        return Arrays.toString(passengers);
    }

}

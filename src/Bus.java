import java.time.LocalDate;

public class Bus extends Transport {


    public Bus(String brand, String model, String color, int productionYear, String productionCountry, double maxSpeed) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
    }

    @Override
    public String toString() {
        return " Автобус {" +
                "бренд '" + getBrand() + '\'' +
                ", модель '" + getModel() + '\'' +
                ", цвет '" + getColor() + '\'' +
                ", год производства " + getProductionYear() +
                ", страна производства '" + getProductionCountry() + '\'' +
                ", максимальная скорость " + getMaxSpeed() +
                '}';

    }
}

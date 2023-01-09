import java.time.LocalDate;

public class Bus extends Transport {
    private double engineVolume;
    private String transmission;
    private String bodyType;
    private final String registrationNumber;
    private final String numberOfSeats;
    private String tireType;

    public Bus(String brand, String model, String productionCountry, double engineVolume, int productionYear, String color,
               String transmission, String bodyType, String registrationNumber, String numberOfSeats, String tireType, double maxSpeed) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;

        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (numberOfSeats == null || numberOfSeats.isEmpty() || numberOfSeats.isBlank()) {
            this.numberOfSeats = "default";
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (LocalDate.now().getMonthValue() > 3 && LocalDate.now().getMonthValue() < 11) {
            this.tireType = " Летняя резина ";
        } else {
            this.tireType = " Зимняя резина ";
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public String getTireType() {
        return tireType;
    }

    @Override
    public String toString() {
        return " Автобус {" +
                " бренд '" + getBrand() + '\'' +
                ", модель '" + getModel() + '\'' +
                ", цвет'" + getColor() + '\'' +
                ", год производства " + getProductionYear() +
                ", Страна производства '" + getProductionCountry() + '\'' +
                ", максимальная скорость " + getMaxSpeed() + " км/ч " +
                "  объём двигателя " + engineVolume +
                ", трансмиссия '" + transmission + '\'' +
                ", кузов '" + bodyType + '\'' +
                ", регистрационный номер '" + registrationNumber + '\'' +
                ", мест '" + numberOfSeats + '\'' +
                ", покрышки '" + tireType + '\'' +
                '}';
    }
}

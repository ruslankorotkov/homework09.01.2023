public class Main {
    public static void main(String[] args) {
        Car.Key key = new Car.Key("р", "п");
        Car lada = new Car("Lada", "Granta", " Россия", 1.7, 2015, "желтый", "автоматика", "седан", "5а6а54", "3", "", key, 234);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", " Германия", 3.0, 2020, "черный", "автоматика", "универсал", "ве5уе5", "5", "", key, 124);
        Car bmv = new Car("BMW", "Z8", " Германия", 3.0, 2021, "черный", "механика", "минивэн", "в4веее", "3", "", key, 134);
        Car kia = new Car("Kia", "Sportage 4-го поколения", " Южная Корея", 2.4, 2018, "красный", "механика", "хэтчбек", "ев4ев4в4", "4", "", key, 122);
        Car hyundai = new Car("Hyundai", "Avante", " Южная Корея", 1.6, 2016, "оранжевый", "автоматика", "кроссовер", "ве4еву", "4", "", key, 122);
        Bus ural = new Bus("Урал", "Next", " Россия", 6.65, 2022, "оранжевый", "механика 6X6", "вахтовый автобус", "ef", "22", "", 106);
        Bus paz = new Bus(" Паз", "Вектор Next", " Россия", 4.43, 2020, "металлик", "механика 4х2", "автобус малого класса", "gd", "26", "", 100);
        Bus мercedes = new Bus("Mercedes-Benz", "Tourismo", "Германия", 10.667, 2021, "металлик", "механика 6х2", "автобус туристического класса", "gr", "52", "", 101);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmv);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println(ural);
        System.out.println(paz);
        System.out.println(мercedes);
    }
}
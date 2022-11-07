public class Car {
    String brand;
    String model;
    int productionYear;
    String productionCountry;
    String color;
    double engineVolume;

    Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    void message(){
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска," + " сборка в " + productionCountry + ", " + color + " цвет кузова, " + "объём двигателя - " + engineVolume + "л.");
    }
}

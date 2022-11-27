public class Car {
    String brand;
    String model;
    int productionYear;
    String productionCountry;
    String color;
    double engineVolume;

    Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    void message() {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска," + " сборка в " + productionCountry + ", " + color + " цвет кузова, " + "объём двигателя - " + engineVolume + "л.");
    }
}

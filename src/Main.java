public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", "Минск", 1988, "бренд-менеджер");
        maxim.message();
        Human anya = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        anya.message();
        Human katia = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        katia.message();
        Human artyom = new Human("Артём", "Москва", 1995, "директор по развитию бизнеса");
        artyom.message();

        System.out.println();

        Car lada = new Car("Lada", "Granta", 2015, "России", "жёлтый", 1.7);
        lada.message();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "чёрный", 3.0);
        audi.message();
        Car bmw = new Car("BMW", "Z8", 2021, "Германии", "чёрный", 3.0);
        bmw.message();
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Коррее", "красный", 2.4);
        kia.message();
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 1.6);
        hyundai.message();
    }
}

// Похоже я сделал просто коммит и не знаю ак его запушить на гитхаб. Собственно поэтому тут этот коментарий :-(
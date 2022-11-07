public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", "Минск", 1988, "бренд-менеджер");
        maxim.message();
        Human anya = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        anya.message();
        Human katia = new Human("Катя", "Клининград", 1992, "продакт-менеджер");
        katia.message();
        Human artyom = new Human("Артём", "Москва", 1995, "директор по развитию бизнеса");
        artyom.message();
    }
}
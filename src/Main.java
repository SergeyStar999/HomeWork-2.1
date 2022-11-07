public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", "Минск", 1988);
        maxim.message();
        Human anya = new Human("Аня", "Москва",1993);
        anya.message();
        Human katia = new Human("Катя", "Клининград", 1992);
        katia.message();
        Human artyom = new Human("Артём", "Москва", 1995);
        artyom.message();
    }
}
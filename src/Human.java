public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null) {
            this.name = "Инофрмация не указанна";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указанна";
        } else {
            this.town = town;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указанна";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    void message() {
        System.out.println("Привет! Меня зовут " + name + "." + " Я из города " + town + "." + " Я родился в " + yearOfBirth + " году. Я работаю на должности "+ jobTitle + ". " + "Будем знакомы!");
    }
}

// Похоже я сделал просто коммит и не знаю ак его запушить на гитхаб. Собственно поэтому тут этот коментарий :-(

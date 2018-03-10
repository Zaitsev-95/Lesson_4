import java.util.Scanner;

public class Patient {
    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private String diagnosis;
    private boolean writeOut;

    public void inputDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите Фамилию: ");
        surname = scanner.nextLine();
        System.out.println("Ввидите Имя: ");
        name = scanner.nextLine();
        System.out.println("Ввидите Отчество: ");
        patronymic = scanner.nextLine();
        System.out.println("Ввидите возраст: ");
        age = scanner.nextInt();
        System.out.println("Введите диагноз (в случае его отсутствия оставьте поле не заполненным): ");
        scanner.nextLine();
        diagnosis = scanner.nextLine();
    }

    public void outputDate() {
        String input = "";
        if (diagnosis.equals(input)) {
            writeOut = false;
        } else {
            writeOut = true;
        }
        if (writeOut)
            System.out.println("ФИО пациента: " + surname + " " + name + " " + patronymic + ", Возраст: " + age + ", Диагноз -\""
                    + diagnosis + "\" , Предстоит ли выписать? - \"Нет\"");
        else
            System.out.println("ФИО пациента: " + surname + " " + name + " " + patronymic + ", Возраст: " + age + ", Диагноз -\""
                    + diagnosis + "\" , Предстоит ли выписать? - \"Да\"");
    }

    public void surnameSearch(String surname) {
        if (surname.equals(this.surname))
            outputDate();
    }

    public void ageSearch(int age) {
        if (age == this.age)
            outputDate();
    }
}
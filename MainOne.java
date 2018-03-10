import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient[] patients = new Patient[2];
        int patientsLength = patients.length;
        for (int i = 0; i < patientsLength; i++) {
            patients[i] = new Patient();
            patients[i].inputDate();
            patients[i].outputDate();
        }
        System.out.println("У Вас есть возможность осуществить поиск:\n " + "Если вы введёте цифру \"1\", поиск будет осуществляться по Фамилии\n " + "Если вы введёте цифру \"2\", поиск будет осуществляться по Возрасту");
        int namberSerch = scanner.nextInt();
        scanner.nextLine();
        if (namberSerch == 1) {
            System.out.println("Введите Фамилию: ");
            String surname = scanner.nextLine();
            for (int j = 0; j < patientsLength; j++) {
                patients[j].surnameSearch(surname);
            }
        } else if (namberSerch == 2) {
            System.out.println("Введите Возраст: ");
            int age = scanner.nextInt();
            for (int j = 0; j < patientsLength; j++) {
                patients[j].ageSearch(age);
            }
        } else
            System.out.println("Ввод был осуществлён не коректно");
    }
}
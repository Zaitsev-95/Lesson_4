import java.util.Scanner;

public class Site {
    public static void main(String[] args) {
        System.out.println("Введите количество новостей: ");
        Scanner scanner = new Scanner(System.in);
        Site site = new Site(scanner.nextInt());
        System.out.println("Необходимо страниц: " + site.getPages());
    }

    public int news;
    public int pages;

    Site(int news) {
        this.news = news;
    }

    public int getPages() {
        if (news % 10 == 0) {
            pages = news / 10;
            return pages;
        } else {
            pages = news / 10 + 1;
            return pages;
        }
    }
}
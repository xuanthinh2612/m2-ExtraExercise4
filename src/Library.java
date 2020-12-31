import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Them Sinh Vien");
        System.out.println("2.Xem Thong Tin Sinh Vien");
        System.out.println("3. Xem DS SV");
        System.out.println("0. Exit");
        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    manager.add();
                    break;
                case 2:
                    manager.showInfo();
                    break;
                case 3:
                    manager.showAllStudent();
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
            System.out.println("Menu");
            System.out.println("1.Them Sinh Vien");
            System.out.println("2.Xem Thong Tin Sinh Vien");
            System.out.println("3. Xem DS SV");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
        }
    }
}

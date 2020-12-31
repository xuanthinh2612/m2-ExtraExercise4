import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Manager {
    static Scanner sc = new Scanner(System.in);
    List<LibraryCard> list = new ArrayList<>();
    public void add(){
        list.add(create());
    }
    private LibraryCard create(){
        System.out.println("Nhap Thong Tin The Thu Vien");
        System.out.println("Nhap Ten Sinh Vien");
        String studentName = sc.nextLine();
        System.out.println("Nhap Ma Sinh Vien");
        int studentId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Ngay Sinh ");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhap Ten Lop ");
        String className = sc.nextLine();
        System.out.println("Nhap Ma so the thu vien ");
        int rentNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ngay muon ");
        String rentDate = sc.nextLine();
        System.out.println("Nhap Ngay Tra ");
        String returnDate = sc.nextLine();
        System.out.println("Nhap Ma Sach ");
        int bookId = Integer.parseInt(sc.nextLine());
        LibraryCard card = new LibraryCard(studentName, studentId, dateOfBirth,className, rentNumber, rentDate,  returnDate,  bookId);
        return card;
    }
    public void showInfo(){
        System.out.println("Nhap ma sinh vien: ");
        int id = sc.nextInt();
        for (LibraryCard l : list){
            if (l.getStudentId()==id){
                System.out.println(l.toString());
            }
        }
    }
    public void showAllStudent(){
        for (LibraryCard l : list){
            System.out.println("Name: "+l.getStudentName()+", rented Book Number: "+l.getBookId());;
        }
    }
}

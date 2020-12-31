import java.util.Date;

public class LibraryCard extends Student {
    private int rentNumber;
    private String rentDate;
    private String returnDate;
    private int bookId;

    public LibraryCard(String studentName, int studentId, String birthOfDate, String className, int rentNumber, String rentDate, String returnDate, int bookId) {
        super(studentName, studentId, birthOfDate, className);
        this.rentNumber = rentNumber;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.bookId = bookId;
    }

    public int getRentNumber() {
        return rentNumber;
    }

    public void setRentNumber(int rentNumber) {
        this.rentNumber = rentNumber;
    }

    public String getRentDate() {
        return rentDate;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return super.toString()+
                "LibraryCard{" +
                "rentNumber=" + rentNumber +
                ", rentDate=" + rentDate +
                ", returnDate=" + returnDate +
                ", bookId=" + bookId +
                '}';
    }
}

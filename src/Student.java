import java.util.Date;

public class Student {
    private String studentName;
    private int studentId;
    private String birthOfDate;
    private String className;

    public Student(String studentName, int studentId, String birthOfDate, String className) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.birthOfDate = birthOfDate;
        this.className = className;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(String birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", birthOfDate=" + birthOfDate +
                ", className='" + className + '\'' +
                '}';
    }
}

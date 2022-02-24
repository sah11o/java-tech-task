// create a Student class with the following attributes: name, roll number,marks, attnedance,
public class Student {
    String name;
    int rollNumber;
    int marks;
    int attendance;

    Student(String name, int rollNumber, int marks, int attendance) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + ", marks=" + marks + ", attendance=" + attendance + "]";
    }

    // increase student marks if attendance greater than 75%
    public void increaseMarks() {
        if (getAttendance() > 75) {
            int marks = getMarks();
            marks += .10 * marks;
            if(marks > 100) {
                marks = 100;
            }
            setMarks(marks);
            //print marks
            System.out.println("Marks increased to " + marks);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sahithi", 1, 93, 80);
        Student s2 = new Student("Jane", 2, 60, 90);
        s1.increaseMarks();
        s2.increaseMarks();
    }


}


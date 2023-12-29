

public class Student {
    private String name;
    private double studentAverage;

    public Student(String name, double studentAverage){
        this.name = name;
        this.studentAverage = studentAverage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStudentAverage() {
        return studentAverage;
    }

    public void setStudentAverage(double studentAverage) {
        this.studentAverage = studentAverage;
    }

    public String getLetterGrade(){
        String letterGrade = "";
        if(studentAverage >= 90){
            letterGrade = "A";
        }else if(studentAverage >= 80){
             letterGrade = "B";
        }else if(studentAverage >= 70){
             letterGrade = "C";
        }else if(studentAverage >= 60){
             letterGrade = "D";
        }else if(studentAverage >= 50){
             letterGrade = "E";
        }else
        letterGrade = "A";
        return letterGrade;
    }
    
}

public class StudentTest {

    public static void main(String[] args){

        Student student1 = new Student("Peter" , 73);
        Student student2 = new Student("Emmanuel", 98);

        String student1Name = student1.getName();
        System.out.printf("Your name is : %s \n" , student1Name);

        String student1Grade = student1.getLetterGrade();
        System.out.printf("Your grade is: %S ", student1Grade);
    }
    
}

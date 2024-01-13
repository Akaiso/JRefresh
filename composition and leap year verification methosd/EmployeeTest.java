// conposition demonstration chapter 8 Class Date , Employee and EmployeeTest


public class EmployeeTest {
    public static void main(String[] args){
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        System.out.println(employee);
    }
}

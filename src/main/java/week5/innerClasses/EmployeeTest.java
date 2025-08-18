package week5.innerClasses;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("yusuf","yukar");
        Employee.ContactInfo contact = employee.new ContactInfo("yusuf@example.com",555555555);

        employee.showEmployeeInfo(contact);
    }
}

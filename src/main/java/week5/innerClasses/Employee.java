package week5.innerClasses;

public class Employee {
    private String name;
    private String surName;

    public Employee(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public class ContactInfo {
        private Integer phone;
        private String email;

        public ContactInfo(String email, Integer phone) {
            this.email = email;
            this.phone = phone;
        }

        public Integer getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }
    }

    // Method to display employee and contact information
    public void showEmployeeInfo(ContactInfo contactInfo) {
        System.out.println("Employee: " + name + " " + surName);
        System.out.println("Phone: " + contactInfo.getPhone());
        System.out.println("Email: " + contactInfo.getEmail());
    }
}

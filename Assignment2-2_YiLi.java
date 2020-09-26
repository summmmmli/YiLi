class Employee {
    String name;
    int age;
    Gender gender;
    double salary; // salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
        //write your code here
        
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    // Getter for `name`. Return the current `name` data
    public String getName() {
        //write your code here
        return this.name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
        //write your code here
        this.name = name;
    }
    }

    enum Gender {
    MALE,
    FEMALE;
    }
    
    public class EmployeeSalaryCalculate {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        //write your code here
        double tax = 0;
        if(employee.salary <= 8900){
            tax = employee.salary * 0.062;
        } else {
            tax = 106800 * 0.062;
        }
        return tax;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
        //write your code here
        
        double insurance = 0;
        if(employee.age < 35){
            insurance = 0.03 * employee.salary;
        } 
        if(35 <= employee.age && employee.age <= 50){
            insurance = 0.04 * employee.salary;
        } 
        if(50 < employee.age && employee.age  < 60){
            insurance = 0.05 * employee.salary;
        }
        if(60 <= employee.age){
            insurance = 0.06 * employee.salary;
        }
        return insurance;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    
    public static void swap1(Employee e1, Employee e2){
        String temp = e1.getName();
        e1.setName(e2.getName());
        e2.setName(temp);
    } 
    
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here
        double salarye1 = 0;
        double salarye2 = 0;
        double salarye3 = 0;
        salarye1 = e1.salary;
        salarye2 = e2.salary;
        salarye3 = e3.salary;
        if (salarye2 < salarye3){
            swap1(e2, e3);
        }
        if (salarye1 < salarye2){
            swap1(e1, e2);
        }
        System.out.println(e1.getName() + e2.getName() + e3.getName());
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
        //write your code here
        
        employee.salary = 3 * employee.salary;
    }
    
    // Try to add a new method in Employee class: public void raiseSalary(double byPercent)
    public void raiseSalary(Employee employee, double byPercent) {
        double raise = employee.salary * byPercent / 100;
        employee.salary += raise; 
    }
    
    
    //Extra credit
    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
     
     ANSWER:
     The reason is that java does not support reference transmission like the code shows. 
     The assigned value is just an index but not the real variable, so the value does not change. 
     
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }


    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}

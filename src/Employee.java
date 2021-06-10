public class Employee extends EmployeeAbstract implements Salary {
    private String name;
    private int age;
    private String gender;
    private double salary;
    private int type;
    private double HRA;
    private double DA;
    private double TA;
    private int hour;
    private double perHourSalary;

    Employee(String name, int age, String gender, double salary, int type,
             double HRA,double DA,double TA,int hour,double perHourSalary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.type = type;

        this.HRA = HRA;
        this.DA = DA;
        this.TA = TA;
        this.hour = hour;
        this.perHourSalary = perHourSalary;

    }

    public void printDetails (){
        System.out.println("this Employee name = " + name);
        System.out.println("this Employee age = " + age);
        System.out.println("this Employee gender = " + gender);
        System.out.println("this Employee salary = " + salary);
    }

    public double getal(double HRA,double DA ,double TA) {
        double tal = 0.00;
        tal = HRA + DA +TA +this.salary;
        return tal;
    }

    public double getal(int hour, double perHourSalary) {
        double tal = 0.00;
        tal = hour * perHourSalary;
        return tal;
    }

    public static void main(String[] args) {
        Employee  e = new Employee("he xiao feng", 22, "famale", 55.00, 0
        ,1,2,3,4,5);
        double tal = 0.00;
        // 0 is hour
        // 1 is month
        if(e.type == 0){
            tal = e.getal(e.HRA,e.DA,e.TA);
        } else if(e.type == 1)  {
            tal = e.getal(e.hour, e.perHourSalary);
        }
        e.printDetails();
        System.out.println("salary = "+ tal);
    }
}


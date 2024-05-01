public class Nurse {
    private String name;
    private String department;

    public  Nurse(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void assistDoctor(Doctor doctor) {
        System.out.println(name + " assists " + doctor.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

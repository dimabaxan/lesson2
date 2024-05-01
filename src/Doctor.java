public class Doctor {
    private String name;
    private String specialization;
    public Doctor (String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void examinePatient(String patient) {
        System.out.println(name + " examines " + patient);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

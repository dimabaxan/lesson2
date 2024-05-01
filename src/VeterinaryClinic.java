import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Object> patients;
    private Doctor doctor;
    private Nurse  nurse;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public VeterinaryClinic() {
        patients = new ArrayList<>();
    }

    public void addPatient(Object patient) {
        patients.add(patient);
    }

    public List<Goable> getRunners() {
        List<Goable> runners = new ArrayList<>();
        for (Object patient : patients) {
            if (patient instanceof Goable) {
                runners.add((Goable) patient);
            }
        }
        return runners;
    }

    public List<Swimable> getSwimmers() {
        List<Swimable> swimmers = new ArrayList<>();
        for (Object patient : patients) {
            if (patient instanceof Swimable) {
                swimmers.add((Swimable) patient);
            }
        }
        return swimmers;
    }

    public List<Flyable> getFlyers() {
        List<Flyable> flyers = new ArrayList<>();
        for (Object patient : patients) {
            if (patient instanceof Flyable) {
                flyers.add((Flyable) patient);
            }
        }
        return flyers;
    }

    public void doctorActions() {
        for (Object patient : patients) {
            doctor.examinePatient(patient.getClass().getName());
        }
    }

    public void nurseActions() {
        nurse.assistDoctor(doctor);
    }
}

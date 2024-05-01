//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VeterinaryClinic vetClinic = getVeterinaryClinic();

        System.out.println("Runners:");
        for (Goable runner : vetClinic.getRunners()) {
            runner.run(10);
        }

        System.out.println("Swimmers:");
        for (Swimable swimmer : vetClinic.getSwimmers()) {
            System.out.println(swimmer.swim());
        }

        System.out.println("Flyers:");
        for (Flyable flyer : vetClinic.getFlyers()) {
            System.out.println(flyer.fly());
        }
        vetClinic.getFlyers().forEach(flyable -> {
            System.out.println(flyable.fly());
        });

        vetClinic.doctorActions();
        vetClinic.nurseActions();
    }

    private static VeterinaryClinic getVeterinaryClinic() {
        Doctor doctor1 = new Doctor("Dr. Colea", "Cardiologist");
        Nurse nurse1 = new Nurse("Nurse Ina ", "Emergency");

        Runner runner1 = new Runner();
        Sprinter sprinter1 = new Sprinter();
        Swimmer swimmer1 = new Swimmer();
        Diver diver = new Diver();
        Flyer flyer1 = new Flyer();
        Glider glider1 = new Glider();

        VeterinaryClinic vetClinic = new VeterinaryClinic();
        vetClinic.setDoctor(doctor1);
        vetClinic.setNurse(nurse1);
        vetClinic.addPatient(runner1);
        vetClinic.addPatient(sprinter1);
        vetClinic.addPatient(swimmer1);
        vetClinic.addPatient(diver);
        vetClinic.addPatient(flyer1);
        vetClinic.addPatient(glider1);
        return vetClinic;
    }
}

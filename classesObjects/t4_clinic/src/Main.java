public class Main {
    public static void main(String[] args) {
        System.out.println("4. Clinic model");
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);
        Patient patient4 = new Patient(456);
        patient1.treat();
        patient2.treat();
        patient3.treat();
        patient4.treat();
    }
}

class Surgeon{

    public void Treat(){
        System.out.println("Surgeon performs operation");
    }

}

class Dentist {

    public void Treat(){
        System.out.println("Dentist performs br-br-br to the teeth");
    }

}

class Therapist {
    public void Treat(){
        System.out.println("Therapist prescribes therapy");
    }
}

class Patient {
    int type;

    public Patient(int type){
        this.type = type;
    }

    public void treat(){
        Treatment treatment = new Treatment();
        treatment.treatmentPlan(this);
    }

}

class Treatment{

    public void treatmentPlan(Patient patient){
        switch (patient.type){
            case 1:
                Surgeon surgeon = new Surgeon();
                surgeon.Treat();
                break;
            case 2:
                Dentist dentist = new Dentist();
                dentist.Treat();
                break;
            default:
                Therapist therapist = new Therapist();
                therapist.Treat();
                break;
        }

    }
}

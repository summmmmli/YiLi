package assignment7;

import java.util.concurrent.atomic.AtomicInteger;

public class HospitalRoom {
    //TODO: implement your code here
    private static final int DOCTOR_CAPACITY = 1;
    private static final int PATIENT_CAPACITY = 3;

    private AtomicInteger doctorNum = new AtomicInteger(0);
    private AtomicInteger patientNum = new AtomicInteger(0);

    private ThreadLocal<Boolean> hasPrintedWaitingMsg = ThreadLocal.withInitial(() -> false);

    public boolean doctorEnter(Doctor d) throws InterruptedException {
        //TODO: implement your code here

        synchronized (this) {
            if (doctorNum.get() < DOCTOR_CAPACITY) {
                doctorNum.incrementAndGet();
                System.out.println(String.format("Doctor %s Entered, number of doctor %d", d.name, doctorNum.get()));
                return true;
            }

            if (!hasPrintedWaitingMsg.get()) {
                System.out.println(String.format("Doctor %s is waiting to Enter, number of doctor %d", d.name, doctorNum.get()));
                hasPrintedWaitingMsg.set(true);
            }
            return false;
        }
    }

    public boolean doctorLeave(Doctor d) throws InterruptedException {
        //TODO: implement your code here

        synchronized (this) {
            if (doctorNum.get() > 0) {
                doctorNum.decrementAndGet();
                System.out.println(String.format("Doctor %s left, number of doctor %d", d.name, doctorNum.get()));
                return true;
            }

            return false;
        }
    }

    public boolean patientEnter(Patient p) throws InterruptedException {
        //TODO: implement your code here

        synchronized (this) {
            if (patientNum.get() < PATIENT_CAPACITY) {
                patientNum.incrementAndGet();
                System.out.println(String.format("Patient %s Entered, number of patients %d", p.name, patientNum.get()));
                return true;
            }

            if (!hasPrintedWaitingMsg.get()) {
                System.out.println(String.format("Patient %s is waiting to Enter, number of patients %d", p.name, patientNum.get()));
                hasPrintedWaitingMsg.set(true);
            }
            return false;
        }
    }

    public boolean patientLeave(Patient p) throws InterruptedException {
        //TODO: implement your code here

        synchronized (this) {
            if (patientNum.get() > 0) {
                patientNum.decrementAndGet();
                System.out.println(String.format("Patient %s left, number of patients %d", p.name, patientNum.get()));
                return true;
            }

            return false;
        }
    }

}

class Doctor {
    public String name;
    public Doctor(String name) {
        this.name = name;
    }
}

class Patient {
    public String name;
    public Patient(String name) {
        this.name = name;
    }
}

class Main2 {
    public static void main(String[] args) throws InterruptedException {
        HospitalRoom room = new HospitalRoom();
        Doctor siva = new Doctor("siva");
        Doctor john = new Doctor("john");
        Patient p1 = new Patient("p1");
        Patient p2 = new Patient("p2");
        Patient p3= new Patient("p3");
        Patient p4 = new Patient("p4");
        Patient p5 = new Patient("p5");
        Thread doctor1 = new Thread(() -> {
            try {
                while(!room.doctorEnter(siva)) {}
                Thread.sleep(500);
                while(!room.doctorLeave(siva)) {}

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread doctor2 = new Thread(() -> {
            try {
                while(!room.doctorEnter(john)) {}
                Thread.sleep(500);
                while(!room.doctorLeave(john)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient1 = new Thread(() -> {
            try {
                while(!room.patientEnter(p1)) {}
                Thread.sleep(500);
                while(!room.patientLeave(p1)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient2 = new Thread(() -> {
            try {
                while(!room.patientEnter(p2)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p2)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient3 = new Thread(() -> {
            try {
                while(!room.patientEnter(p3)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p3)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient4 = new Thread(() -> {
            try {
                while(!room.patientEnter(p4)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p4)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient5 = new Thread(() -> {
            try {
                while(!room.patientEnter(p5)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p5)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        doctor1.start();
        doctor2.start();
        patient1.start();
        patient2.start();
        patient3.start();
        patient4.start();
        patient5.start();
    }
}
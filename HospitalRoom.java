package assignment7;

public class HospitalRoom {
    public int numberofd = 0;
    public int numberofp = 0;

    public boolean doctorEnter(Doctor d) throws InterruptedException {
    	if (numberofd == 0) {
    		System.out.println("Doctor" + d.toString() + "Entered");
    	} else {
    		System.out.println("Doctor" + d.toString() + "is waiting to Enter");
    	}
    	numberofd += 1;
    	System.out.println("Number of doctor: " + numberofd);
    	return true;
    }

    public boolean doctorLeave(Doctor d) throws InterruptedException {
    	numberofd -= 1;
    	System.out.println("Doctor" + d.toString() + "Left");
    	System.out.println("Number of doctor: " + numberofd);
    	return true;
    }

    public boolean patientEnter(Patient p) throws InterruptedException {
    	if (numberofp == 0) {
    		System.out.println("Patient" + p.toString() + "Entered");
    	} else {
    		System.out.println("Patient" + p.toString() + "is waiting to Enter");
    	}
    	numberofp += 1;
    	System.out.println("Number of Patient: " + numberofp);
    	return true;
    }

    public boolean patientLeave(Patient p) throws InterruptedException {
    	numberofp -= 1;
    	System.out.println("Patient" + p.toString() + "Left");
    	System.out.println("Number of Patient: " + numberofp);
    	return true;
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


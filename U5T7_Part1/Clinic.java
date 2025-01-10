package U5T7_Part1;

public class Clinic {
    private static int totalClinics = 0;
    private static int totalVaccinated = 0;
    private Person mostRecent;
    private int clinicVaccinated;
    
    public Clinic() {
        totalClinics++;
        mostRecent = null;
        clinicVaccinated = 0;
    }

    public boolean vaccinate(Person person) {
        if (!person.isVaccinated()) {
            person.vaccine();
            totalVaccinated++;
            clinicVaccinated++;
            mostRecent = person;
            return true;
        } else {
            return false;
        }
    }

    public static int getTotalClinics() {
        return totalClinics;
    }

    public static int getTotalVaccineCount() {
        return totalVaccinated;
    }

    public Person mostRecentlyVaccinated() {
        return mostRecent;
    }

    public int getClinicVaccineCount() {
        return clinicVaccinated;
    }
}

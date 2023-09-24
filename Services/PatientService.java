package Services;

import Osnova.Hospital;
import Osnova.Patient;

import java.util.List;
import java.util.Map;

public interface PatientService {
    void addPatientsToHospital(List<Hospital> hospital);
    void getPatientById(List<Hospital> hospital);
    void getPatientByAge(List<Hospital> hospital);
    void sortPatientsByAge(List<Hospital> hospital);
}

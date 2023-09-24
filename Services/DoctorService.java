package Services;

import Osnova.Doctor;
import Osnova.Hospital;

import java.util.List;

public interface DoctorService {
   void findDoctorById(List<Hospital> hospital);
    void assignDoctorToDepartment(List<Hospital> hospital);
    void getAllDoctorsByHospitalId(List<Hospital> hospital);
    void getAllDoctorsByDepartmentId(List<Hospital> hospital);
}

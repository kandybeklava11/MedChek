package Services;

import Osnova.Hospital;
import Osnova.Patient;

import java.util.List;
import java.util.Map;

public interface HospitalService {
    void addHospital(List<Hospital> hospital);
    void findHospitalById(List<Hospital> hospital);
    void getAllHospital(List<Hospital> hospital);
    void getAllPatientFromHospital(List<Hospital> hospital);
    void deleteHospitalById(List<Hospital> hospital);
    void getAllHospitalByAddress(List<Hospital> hospital);
}

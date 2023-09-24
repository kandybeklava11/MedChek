package Services;

import Osnova.Department;
import Osnova.Hospital;

import java.util.List;

public interface DepartmentService {
    void getAllDepartmentByHospital(List<Hospital> hospital);
    void findDepartmentByName(List<Hospital> hospital );

}

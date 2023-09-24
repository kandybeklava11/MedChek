import Osnova.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(new Doctor("Alison", "Mato", "Male", 7));

        List<Doctor> doctorList2 = new ArrayList<>();
        doctorList2.add(new Doctor("Madison", "Antony", "Female", 3));

        List<Doctor> doctorList3 = new ArrayList<>();
        doctorList3.add(new Doctor("Mateo", "Albert", "Male", 5));
        /////////////////////////////////////////////////////////////////////////////////////
        List<Department> departmentList = new ArrayList<>();
        departmentList.add(new Department("Victorina", doctorList));

        List<Department> departmentList2 = new ArrayList<>();
        departmentList2.add(new Department("Assort", doctorList2));

        List<Department> departmentList3 = new ArrayList<>();
        departmentList3.add(new Department("Vegas", doctorList3));
        /////////////////////////////////////////////////////////////////////////////////////
        List<Patient> patientList = new ArrayList<>();
        patientList.add(new Patient("Maria", "Javanda", 40, "Female"));

        List<Patient> patientList2 = new ArrayList<>();
        patientList2.add(new Patient("Marco ", "Jr", 23, "Male"));

        List<Patient> patientList3 = new ArrayList<>();
        patientList3.add(new Patient("Leila", "Miranda", 35, "Female"));
        /////////////////////////////////////////////////////////////////////////////////////////
        List<Hospital> hospitalList = new ArrayList<>();
        hospitalList.add(new Hospital("4th City Hospital", "Dredross 24", departmentList, doctorList, patientList));

        List<Hospital> hospitalList2 = new ArrayList<>();
        hospitalList2.add(new Hospital("Helly Hospital", "Fredrico 888", departmentList2, doctorList2, patientList2));

        List<Hospital> hospitalList3 = new ArrayList<>();
        hospitalList3.add(new Hospital("Daria Hospital", "LOS ANGELES 111", departmentList3, doctorList3, patientList3));
        //////////////////////////////////////////////////////////////////////////////////////////
        List<Hospital> hospitals = new ArrayList<>();
        hospitals.addAll(hospitalList);
        hospitals.addAll(hospitalList2);
        hospitals.addAll(hospitalList3);

        System.out.println(hospitals);

        DataBase dataBase=new DataBase();

        int choice=0;
        do{
            System.out.println("\n1. -> Get all departments by hospital ID"+
                    "\n2. -> Find department by name"+
                    "\n3. -> Find doctor by ID"+
                    "\n4. -> Add doctor to department"+
                    "\n5. -> Get all doctors by hospital ID"+
                    "\n6. -> Get all doctors by department ID"+
                    "\n7. -> Add hospital"+
                    "\n8. -> Find hospital by ID"+
                    "\n9. -> Get all hospital"+
                    "\n10.-> Get all patients from hospital"+
                    "\n11.-> Delete hospital by ID"+
                    "\n12.-> Get hospital by address"+
                    "\n13.-> Add patients to hospital"+
                    "\n14.-> Get patients by ID"+
                    "\n15.-> Get patient by age"+
                    "\n16.-> Sort patients by age"+
                    "\n17.-> Exit");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    dataBase.getAllDepartmentByHospital(hospitals);
                    break;
                case 2:
                    dataBase.findDepartmentByName(hospitals);
                    break;
                case 3:
                    dataBase.findDoctorById(hospitals);
                    break;
                case 4:
                    dataBase.assignDoctorToDepartment(hospitals);
                    break;
                case 5:
                    dataBase.getAllDoctorsByHospitalId(hospitals);
                    break;
                case 6:
                    dataBase.getAllDoctorsByDepartmentId(hospitals);
                    break;
                case 7:
                    dataBase.addHospital(hospitals);
                    break;
                case 8:
                    dataBase.findHospitalById(hospitals);
                    break;
                case 9:
                    dataBase.getAllHospital(hospitals);
                    break;
                case 10:
                    dataBase.getAllPatientFromHospital(hospitals);
                    break;
                case 11:
                    dataBase.deleteHospitalById(hospitals);
                    break;
                case 12:
                    dataBase.getAllHospitalByAddress(hospitals);
                    break;
                case 13:
                    dataBase.addPatientsToHospital(hospitals);
                    break;
                case 14:
                    dataBase.getPatientById(hospitals);
                    break;
                case 15:
                    dataBase.getPatientByAge(hospitals);
                    break;
                case 16:
                    dataBase.sortPatientsByAge(hospitals);
                    break;
                case 17:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Write correct choice !!");
            }
        }while (choice!=17);

    }
}
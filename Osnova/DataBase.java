package Osnova;

import Services.*;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

public class DataBase implements DepartmentService, DoctorService, HospitalService, PatientService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void getAllDepartmentByHospital(List<Hospital> hospital) {
        System.out.println("Write hospital's ID to get all department");
        int hospitalId = scanner.nextInt();
        boolean b = false;
        for (Hospital hoss : hospital) {
            for (Department depp : hoss.getDepartments()) {
                if (depp.getId() == hospitalId) {
                    System.out.println("Found:");
                    System.out.println(depp);
                    b = true;
                    break;
                }
            }
        }
        if (!b) {
            System.out.println("Not found");
        }
    }

    @Override
    public void findDepartmentByName(List<Hospital> hospital) {
        System.out.println("Write department's name");
        String DepName = scanner.nextLine();
        boolean b = false;
        for (Hospital hoss : hospital) {
            for (Department depp : hoss.getDepartments()) {
                if (depp.getDepartmentName().equalsIgnoreCase(DepName)) {
                    System.out.println(depp);
                    b = true;
                    break;
                }

            }

        }
        if (!b) {
            System.out.println("Not found");
        }
    }

    @Override
    public void findDoctorById(List<Hospital> hospital) {
        System.out.println("Write doctor's ID");
        int doctorId = scanner.nextInt();
        boolean d = false;
        for (Hospital hoss : hospital) {
            for (Doctor docc : hoss.getDoctors()) {
                if (docc.getId() == doctorId) {
                    System.out.println(docc);
                    d = true;
                    break;
                }
            }
        }
        if (!d) {
            System.out.println(" Not found");
        }

    }

    @Override
    public void assignDoctorToDepartment(List<Hospital> hospital) {
        System.out.println("Write department's ID to add doctor");
        int depID = scanner.nextInt();
        boolean b = false;
        for (Hospital hoss : hospital) {
            for (Department depp : hoss.getDepartments()) {
                if (depp.getId() == depID) {
                    System.out.println("Write doctor's first name");
                    String Fname = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Write doctor's last name");
                    String Lname = scanner.nextLine();
                    System.out.println("Write doctor's gender");
                    String gender = scanner.nextLine();
                    System.out.println("Write doctor's experience year");
                    int exYear = scanner.nextInt();
                    Doctor doctor = new Doctor(Fname, Lname, gender, exYear);
                    hoss.getDoctors().add(doctor);
                    System.out.println(depp);
                    b = true;
                    break;
                }

            }

        }
        if (!b) {
            System.out.println("Not found");
        }


    }

    @Override
    public void getAllDoctorsByHospitalId(List<Hospital> hospital) {
        System.out.println("Write hospital's ID");
        int hosI = scanner.nextInt();
        boolean b = false;
        for (Hospital hoss : hospital) {
            if (hoss.getId() == hosI) {
                System.out.println(hoss.getDoctors());
                b = true;
                break;
            }
        }
        if (!b) {
            System.out.println("Not found");
        }

    }

    @Override
    public void getAllDoctorsByDepartmentId(List<Hospital> hospital) {
        System.out.println("Write department's ID");
        int depID = scanner.nextInt();
        boolean b = false;
        for (Hospital hoss : hospital) {
            for (Department depp : hoss.getDepartments()) {
                if (depp.getId() == depID) {
                    System.out.println(hoss.getDoctors());
                    b = true;
                    break;
                }
            }
        }
        if (!b) {
            System.out.println("Not found");
        }
    }


    @Override
    public void addHospital(List<Hospital> hospital) {
        System.out.println("Write hospital's name");
        String Hname = scanner.nextLine();
        System.out.println("Write address");
        String address = scanner.nextLine();

        System.out.println("Write department's name");
        String DNAme = scanner.nextLine();
        scanner.nextLine();
        Doctor doctor = new Doctor(null, null, null, 0);
        List<Doctor> docList = new ArrayList<>();
        docList.add(doctor);
        Department department = new Department(DNAme, docList);
        List<Department> departmentList = new ArrayList<>();
        departmentList.add(department);

        System.out.println("Write doctor's first name");
        String Fname = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Write doctor's last name");
        String Lname = scanner.nextLine();
        System.out.println("Write doctor's gender");
        String gend = scanner.nextLine();
        System.out.println("Write doctor's experience year");
        int exyear = scanner.nextInt();
        Doctor doctor2 = new Doctor(Fname, Lname, gend, exyear);
        List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(doctor2);
//
        System.out.println("Write patient's first name");
        String FName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Write patient's last name");
        String LName = scanner.nextLine();
        System.out.println("Write patient's age");
        int Age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Write patient's gender");
        String gender = scanner.nextLine();
        Patient patient = new Patient(FName, LName, Age, gender);
        List<Patient> patientList = new ArrayList<>();
        patientList.add(patient);
        System.out.println("Successfully added");
        Hospital hospital1 = new Hospital(Hname, address, departmentList, doctorList, patientList);
        hospital.add(hospital1);
        System.out.println(hospital1);

    }

    @Override
    public void findHospitalById(List<Hospital> hospital) {
        System.out.println("Write hospital's ID");
        int Id = scanner.nextInt();
        boolean b = false;
        for (Hospital hoss : hospital) {
            if (hoss.getId() == Id) {
                System.out.println(hoss);
                b = true;
                break;
            }
        }
        if (!b) {
            System.out.println("Not found");
        }
    }

    @Override
    public void getAllHospital(List<Hospital> hospital) {
        for (Hospital hoss : hospital) {
            System.out.println(hoss);
        }
    }

    @Override
    public void getAllPatientFromHospital(List<Hospital> hospital) {
        System.out.println("Write Hospitals Id to get all patients");
        int Id = scanner.nextInt();
        boolean b = false;
        for (Hospital hoss : hospital)
            if (hoss.getId() == Id) {
                for (Patient patt : hoss.getPatients()) {
                    System.out.println(patt);
                    b = true;
                    break;
                }
            }
        if (!b) {
            System.out.println("Not found");
        }
    }

    @Override
    public void deleteHospitalById(List<Hospital> hospital) {
        System.out.println("Write hospital's ID");
        int id = scanner.nextInt();
        boolean found = false;

        for (Hospital hoss : hospital) {
            if (hoss.getId() == id) {
                hospital.remove(hoss);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Not found");
        }
    }

    @Override
    public void getAllHospitalByAddress(List<Hospital> hospital) {
        System.out.println("Write address to get all hospitals");
        String Addre = scanner.nextLine();
        boolean b = false;
        for (Hospital hoss : hospital) {
            if (hoss.getAddress().equalsIgnoreCase(Addre)) {
                System.out.println(hoss);
                b = true;
                break;
            }
        }
        if (!b) {
            System.out.println("Not found");
        }
    }

    @Override
    public void addPatientsToHospital(List<Hospital> hospital) {
        System.out.println("Write hospital's Id to add patients");
        int id = scanner.nextInt();
        boolean b = false;
        for (Hospital hoss : hospital) {
            if (hoss.getId() == id) {
                System.out.println("Write patient's first name");
                String FName = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Write patient's last name");
                String LName = scanner.nextLine();
                System.out.println("Write patient's age");
                int Age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Write patient's gender");
                String gender = scanner.nextLine();
                Patient patient = new Patient(FName, LName, Age, gender);
                hoss.getPatients().add(patient);
                System.out.println(hoss);
                b = true;
                break;
            }
        }
        if (!b) {
            System.out.println("Not found");
        }
    }

    @Override
    public void getPatientById(List<Hospital> hospital) {
        System.out.println("Write patient's id ");
        int id = scanner.nextInt();
        boolean b = false;
        for (Hospital hoss : hospital) {
            for (Patient patt : hoss.getPatients()) {
                if (patt.getId() == id) {
                    System.out.println(patt);
                    b = true;
                    break;
                }

            }
        }
        if (!b) {
            System.out.println("Not found");
        }

    }

    @Override
    public void getPatientByAge(List<Hospital> hospital) {

        System.out.println("Write patient's age ");
        int age = scanner.nextInt();
        boolean b = false;
        for (Hospital hoss : hospital) {
            for (Patient patt : hoss.getPatients()) {
                if (patt.getAge() == age) {
                    System.out.println(patt);
                    b = true;
                    break;
                }

            }
        }
        if (!b) {
            System.out.println("Not found");
        }
    }

    @Override
    public void sortPatientsByAge(List<Hospital> hospital) {
        List<Patient> allPatients = hospital.stream()
                .flatMap(hospitall -> hospitall.getPatients().stream())
                .sorted(Comparator.comparingInt(Patient::getAge))
                .collect(Collectors.toList());

        allPatients.forEach(System.out::println);
                }
            }


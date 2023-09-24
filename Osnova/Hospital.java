package Osnova;

import java.util.List;

public class Hospital {
    private static int idd=1;
    private int id;
    private String hospitalName;
    private String address;
    private List<Department> departments;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName, String address, List<Department> departments, List<Doctor> doctors, List<Patient> patients) {
        this.id=idd;
        this.hospitalName = hospitalName;
        this.address = address;
        this.departments = departments;
        this.doctors = doctors;
        this.patients = patients;
        idd++;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Hospital.idd = idd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "\n------------------------------------------------------------------------------"+
                "\n Osnova.Hospital:" +
                "\n id=" + id +
                "\n hospitalName=" + hospitalName +
                "\n address=" + address +
                "\n departments=" + departments +
                "\n doctors=" + doctors +
                "\n patients=" + patients;
    }
}

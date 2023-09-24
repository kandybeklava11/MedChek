package Osnova;

import java.util.List;

public class Department {
    private static int idd=1;
    private int id;
    private String departmentName;
    private List<Doctor> doctors;

    public Department(String departmentName, List<Doctor> doctors) {
        this.id=idd;
        this.departmentName = departmentName;
        this.doctors = doctors;
        idd++;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Department.idd = idd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Osnova.Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", doctors=" + doctors +
                '}';
    }
}

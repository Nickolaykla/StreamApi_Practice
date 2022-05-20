public class Student {

    private String name;
    private String surName;
    private int age;
    private double gpa;
    private Faculty faculty;

    public Student(String name, String surName, int age, double gpa, Faculty faculty) {
        if (name != null && surName != null && age > 0 && gpa > 0 && faculty != null) {
            this.name = name;
            this.surName = surName;
            this.age = age;
            this.gpa = gpa;
            this.faculty = faculty;
        }
    }
    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", faculty=" + faculty +
                '}';
    }
}

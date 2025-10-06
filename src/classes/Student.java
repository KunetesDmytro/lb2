package classes;

public class Student {
    private int id;
    private String name;
    private String surName;
    private String fatherName;
    private String dateOfBirth;
    private String address;
    private String phone; // Змінено на String
    private String faculty;
    private int course;
    private int group;

    // Конструктор
    public Student(int id, String name, String surName, String fatherName,
                   String dateOfBirth, String address, String phone,
                   String faculty, int course, int group) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.fatherName = fatherName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    // Гетери
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSurName() { return surName; }
    public String getFatherName() { return fatherName; }
    public String getDateOfBirth() { return dateOfBirth; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getFaculty() { return faculty; }
    public int getCourse() { return course; }
    public int getGroup() { return group; }

    // Сетери
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSurName(String surName) { this.surName = surName; }
    public void setFatherName(String fatherName) { this.fatherName = fatherName; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setAddress(String address) { this.address = address; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setFaculty(String faculty) { this.faculty = faculty; }
    public void setCourse(int course) { this.course = course; }
    public void setGroup(int group) { this.group = group; }

    // toString метод
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
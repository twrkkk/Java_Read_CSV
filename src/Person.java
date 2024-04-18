import java.time.LocalDate;

/**
 * Represents a person in the organization.
 */
public class Person {
    private int id;
    private String name;
    private char gender;
    private Department department;
    private double salary;
    private LocalDate dateOfBirth;

    /**
     * Constructs a new Person object with the specified attributes.
     *
     * @param id          the unique identifier of the person
     * @param name        the name of the person
     * @param gender      the gender of the person ('M' for male, 'F' for female)
     * @param department  the department the person belongs to
     * @param salary      the salary of the person
     * @param dateOfBirth the date of birth of the person
     */
    public Person(int id, String name, char gender, Department department, double salary, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Retrieves the unique identifier of the person.
     *
     * @return the id of the person
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the person.
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the person.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the gender of the person.
     *
     * @return the gender of the person
     */
    public char getGender() {
        return gender;
    }

    /**
     * Sets the gender of the person.
     *
     * @param gender the gender to set ('M' for male, 'F' for female)
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * Retrieves the department the person belongs to.
     *
     * @return the department the person belongs to
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets the department the person belongs to.
     *
     * @param department the department to set
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * Retrieves the salary of the person.
     *
     * @return the salary of the person
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the person.
     *
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Retrieves the date of birth of the person.
     *
     * @return the date of birth of the person
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the date of birth of the person.
     *
     * @param dateOfBirth the date of birth to set
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Returns a string representation of the person.
     *
     * @return a string representation of the person
     */
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", department=" + department.getName() +
                ", salary=" + salary +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}

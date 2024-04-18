import java.util.UUID;

/**
 * Represents a department in an organization.
 */
public class Department {
    private UUID id;
    private String name;

    /**
     * Constructs a new Department object with the specified name.
     *
     * @param name the name of the department
     */
    public Department(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    /**
     * Retrieves the unique identifier of the department.
     *
     * @return the id of the department
     */
    public UUID getId() {
        return id;
    }

    /**
     * Retrieves the name of the department.
     *
     * @return the name of the department
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the department.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the department.
     *
     * @return a string representation of the department
     */
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

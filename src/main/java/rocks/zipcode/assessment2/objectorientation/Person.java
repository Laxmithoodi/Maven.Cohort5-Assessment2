package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person extends Address {

    private Long id;
    private String name;
    private Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.address= address;
        this.name= "PersonName";
        this.id = Long.MAX_VALUE;

    }

    public Person() {
        this.name = "";
        this.address = getAddress();
        this.id = Long.MIN_VALUE;


    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {

        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address + '\'' +
                "city=" + getCity() +
                '}';
    }

    @Override
    public boolean equals(Object o) {


        return (Boolean)true;
    }
}
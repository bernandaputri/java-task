package JavaTask2.Task1;

public class Person {
    private String firstName;
    private String lastName;
    private String domicile;
    private String birthYear;
    
    public String getFirstName() {
        return firstName;
    }
    // public void setFirstName(String firstName) {
    //     this.firstName = firstName;
    // }
    public String getLastName() {
        return lastName;
    }
    // public void setLastName(String lastName) {
    //     this.lastName = lastName;
    // }
    public String getDomicile() {
        return domicile;
    }
    // public void setDomicile(String domicile) {
    //     this.domicile = domicile;
    // }
    public String getBirthYear() {
        return birthYear;
    }
    // public void setBirthYear(String birthYear) {
    //     this.birthYear = birthYear;
    // }

    public Person (String firstName, String lastName, String domicile, String birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.domicile = domicile;
        this.birthYear = birthYear;
    }
}
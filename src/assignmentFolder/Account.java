public class Account {
    
    private String lastName;
    private String firstName;

    public void setName(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String getName(){
        return lastName + " " + firstName;
    }
    
}

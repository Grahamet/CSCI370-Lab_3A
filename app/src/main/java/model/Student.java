package model;

public class Student {
    private String lastname;
    private String firstname;
    private String major;

    public Student(String lastname, String firstname, String major) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.major = major;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getMajor(){
        return major;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setMajor(String major){
        this.major = major;
    }
}

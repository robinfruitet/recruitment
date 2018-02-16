package com.esgi.al.use_cases.interview_planning;

public class CandidateDTO {
    private String specialism;
    private int yearExperiences;
    private String firstName;
    private String lastName;
    private String email;

    public String getSpecialism() {
        return specialism;
    }

    public void setSpecialism(String specialism) {
        this.specialism = specialism;
    }

    public int getYearExperiences() {
        return yearExperiences;
    }

    public void setYearExperiences(int yearExperiences) {
        this.yearExperiences = yearExperiences;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

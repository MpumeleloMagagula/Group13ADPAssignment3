package za.ac.cput.Group13ADPAssignment3.Entity;

public class Patient {
    private String patientNumber, firstName, lastName, contactNumber, address;

    private Patient(Builder builder){
        this.patientNumber = builder.patientNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.contactNumber = builder.contactNumber;
        this.address = builder.address;
    }

    public static class Builder{
        private String patientNumber, firstName, lastName, contactNumber, address;

        public Builder setPatientNumber(String patientNumber) {
            this.patientNumber = patientNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        public Patient build(){
            return new Patient(this);
        }
    }
    @Override
    public String toString() {
        return "Patient{" +
                "patientNumber='" + patientNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

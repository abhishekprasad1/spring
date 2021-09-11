package com.hospital.details;

import org.springframework.stereotype.Component;

import java.util.Objects;
@Component
public class PatientDetail {
    private int id;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String MobileNumber;
    private String Address;

    public PatientDetail() {
    }



    public PatientDetail(int id, String firstName, String middleName, String lastName, String mobileNumber, String address) {
        this.id = id;
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        MobileNumber = mobileNumber;
        Address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientDetail that = (PatientDetail) o;
        return id == that.id &&
                MobileNumber == that.MobileNumber &&
                Objects.equals(FirstName, that.FirstName) &&
                Objects.equals(MiddleName, that.MiddleName) &&
                Objects.equals(LastName, that.LastName) &&
                Objects.equals(Address, that.Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, FirstName, MiddleName, LastName, MobileNumber, Address);
    }

    @Override
    public String toString() {
        return "PatientDetails{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", MobileNumber=" + MobileNumber +
                ", Address='" + Address + '\'' +
                '}';
    }
}

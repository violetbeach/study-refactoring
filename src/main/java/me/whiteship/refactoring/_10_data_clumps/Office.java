package me.whiteship.refactoring._10_data_clumps;

public class Office {

    private String location;
	private TelephoneNumber officePhoneNumber;

    public Office(String location, TelephoneNumber officePhoneNumber) {
        this.location = location;
        this.officePhoneNumber = officePhoneNumber;
    }



    public String officePhoneNumber() {
        return officePhoneNumber.toString();
    }

    public String getOfficeAreaCode() {
        return officePhoneNumber.getNumber();
    }

    public void setOfficeAreaCode(String officeAreCode) {
        officePhoneNumber.setAreaCode(officeAreCode);
    }

    public String getOfficeNumber() {
        return officePhoneNumber.getNumber();
    }

    public void setOfficeNumber(String officeNumber) {
        this.officePhoneNumber.setNumber(officeNumber);
    }
}

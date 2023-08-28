package me.whiteship.refactoring._10_data_clumps;

public class TelephoneNumber {

	private String areaCode;
	private String number;

	public TelephoneNumber(String personalAreaCode, String number) {
		this.areaCode = personalAreaCode;
		this.number = number;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public String getNumber() {
		return number;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return areaCode + "-" + number;
	}

}

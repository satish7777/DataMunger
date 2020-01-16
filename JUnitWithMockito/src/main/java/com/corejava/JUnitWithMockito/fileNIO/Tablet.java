package com.corejava.JUnitWithMockito.fileNIO;

public class Tablet {
	
	//Create a class Tablet with attributes,tablet name, manufacturer, manufacture date and expiry date.
	
	private String tabletName;
	private String manufacturer;
	private String manufactured_date;
	private String expiry_Date;
	public String getTabletName() {
		return tabletName;
	}
	public void setTabletName(String tabletName) {
		this.tabletName = tabletName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getManufactured_date() {
		return manufactured_date;
	}
	public void setManufactured_date(String manufactured_date) {
		this.manufactured_date = manufactured_date;
	}
	public String getExpiry_Date() {
		return expiry_Date;
	}
	public void setExpiry_Date(String expiry_Date) {
		this.expiry_Date = expiry_Date;
	}
	@Override
	public String toString() {
		return "Tablet [tabletName=" + tabletName + ", manufacturer=" + manufacturer + ", manufactured_date="
				+ manufactured_date + ", expiry_Date=" + expiry_Date + "]";
	}
	public Tablet(String tabletName, String manufacturer, String manufactured_date, String expiry_Date) {
		super();
		this.tabletName = tabletName;
		this.manufacturer = manufacturer;
		this.manufactured_date = manufactured_date;
		this.expiry_Date = expiry_Date;
	}
	public Tablet() {
		super();
	}
	

}

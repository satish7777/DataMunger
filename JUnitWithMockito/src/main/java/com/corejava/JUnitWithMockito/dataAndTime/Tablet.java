package com.corejava.JUnitWithMockito.dataAndTime;

import java.time.LocalDate;

public class Tablet {
	// tablet name, manufacturer, manufacture date and expiry date(LocalDate).

	private String tabletName;
	private String manufacturer;
	private LocalDate manufactureDate;
	private LocalDate expiryDate;

	public Tablet(String tabletName, String manufacturer, LocalDate manufactureDate, LocalDate expiryDate) {
		super();
		this.tabletName = tabletName;
		this.manufacturer = manufacturer;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Tablet [tabletName=" + tabletName + ", manufacturer=" + manufacturer + ", manufactureDate="
				+ manufactureDate + ", expiryDate=" + expiryDate + "]";
	}

	public Tablet() {
		super();
	}

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

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

}

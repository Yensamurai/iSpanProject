package com.web.store.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="weather")
public class WeatherBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="seqNo")
	Integer weatherId;
	@Transient
	String country;
	String dayLingtMaxT;
	String dayLingtMinT;
	String dayLingtState;
	String dayLingtStateVal;
	String dayLingtRain;
	String daynightMaxT;
	String daynightMinT;
	String daynightState;
	String daynightStateVal;
	String daynightRain;
	
	public WeatherBean(Integer weatherId, String country, String dayLingtMaxT, String dayLingtMinT, String dayLingtState,
			String dayLingtStateVal, String dayLingtRain, String daynightMaxT, String daynightMinT,
			String daynightState, String daynightStateVal, String daynightRain) {
		this.weatherId = weatherId;
		this.country = country;
		this.dayLingtMaxT = dayLingtMaxT;
		this.dayLingtMinT = dayLingtMinT;
		this.dayLingtState = dayLingtState;
		this.dayLingtStateVal = dayLingtStateVal;
		this.dayLingtRain = dayLingtRain;
		this.daynightMaxT = daynightMaxT;
		this.daynightMinT = daynightMinT;
		this.daynightState = daynightState;
		this.daynightStateVal = daynightStateVal;
		this.daynightRain = daynightRain;
	}

	public Integer getWeatherId() {
		return weatherId;
	}

	public void setWeatherId(Integer weatherId) {
		this.weatherId = weatherId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDayLingtMaxT() {
		return dayLingtMaxT;
	}

	public void setDayLingtMaxT(String dayLingtMaxT) {
		this.dayLingtMaxT = dayLingtMaxT;
	}

	public String getDayLingtMinT() {
		return dayLingtMinT;
	}

	public void setDayLingtMinT(String dayLingtMinT) {
		this.dayLingtMinT = dayLingtMinT;
	}

	public String getDayLingtState() {
		return dayLingtState;
	}

	public void setDayLingtState(String dayLingtState) {
		this.dayLingtState = dayLingtState;
	}

	public String getDayLingtStateVal() {
		return dayLingtStateVal;
	}

	public void setDayLingtStateVal(String dayLingtStateVal) {
		this.dayLingtStateVal = dayLingtStateVal;
	}

	public String getDayLingtRain() {
		return dayLingtRain;
	}

	public void setDayLingtRain(String dayLingtRain) {
		this.dayLingtRain = dayLingtRain;
	}

	public String getDaynightMaxT() {
		return daynightMaxT;
	}

	public void setDaynightMaxT(String daynightMaxT) {
		this.daynightMaxT = daynightMaxT;
	}

	public String getDaynightMinT() {
		return daynightMinT;
	}

	public void setDaynightMinT(String daynightMinT) {
		this.daynightMinT = daynightMinT;
	}

	public String getDaynightState() {
		return daynightState;
	}

	public void setDaynightState(String daynightState) {
		this.daynightState = daynightState;
	}

	public String getDaynightStateVal() {
		return daynightStateVal;
	}

	public void setDaynightStateVal(String daynightStateVal) {
		this.daynightStateVal = daynightStateVal;
	}

	public String getDaynightRain() {
		return daynightRain;
	}

	public void setDaynightRain(String daynightRain) {
		this.daynightRain = daynightRain;
	}
	
	
}
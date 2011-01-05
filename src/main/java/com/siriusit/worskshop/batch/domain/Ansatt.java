package com.siriusit.worskshop.batch.domain;

import java.util.Date;


/**
 * Domene klasse som representerer en ansatt
 * 
 * 
 * 
 * 
 * @author Dag Corell
 *
 */
public class Ansatt {

private String fnr;
private String firma;
private String stillingstype;
private Date datoFom;
private boolean sertA;
private boolean sertB;
private boolean sertC;
private boolean sertD;
private boolean anbefaling;


public void setFnr(String fnr) {
	this.fnr = fnr;
}

public String getFnr() {
	return fnr;
}

public void setFirma(String firma) {
	this.firma = firma;
}

public String getFirma() {
	return firma;
}

public void setStillingstype(String stillingstype) {
	this.stillingstype = stillingstype;
}

public String getStillingstype() {
	return stillingstype;
}

public void setDatoFom(Date datoFom) {
	this.datoFom = datoFom;
}

public Date getDatoFom() {
	return datoFom;
}



@Override
public String toString() {
	return "Ansatt [fnr=" + fnr + ", firma=" + firma + ", stillingstype="
			+ stillingstype + ", datoFom=" + datoFom + ", sertA=" + sertA
			+ ", sertB=" + sertB + ", sertC=" + sertC + ", sertD=" + sertD
			+ ", anbefaling=" + anbefaling + "]";
}

public void setSertB(Boolean sertB) {
	this.sertB = sertB;
}

public Boolean getSertB() {
	return sertB;
}

public void setSertA(Boolean sertA) {
	this.sertA = sertA;
}

public Boolean getSertA() {
	return sertA;
}

public void setSertC(Boolean sertC) {
	this.sertC = sertC;
}

public Boolean getSertC() {
	return sertC;
}

public void setAnbefaling(Boolean anbefaling) {
	this.anbefaling = anbefaling;
}

public Boolean getAnbefaling() {
	return anbefaling;
}

public void setSertD(Boolean sertD) {
	this.sertD = sertD;
}

public Boolean getSertD() {
	return sertD;
}	
	
}

package main.java.memoranda;

import main.java.memoranda.date.CalendarDate;
//Task 2-2 SMELL BETWEEN CLASSES
//CHANGED THE NUMBER OF PARAMETERS FROM 8 TO AN OBJECT THAT THE CLASSES HAVE ACCESS TO
//Code Smell was Primitive obsession. Instead of handling all of the individual primitives
//the file now handles one object.
//ADDED EVENTDATAPASSER.JAVA TO FIX IT
public class EventDataPasser {

	private int type;
	private CalendarDate startDate;
	private CalendarDate endDate;
	private int period;
	private int hh;
	private int mm;
	private String text;
	private boolean workDays;
	public EventDataPasser() {
		type = 0;
		startDate = null;
		endDate = null;
		period = 0;
		hh = 0;
		mm = 0;
		text = "";
		workDays = false;
	}


	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public CalendarDate getStartDate() {
		return startDate;
	}
	public void setStartDate(CalendarDate startDate) {
		this.startDate = startDate;
	}
	public CalendarDate getEndDate() {
		return endDate;
	}
	public void setEndDate(CalendarDate endDate) {
		this.endDate = endDate;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getHh() {
		return hh;
	}
	public void setHh(int hh) {
		this.hh = hh;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isWorkDays() {
		return workDays;
	}
	public void setWorkDays(boolean workDays) {
		this.workDays = workDays;
	}
}

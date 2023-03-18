package com.todo.test;

import java.util.Date;

public class TodoVO {

	private Date date;
	private String day;
	private String todo;
	private int test;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public int getTest() {
		return test;
	}
	public void setTest(int test) {
		this.test = test;
	}
	
	@Override
	public String toString() {
		return "TodoVO [date=" + date + ", day=" + day + ", todo=" + todo + ", test=" + test + "]";
	}	
	
}

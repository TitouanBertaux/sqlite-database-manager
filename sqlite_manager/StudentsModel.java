import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class StudentsModel {

	private SimpleStringProperty s1;
	private SimpleStringProperty s2;
	private SimpleStringProperty s3;
	private SimpleStringProperty s4;
	private SimpleStringProperty s5;
	private SimpleStringProperty s6;
	private SimpleStringProperty s7;
	private SimpleStringProperty s8;
	private SimpleStringProperty s9;

	public static String[] tab = {"s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9"};
	
	public StudentsModel() {
	}

	public StudentsModel(String s1) {
		this.s1 =  new SimpleStringProperty(s1);
	}

	public StudentsModel(String s1, String s2) {
		this.s1 =  new SimpleStringProperty(s1);
		this.s2 =  new SimpleStringProperty(s2);
	}

	public StudentsModel(String s1, String s2, String s3) {
		this.s1 =  new SimpleStringProperty(s1);
		this.s2 =  new SimpleStringProperty(s2);
		this.s3 =  new SimpleStringProperty(s3);
	}

	public StudentsModel(String s1, String s2, String s3, String s4) {
		this.s1 =  new SimpleStringProperty(s1);
		this.s2 =  new SimpleStringProperty(s2);
		this.s3 =  new SimpleStringProperty(s3);
		this.s4 =  new SimpleStringProperty(s4);
	}

	public StudentsModel(String s1, String s2, String s3,
			String s4, String s5) {
		this.s1 =  new SimpleStringProperty(s1);
		this.s2 =  new SimpleStringProperty(s2);
		this.s3 =  new SimpleStringProperty(s3);
		this.s4 =  new SimpleStringProperty(s4);
		this.s5 =  new SimpleStringProperty(s5);
	}

	public StudentsModel(String s1, String s2, String s3,
			String s4, String s5, String s6) {
		this.s1 =  new SimpleStringProperty(s1);
		this.s2 =  new SimpleStringProperty(s2);
		this.s3 =  new SimpleStringProperty(s3);
		this.s4 =  new SimpleStringProperty(s4);
		this.s5 =  new SimpleStringProperty(s5);
		this.s6 =  new SimpleStringProperty(s6);
	}

	public StudentsModel(String s1, String s2, String s3,
			String s4, String s5, String s6, String s7) {
		this.s1 =  new SimpleStringProperty(s1);
		this.s2 =  new SimpleStringProperty(s2);
		this.s3 =  new SimpleStringProperty(s3);
		this.s4 =  new SimpleStringProperty(s4);
		this.s5 =  new SimpleStringProperty(s5);
		this.s6 =  new SimpleStringProperty(s6);
		this.s7 =  new SimpleStringProperty(s7);
	}

	public StudentsModel(String s1, String s2, String s3,
			String s4, String s5, String s6, String s7,
			String s8) {
		this.s1 =  new SimpleStringProperty(s1);
		this.s2 =  new SimpleStringProperty(s2);
		this.s3 =  new SimpleStringProperty(s3);
		this.s4 =  new SimpleStringProperty(s4);
		this.s5 =  new SimpleStringProperty(s5);
		this.s6 =  new SimpleStringProperty(s6);
		this.s7 =  new SimpleStringProperty(s7);
		this.s8 =  new SimpleStringProperty(s8);
	}

	public StudentsModel(String s1, String s2, String s3,
			String s4, String s5, String s6, String s7,
			String s8, String s9) {
		this.s1 =  new SimpleStringProperty(s1);
		this.s2 =  new SimpleStringProperty(s2);
		this.s3 =  new SimpleStringProperty(s3);
		this.s4 =  new SimpleStringProperty(s4);
		this.s5 =  new SimpleStringProperty(s5);
		this.s6 =  new SimpleStringProperty(s6);
		this.s7 =  new SimpleStringProperty(s7);
		this.s8 =  new SimpleStringProperty(s8);
		this.s9 =  new SimpleStringProperty(s9);
	}

	public String getS1() {
		return s1.get();
	}

	public void setS1(String s1) {
		this.s1 = new SimpleStringProperty(s1);
	}

	public String getS2() {
		return s2.get();
	}

	public void setS2(String s2) {
		this.s2 =  new SimpleStringProperty(s2);
	}

	public String getS3() {
		return s3.get();
	}

	public void setS3(String s3) {
		this.s3 =  new SimpleStringProperty(s3);
	}

	public String getS4() {
		return s4.get();
	}

	public void setS4(String s4) {
		this.s4 =  new SimpleStringProperty(s4);
	}

	public String getS5() {
		return s5.get();
	}

	public void setS5(String s5) {
		this.s5 =  new SimpleStringProperty(s5);
	}

	public String getS6() {
		return s6.get();
	}

	public void setS6(String s6) {
		this.s6 =  new SimpleStringProperty(s6);
	}

	public String getS7() {
		return s7.get();
	}

	public void setS7(String s7) {
		this.s7 =  new SimpleStringProperty(s7);
	}

	public String getS8() {
		return s8.get();
	}

	public void setS8(String s8) {
		this.s8 =  new SimpleStringProperty(s8);
	}

	public String getS9() {
		return s9.get();
	}

	public void setS9(String s9) {
		this.s9 =  new SimpleStringProperty(s9);
	}


	
}
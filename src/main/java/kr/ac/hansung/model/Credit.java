package kr.ac.hansung.model;

public class Credit {
	private int year;
	private int semester;
	private String classcode;
	private String classname;
	private String classtype;
	private int credits;
	
	public Credit(){}
	
	public Credit(int year, int semester, String classname, String classtype, int credits) {
		super();
		this.year = year;
		this.semester = semester;
		this.classname = classname;
		this.classtype = classtype;
		this.credits = credits;
	}
	
	public Credit(int year, int semester, String classcode, String classname, String classtype, int credits) {
		super();
		this.year = year;
		this.semester = semester;
		this.classcode = classcode;
		this.classname = classname;
		this.classtype = classtype;
		this.credits = credits;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getClasscode() {
		return classcode;
	}

	public void setClasscode(String classcode) {
		this.classcode = classcode;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getClasstype() {
		return classtype;
	}

	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Credit [year=" + year + ", semester=" + semester + ", classcode=" + classcode + ", classname="
				+ classname + ", classtype=" + classtype + ", credits=" + credits + "]";
	}
	
	
	
	
	
}

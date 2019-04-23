package MicroService.MicroServiceBackend.Model;

public class Student 
{

	private int sid;
	private String sname;
	private int age;
	private String college;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}

	/*
	 * public Student(int sid, String sname, int age, String college) { this.sid =
	 * sid; this.sname = sname; this.age = age; this.college = college; }
	 */
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", college=" + college + "]";
	}
	
	
}

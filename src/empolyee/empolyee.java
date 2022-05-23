package empolyee;

public class empolyee {
	@Override
	public String toString() {
		return "empolyee [empid=" + empid + ", empolyeename=" + empolyeename + ", empolyeedesignation="
				+ empolyeedesignation + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	int empid;
	String empolyeename;
	String empolyeedesignation;
	public empolyee(int empid, String empolyeename, String empolyeedesignation) {
		super();
		this.empid = empid;
		this.empolyeename = empolyeename;
		this.empolyeedesignation = empolyeedesignation;
	}
	


}

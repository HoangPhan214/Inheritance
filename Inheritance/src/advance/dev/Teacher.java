package advance.dev;

public class Teacher extends Person {
	String mgv;
	double salaryCoefficient;
	
	public Teacher(String name, int age, String sdt, String mgv, double salaryCoefficient) {
		super(name, age, sdt);
		this.mgv = mgv;
		this.salaryCoefficient = salaryCoefficient;
	}

	public double tinhLuong() {
        return 1500000 * salaryCoefficient;
    }
}

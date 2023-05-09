package advance.dev;

public class Student extends Person {
	double diemToan;
	double diemLy;
	double diemHoa;
	String mvs;
	String lop;
	
	public Student(String name, int age, String sdt, double diemToan, double diemLy, double diemHoa, String mvs,
			String lop) {
		super(name, age, sdt);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.mvs = mvs;
		this.lop = lop;
	}

	public double diemTrungBinh() {
	    return (diemToan + diemLy + diemHoa) / 3;
	}
}
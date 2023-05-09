package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] pson = new Person[10];
		input(pson);
		print(pson);
		Teacher tc = findTeacher(pson);
		System.out.println("Giao vien co luong cao nhat: " + tc.name);
	}
	
	private static Teacher findTeacher(Person[] pson) {
		// TODO Auto-generated method stub
		return null;
		}
	public static void input(Person[] pson) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < pson.length; i++) {
			System.out.println("Nhap thong tin cho nguoi thu: " + (i + 1));
			System.out.print("Ten: ");
			String name = sc.next();
			
			System.out.println("Tuoi: ");
			int age = sc.nextInt();
			
			System.out.println("So dien thoai: ");
			String sdt = sc.next();
			
			if (i < 4) {
				System.out.print("Ma giao vien: ");
                String mgv = sc.nextLine();

                System.out.print("He so luong: ");
                double salaryCoefficient = sc.nextDouble();
                sc.nextLine();

                pson[i] = new Teacher(name, age, sdt, mgv, salaryCoefficient);
			} else {
				System.out.print("Diem toan: ");
                double diemToan = sc.nextDouble();
                sc.nextLine();

                System.out.print("Diem ly: ");
                double diemLy = sc.nextDouble();
                sc.nextLine();

                System.out.print("Diem hoa: ");
                double diemHoa = sc.nextDouble();
                sc.nextLine();

                System.out.print("Ma sinh vien: ");
                String msv = sc.nextLine();

                System.out.print("Lop: ");
                String lop = sc.nextLine();
                
                pson[i] = new Student(name, age, sdt, diemToan, diemLy, diemHoa, msv, lop);
			}
		}
		
		sc.close();
	}
	public static void print(Person[] pson) {
		System.out.println("Danh sach cac giao vien");
	}
}
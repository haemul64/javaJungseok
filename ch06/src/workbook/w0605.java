package workbook;

public class w0605 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);

		System.out.println(s.info());
	}
}

class Student {
	Student() {
	}

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {
		return kor + eng + math;
	}

	double getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
	}

	String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + this.getTotal() + ","
				+ this.getAverage();
	}
}
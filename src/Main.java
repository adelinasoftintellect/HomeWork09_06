import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
	private String firstname;
	private String lasttname;
	private int number;
	private Map<String, List<Float>> subject = new HashMap<String, List<Float>>();

	public Student(String firstname, String lasttname, int number) {
		super();
		this.firstname = firstname;
		this.lasttname = lasttname;
		this.number = number;
		this.subject = new HashMap<String, List<Float>>();
	}

	public Student() {
		this("", "", 0);
	}

	public void addMark(String sub, float mark) {
		if (subject.containsKey(sub) == false) {
			subject.put(sub, new ArrayList<Float>());
		}
		List<Float> marks = subject.get(sub);
		marks.add(mark);

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLasttname() {
		return lasttname;
	}

	public void setLasttname(String lasttname) {
		this.lasttname = lasttname;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void addSubjectMark() {
		Map<String, Float> subject = new HashMap<String, Float>();
		subject.put("Math", (float) 5.5);
		subject.put("Chemistry", (float) 4.5);
		subject.put("Physics", (float) 5.0);
		System.out.println(subject);
		System.out.println(subject);
	}

	public float calculateAvarageMark(String sub) {
		if (subject.containsKey(sub) == false) {
			throw new RuntimeException("No marks for average");
		}
		List<Float> marks = subject.get(sub);
		if (marks.size() == 0) {
			throw new RuntimeException("No marks for average");
		}
		float sum = 0;
		for (Float mark : marks) {
			sum += mark;
		}
		return sum / marks.size();

	}
}

public class Main {

	public static void main(String[] args) {
		Student martin = new Student("Martin", "Ivanov", 10);
		martin.addMark("Literature", 3.0f);
		martin.addMark("Literature", 2.0f);
		martin.addMark("Literature", 5.0f);
		martin.addMark("Math", 5.0f);
		martin.addMark("Math", 6.0f);
		martin.addMark("Math", 5.5f);
		System.out.println(martin.calculateAvarageMark("Literature"));
		System.out.println(martin.calculateAvarageMark("Math"));
		Student hristo = new Student("Hristo", "Petrov", 11);
		hristo.addMark("Literature", 3.0f);
		hristo.addMark("Literature", 3.0f);
		hristo.addMark("Literature", 5.0f);
		hristo.addMark("Math", 5.0f);
		hristo.addMark("Math", 4.0f);
		hristo.addMark("Math", 5.5f);
		System.out.println(hristo.calculateAvarageMark("Literature"));
		System.out.println(hristo.calculateAvarageMark("Math"));
		Student teodora = new Student("Teodorа", "Grigorovа", 12);
		teodora.addMark("Literature", 6.0f);
		teodora.addMark("Literature", 4.5f);
		teodora.addMark("Literature", 5.0f);
		teodora.addMark("Math", 4.0f);
		teodora.addMark("Math", 3.0f);
		teodora.addMark("Math", 5.5f);
		System.out.println(teodora.calculateAvarageMark("Literature"));
		System.out.println(teodora.calculateAvarageMark("Math"));

	}
}

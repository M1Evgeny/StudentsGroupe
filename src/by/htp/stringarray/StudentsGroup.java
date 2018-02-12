package by.htp.stringarray;

public class StudentsGroup {
	private String[] students;
	private int studentsCount;

	public int getStudentsCount() {
		return studentsCount;
	}

	public void addStudent(String student) {
		if (students != null) {
			if (studentsCount < students.length) {
				addOneStudent(student);
			} else {
				makeNewArray();
				addOneStudent(student);
			}
		} else {
			students = new String[10];
			addOneStudent(student);

		}
	}

	private void addOneStudent(String student) {
		students[studentsCount] = student;
		studentsCount++;
	}

	private void makeNewArray() {
		String[] students = new String[studentsCount + 10];
		for (int i = 0; i < this.students.length; i++) {
			students[i] = this.students[i];
		}
		this.students = students;
	}

	public String[] getStudents() {
		return students;
	}

	public void showStudentsInfo() {
		System.out.println("There are " + studentsCount
				+ " students int the gpoupe.");
		if (students != null) {
			for (String s : students) {
				if (s != null) {
					System.out.println(s);
				}
			}
		}

	}
}

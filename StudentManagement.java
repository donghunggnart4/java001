public class StudentManagement {

    Student[] students = new Student[100];

    public int totalSt = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }

    public void addStudent(Student newStudent) {
        students[totalSt] = newStudent;
        totalSt++;
    }

    public String studentsByGroup() {
        String stByGr = "";
        for(int i = 0; i < totalSt; i++){
            if(!students[i].mark){
                stByGr = stByGr.concat(students[i].getGroup());
                stByGr = stByGr.concat("\n");
                for (int j = 0; j < totalSt; j++){
                    if (sameGroup(students[i],students[j])) {
                        stByGr = stByGr.concat(students[j].getInfor());
                        stByGr = stByGr.concat("\n");
                        students[j].mark = true;
                    }
                }
            }
        }
        return stByGr;
    }

    public void removeStudent(String id) {
        for(int i = 0; i < totalSt; i++) {
            if(students[i].getId().equals(id)) {
                for (int j = i; j < totalSt-1; j++) {
                    students[j] = students[j+1];
                }
                totalSt --;
            }
        }
    }

    public static void main(String[] args) {

        Student s, s2, s3 , s4, s5, s6;

        s = new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn");

        s2 = new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn");
        s3 = new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn");
        s4 = new Student("Nguyen Van An", "17020001", "K62CB", "17020001@vnu.edu.vn");
        s5 = new Student("Nguyen Van An", "17020001", "K62CB", "17020001@vnu.edu.vn");
        s6 = new Student("Nguyen Van An", "17020001", "K62CB", "17020001@vnu.edu.vn");


        StudentManagement school1 = new StudentManagement();

        school1.addStudent(s);
        school1.addStudent(s2);
        school1.addStudent(s3);
        school1.addStudent(s4);
        school1.addStudent(s5);
        school1.addStudent(s6);

        System.out.println(school1.studentsByGroup());

    }
}

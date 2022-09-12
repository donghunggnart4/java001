public class Student {
    public Student() {
        name = "Student";
        id = "000";
        group = "K66CB";
        email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K66CB";
    }

    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.group;
    }

    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    private String name, id, group, email;

    public boolean mark = false;

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String i) {
        this.id = i;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String g) {
        this.group = g;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public String getInfor() {
        String s;
        s = name + " - " + id + " - " + group + " - " + email;
        return s;
    }
}

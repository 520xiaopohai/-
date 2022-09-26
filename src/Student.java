public class Student {
    private String name;
    public Student(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Student another = (Student)obj;
        return this.name.equals(another.name);

    }
} 
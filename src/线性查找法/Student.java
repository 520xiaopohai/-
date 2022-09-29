package 线性查找法;
public class Student implements Comparable<Student> {
    private String name;
    private int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(this == obj) 
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass()) 
            return false;
        Student another = (Student)obj;
        return this.name.equals(another.name);

    }

    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
        // if (this.score < o.score) {
        //     return -1;
        // }
        // else if (this.score == o.score) {
        //     return 0;
        // } else {
        //     return 1;
        // }
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score:%d)format", this.name,this.score);
    }
} 
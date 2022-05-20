package books;

//Comparable接口示例
class Student implements Comparable<Student> {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name); //以姓名进行排序
    }
}



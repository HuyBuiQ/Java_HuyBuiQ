package OOP;
import lombok.Data

public class Student {
    private String id;
    private String address;
    private String name;


    public Student(String name){
        this.name = name;
    }
    public Student(String id, String name){
        this.id = id;
        this.name = name;

    }
    public Student(String id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;

    }

    @Override
    public String toString() {
        return(id + "\n" + name + "\n" + address);
    }

    public String getId(){
        return id;
    }

    public static void main(String[] args) {
//        Student hoc_sinh_1 = new Student("123","Pau");
//        System.out.println(hoc_sinh_1.toString());
//        Student hoc_sinh_2 = new Student("Black");
//        System.out.println(hoc_sinh_2.getId());
        Student[] students_array = new Student[];
        for (i=0;i<students_array.length;i++){
            students_array[i] = new Student();
        }

    }
}

package OOP;

public class constructors {

        String name;
        int age;
        double weight;

        constructors(String name, int age, double weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public void add(){
            this.age++;
            System.out.println(this.age);
        }

    public static void main(String[] args) {


        constructors nihao = new constructors("Huy",16,60);
        System.out.println(nihao.age);
        constructors nihao2 = new constructors("Huyen",17,55);
        System.out.println(nihao2.name);
        constructors nihao3 = nihao2;
        nihao3.name = "Kamasetz";
        System.out.println(nihao2.name);
        nihao2.add();

    }



}

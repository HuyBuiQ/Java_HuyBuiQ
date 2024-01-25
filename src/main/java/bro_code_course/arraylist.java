package bro_code_course;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.set(0,"sushi");
        food.remove(1);

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }



    ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("donuts");
        System.out.println(bakeryList.get(0));



        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        groceryList.add(bakeryList);
        groceryList.add(food);
        System.out.println(groceryList.getLast().getLast());
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    Human h = new Human(22, "Marsel");
        Human q = new Human(19, "Amir");

        Human.nation = "Russian";

        System.out.println(h.getStaticNation());
        System.out.println(q.getStaticNation());
    }
}

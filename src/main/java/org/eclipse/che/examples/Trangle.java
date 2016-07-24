package org.eclipse.che.examples;

public class Trangle {
    private int sides;
    private String name;
    public Trangle(){
        this.sides = 3;
        this.name = "helasad ";
    }
    public Trangle(int sides, String name){
        this.sides = sides;
        this. name = name;
    }
    public void output(){
        System.out.println(sides+"side---------"+name);
    }
}

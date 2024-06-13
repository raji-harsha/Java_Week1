package org.example;

public class JavaWeek1 {
    public static void main(String[] args) {

        //Widening-narrowing
        int i=123456789;
        //widening
        float f=i;
        System.out.println("float:"+f);

        //narrowing
        i=(int)f;
        System.out.println("int:"+i);//123456792



        //wrapper class
        Integer i1=i;//autoboxing
        System.out.println("wrapper Integer:"+i1);
        i+=i1;//unboxing
        System.out.println("int:"+i);



    }
}

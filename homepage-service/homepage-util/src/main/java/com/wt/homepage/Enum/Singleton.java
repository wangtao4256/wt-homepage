package com.wt.homepage.Enum;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import sun.applet.Main;

import java.io.*;


public enum Singleton implements Serializable {
    INSTANSE("111", 123);
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private Integer age;

    private Singleton(String name, Integer age) {
        this.age = age;

    }

    public Singleton getInstanse() {
        return INSTANSE;
    }

    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.INSTANSE;
        ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("single.obj"));
        obs.writeObject(singleton);
        obs.flush();
        obs.close();

        ObjectInputStream ibs = new ObjectInputStream(new FileInputStream("single.obj"));
        Singleton singleton1 = (Singleton) ibs.readObject();
        ibs.close();
        System.out.println(singleton == singleton1);
    }
}

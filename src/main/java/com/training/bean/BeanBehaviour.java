package com.training.bean;

public class BeanBehaviour {

    public void instanceBean() {
        Bean<String> g1 = new Bean<>("hello");
        System.out.println(g1.getData());

        Bean<Integer> g2 = new Bean<>(25);
        System.out.println(g2.getData());
    }

    public void beanMethod() {
        Bean<String> g1 = new Bean<>();
        System.out.println(g1.type(20));
        System.out.println(g1.type("hello"));
    }
}

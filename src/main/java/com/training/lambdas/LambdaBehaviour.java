package com.training.lambdas;

import com.training.lambdas.interfaces.Example1;
import com.training.lambdas.interfaces.Example2;
import com.training.lambdas.interfaces.Example3;
import com.training.lambdas.interfaces.Example4;

public class LambdaBehaviour {

    public void lambdaFunctionalInterfacesBehaviour() {
        Example1 lambdaEx1 = String::length;
        Example2 lambdaEx2 = Integer::sum;
        Example3 lambdaEx3 = () -> System.out.println("hello");
        Example4 lambdaEx4 = s -> s + "by";
    }
}

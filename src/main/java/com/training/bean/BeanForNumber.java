package com.training.bean;

public class BeanForNumber<T extends Number> {

    private T data;

    public BeanForNumber(final T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(final T data) {
        this.data = data;
    }
}

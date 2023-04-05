package com.training.bean;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Bean<T> {

    private T data;

    public Bean(final T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public void print(final Bean<?> bean) {
        System.out.println(bean.getData());
    }

    public void printJustNumber(final Bean<? extends Number> bean) {
        System.out.println(bean.getData());
    }

    public <T> String type(final T data) {
        return data.getClass().getName();
    }
}

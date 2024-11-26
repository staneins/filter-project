package com.kaminsky;

public class Service implements Filter {
    @Override
    public Object apply(Object o) {
        return o;
    }

    public <T> T[] filter(T[] arr, Filter filter) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }

        T[] resultArr = arr.clone();
        for (T elem : resultArr) {
            elem = (T) filter.apply(elem);
        }
        return resultArr;
    }
}

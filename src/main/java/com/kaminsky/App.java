package com.kaminsky;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        Service service = new Service();
        Filter filter = new Filter() {
            @Override
            public Object apply(Object o) {
                return o;
            }
        };

        String[] test = {"one", "two", "three"};

        String[] newTest = service.filter(test, filter);

        Arrays.stream(newTest)
                .forEach(System.out::println);
    }


}

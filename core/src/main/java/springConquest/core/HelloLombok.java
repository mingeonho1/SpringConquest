package springConquest.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("dddd");

        String name1 = helloLombok.getName();
        System.out.println("name1 = " + name1);
    }
}

package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] main) {
        HelloLombok helloLombok = new HelloLombok();

        helloLombok.setName("sujeong");

        String name = helloLombok.getName();
        System.out.println("name = " + name);
        System.out.println("helloLombok = " + helloLombok);
    }
}

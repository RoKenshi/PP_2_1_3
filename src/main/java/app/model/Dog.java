package app.model;

import org.springframework.stereotype.Component;

import java.awt.*;
@Component
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Dog";
    }
}

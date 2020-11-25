package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Dog extends Animal {
    private final String name;

    void bark(@NonNull Integer volume) {
        System.out.println("Bark at volume: " + volume);
    }
}

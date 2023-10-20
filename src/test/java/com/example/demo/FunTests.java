package com.example.demo;


import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

// import for assertEquals
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

public class FunTests {

@Test
    void test0() {
        assertEquals(0,0);
        List<Event> lst = List.of(
            new Event(LocalDate.of(2020, 1, 1), 100.0),
            new Event(LocalDate.of(2020, 2, 1), 200.0),
            new Event(LocalDate.of(2020, 3, 1), 300.0)
        );
        System.out.println(lst);
    }


    @Test
    void test1() {
        assertEquals(1,1);
    }


}

@Data
@ToString
@AllArgsConstructor
class Event {
    LocalDate when;
    Double cost;
}
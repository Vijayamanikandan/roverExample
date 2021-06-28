package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(BlockJUnit4ClassRunner.class)
public class RoverUserTest {

    /**
     * Make this unit test pass by updating the move() method.
     */
    @Test
    public void roverTest() {
        // Given
        Rover rover = new Rover(3);

        // When
        int location = rover.move("DOWN", "RIGHT");

        // Then
        assertThat(location).isEqualTo(4);
    }
}

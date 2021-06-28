package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(BlockJUnit4ClassRunner.class)
public class RoverSolutionTest {

    // DO NOT UN-FOLD. In order to run these tests,
    // click on the run icon next to the class
    // definition and click "Run RoverSolutionTest".

    /// <editor-fold "Solution Tests">

    /// <editor-fold "No cheating">

    private static final String LEFT = "LEFT";
    private static final String RIGHT = "RIGHT";
    private static final String UP = "UP";
    private static final String DOWN = "DOWN";

    private Rover rover;

    @Before
    public void setup() {
        this.rover = new Rover(4);
    }

    @Test // shouldNotFallOffLeftEdge
    public void test01() {

        int result = this.rover.move(LEFT, LEFT, LEFT, LEFT);
        assertThat(result).isZero();
    }

    @Test // shouldNotFallOffRightEdge
    public void test02() {
        int result = this.rover.move(RIGHT, RIGHT, RIGHT, RIGHT);
        assertThat(result).isEqualTo(3);
    }

    @Test // shouldNotFallOffLowerEdge
    public void test03() {
        int result = this.rover.move(DOWN, DOWN, DOWN, DOWN);
        assertThat(result).isEqualTo(12);
    }

    @Test // shouldNotFallOffUpperEdge
    public void test04() {
        int result = this.rover.move(UP, UP, UP, UP);
        assertThat(result).isZero();
    }

    @Test // shouldGoRight
    public void test05() {
        int result = this.rover.move(RIGHT, RIGHT);
        assertThat(result).isEqualTo(2);
    }

    @Test // shouldGoLeft
    public void test06() {
        int result = this.rover.move(RIGHT, RIGHT, LEFT);
        assertThat(result).isOne();
    }

    @Test // shouldGoUp
    public void test07() {
        int result = this.rover.move(DOWN, DOWN, UP);
        assertThat(result).isEqualTo(4);
    }

    @Test // shouldGoDown
    public void test08() {
        int result = this.rover.move(DOWN, DOWN);
        assertThat(result).isEqualTo(8);
    }

    @Test // shouldAllowSpiral
    public void test09() {
        int result = this.rover.move(RIGHT, RIGHT, DOWN, DOWN, LEFT, LEFT, UP, RIGHT, DOWN, DOWN, RIGHT);
        assertThat(result).isEqualTo(14);
    }

    @Test // shouldAllowSmallMatrix
    public void test10() {
        Rover r = new Rover(2);
        int result = r.move(RIGHT, DOWN);
        assertThat(result).isEqualTo(3);
    }

    @Test // shouldAllowLargeMatrix
    public void test11() {
        int result = new Rover(10).move(RIGHT, DOWN, DOWN, RIGHT, RIGHT, RIGHT, RIGHT, DOWN, LEFT, UP);
        assertThat(result).isEqualTo(24);
    }

    @Test // shouldNotFallOffLargeMatrix
    public void test12() {
        int result =  new Rover(10).move(RIGHT, DOWN, DOWN, RIGHT,
                RIGHT, RIGHT, RIGHT, DOWN,
                LEFT, UP, UP, UP,
                UP, UP, RIGHT, RIGHT,
                RIGHT, DOWN, DOWN, DOWN,
                DOWN, DOWN, DOWN, DOWN,
                RIGHT, RIGHT, RIGHT, RIGHT,
                LEFT, DOWN, DOWN, DOWN,
                RIGHT, RIGHT, LEFT, UP,
                UP, LEFT, LEFT, LEFT,
                LEFT, LEFT, LEFT, LEFT,
                LEFT, LEFT, LEFT, UP,
                RIGHT, UP, RIGHT, UP);
        assertThat(result).isEqualTo(42);
    }

    @Test // shouldIgnoreInvalidCommand
    public void test13() {
        int result = new Rover(3).move(RIGHT, RIGHT, DOWN, "LEFT UP", LEFT, "INVALID");
        assertThat(result).isEqualTo(4);
    }

    /// </editor-fold>

    /// </editor-fold>

}

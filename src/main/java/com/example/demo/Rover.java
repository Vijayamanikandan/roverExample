package com.example.demo;

/**
 * Rover class
 */
public class Rover {
    /**
     * Matrix size
     */
    private final int matrixSize;

    /**
     * Rover class constructor
     * <p>Initializes a new Rover object with a square matrix of size "matrixSize"
     * that represents the number of rows and columns where the rover is allowed
     * to move. A rover always starts at position 0,0.
     *
     * <p>For example, {@code new Rover(3)} would have a matrix like so:
     * <pre><code>
     * [[ 0 1 2 ]
     *  [ 3 4 5 ]
     *  [ 6 7 8 ]]
     * </code></pre>
     * @param matrixSize The number of rows and columns in the matrix.
     */
    public Rover(int matrixSize) {
        this.matrixSize = matrixSize;
    }

    /**
     * DIRECTIONS - UNFOLD
     * <p>Moves the rover using a given list of command Strings. If a command
     * is either not recognized or would cause the rover to move outside of
     * the allowed matrix, then the command should be ignored.
     *
     * <p>The following commands are currently recognized:
     * <br/>{@code LEFT}: Move the rover to the left by one space.
     * <br/>{@code RIGHT}: Move the rover to the right by one space.
     * <br/>{@code UP}: Move the rover up by one space.
     * <br/>{@code DOWN}: Move the rover down by one space.
     *
     * <p>Cells are identified by an integer starting from 0 in the top left
     * corner, and increase from left to right before moving down.
     * I.e. (row * matrixSize) + column
     *
     * @param commands The list of commands sent to the rover.
     * @return The current cell location within the matrix.
     */
    public int move(String... commands) {
        // Update this method to make the roverTest() test pass.

        return -1;
    }

}



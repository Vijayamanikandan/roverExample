# Rover Movement

In this challenge, update the `Rover` class and implement the 
`int move(List<String> commands)` method. The rover is initialized with a `matrixSize` 
that indicates the size of a square matrix where the rover is able to move. For 
example, if a rover is initialized with a size of 3, then the rover is able to move 
anywhere within a 3 by 3 matrix.

The rover always start at position `[0][0]` each time the `Rover:move` method is 
called and returns the location derived by the formula `(row * matrixSize) + col` where `row` 
is the current row and `col` is the current column of the rover.

The `List<String>` argument represents a series of commands sent to the rover instructing 
it which direction to move. The allowed directions are listed below:

* `LEFT`: Move the rover to the left by one space.
* `RIGHT`: Move the rover to the right by one space.
* `UP`: Move the rover up by one space.
* `DOWN`: Move the rover down by one space.

For example, if the a rover with a `matrixSize` of 3 was instructed to move "DOWN" and 
then "RIGHT", the move method would return 4.

```
    START            DOWN            RIGHT          
  [0] 1  2          0  1  2         0  1  2         
   3  4  5         [3] 4  5         3 [4] 5         
   6  7  8          6  7  8         6  7  8         
```

If a command is not recognized or the command would cause the rover to go out of bounds, 
then the command is ignored.

```java
Rover rover = new Rover(3);
int location = rover.move("DOWN", "RIGHT");
assertThat(location).isEqualTo(4);
```

Implement the `Rover::move` method so that it passes all tests within the 
`RoverSolutionTest` class without looking at the tests. Should you want to write 
your own tests, you can put those in the `RoverUserTest` class.

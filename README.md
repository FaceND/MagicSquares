# MagicSquares

A Java class for generating random 2D arrays representing magic squares and checking their row sums.

## Table of Contents

- [Description](#description)
- [Methods](#methods)
- [Usage](#usage)
- [Example](#example)
- [Contributing](#contributing)
- [License](#license)

## Description

The `MagicSquares` class provides methods for generating random magic squares, calculating row sums, and checking if the square is a magic square.

## Methods

### `generateSquares(int[][] x)`

- Generates a random magic square.

> This method populates the given 2D array with random values and continues until the square forms a magic square (where the sums of all rows are equal).

### `calculateRowSums(int[][] x)`

- Calculates the sums of each row in the magic square.

> This method returns an array containing the sum of each row in the magic square.

### `checkSum(int[] x)`

- Checks if all row sums are equal.

> This method verifies if all row sums in the magic square are equal, indicating a valid magic square.

### `printMagicSquare(int[][] x)`

- Prints the magic square and its row sums.

> This method prints the magic square and the sums of its rows for visualization.

## Usage

1. Instantiate the `MagicSquares` class.
2. Use the `generateSquares` method to generate a magic square.
3. Optionally, use other methods to inspect the generated magic square.

## Example

```java
public class Main {
    public static void main(String[] args) {
        MagicSquares magicSquares = new MagicSquares();
        int[][] arraysSquare = new int[3][3]; // Adjust the size as needed

        magicSquares.generateSquares(arraysSquare);
        magicSquares.printMagicSquare(arraysSquare);
    }
}
```
## Contributing

Contributions are welcome! If you have any suggestions, bug reports, or feature requests, 
please open an issue or create a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

public class Main {
    public static void main(String[] args) {
        MagicSquares magicSquares = new MagicSquares();
        int[][] arraysSquare = new int[3][3]; // Adjust the size as needed
        magicSquares.generateSquares(arraysSquare);
        magicSquares.printMagicSquare(arraysSquare);
    }
}
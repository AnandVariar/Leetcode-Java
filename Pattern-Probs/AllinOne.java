import java.util.Scanner;

public class AllinOne {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nPattern Printing");
            System.out.println("1: Solid Rectangle");
            System.out.println("2: Hollow Rectangle");
            System.out.println("3: Exit");
            System.out.println("4:Half Pyramid");
            System.out.println("5:Inverted Half Pyramid");
            System.out.println("6: Inverted Pyramid(by 180deg)");
            System.out.println("7: Half Pyramid with Nums");
            System.out.println("8: Inverted Half Pyramid with Nums");
            System.out.println("9:Floyd's Triangle");
            System.out.println("10: 0-1 Triangle");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    solidRec(rows, cols);
                    break;
                case 2:
                    hollowRec(rows, cols);
                    break;
                case 3:
                    System.exit(0);
                    break;
                case 4:
                    halfPy(rows);
                    break;
                case 5:
                    inversePy(rows);
                    break;
                case 6:
                    invertedPy(rows);
                    break;
                case 7:
                    halfPyNums(rows);
                    break;
                case 8:
                    inversePyNums(rows);
                    break;
                case 9:
                    floydTri(rows);
                    break;
                case 10:
                    zeroOneTri(rows);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            sc.close();
        }
    }

    public static void solidRec(int rows, int cols) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRec(int rows, int cols) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if (row == 1 || col == 1 || row == rows || col == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPy(int rows) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inversePy(int rows) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= rows - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedPy(int rows) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= rows - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyNums(int rows) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void inversePyNums(int rows) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= rows - row + 1; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void floydTri(int rows) {
        int number = 1;
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTri(int rows) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= row; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

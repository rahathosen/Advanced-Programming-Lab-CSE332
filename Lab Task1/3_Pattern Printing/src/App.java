import java.util.Scanner;

public class App {

    static int height = 5;
    static int width = (2 * height) - 1;

    static int abs(int d) {
        return d < 0 ? -1 * d : d;
    }

    static void printA() {
        int n = width / 2, i, j;
        for (i = 0; i < height; i++) {
            for (j = 0; j <= width; j++) {
                if (j == n || j == (width - n) || (i == height / 2 && j > n && j < (width - n)))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            n--;
        }
    }

    static void printB() {
        int i, j, half = (height / 2);
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < width; j++) {
                if ((i == 0 || i == height - 1 || i == half) && j < (width - 2))
                    System.out.printf("*");
                else if (j == (width - 2) && !(i == 0 || i == height - 1 || i == half))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    static void printC() {
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < (height - 1); j++) {
                if (i == 0 || i == height - 1)
                    System.out.printf("*");
                else
                    continue;
            }
            System.out.printf("\n");
        }
    }

    static void printD() {
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < height; j++) {
                if ((i == 0 || i == height - 1) && j < height - 1)
                    System.out.printf("*");
                else if (j == height - 1 && i != 0 && i != height - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    static void printE() {
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < height; j++) {
                if ((i == 0 || i == height - 1) || (i == height / 2 && j <= height / 2))
                    System.out.printf("*");
                else
                    continue;
            }
            System.out.printf("\n");
        }
    }

    static void printF() {
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < height; j++) {
                if ((i == 0) || (i == height / 2 && j <= height / 2))
                    System.out.printf("*");
                else
                    continue;
            }
            System.out.printf("\n");
        }
    }

    static void printG() {
        int i, j;
        width--;
        for (i = 0; i < height; i++) {
            for (j = 0; j < width; j++) {
                if ((i == 0 || i == height - 1) && (j == 0 || j == width - 1))
                    System.out.printf(" ");
                else if (j == 0)
                    System.out.printf("*");
                else if (i == 0 && j <= height)
                    System.out.printf("*");
                else if (i == height / 2 && j > height / 2)
                    System.out.printf("*");
                else if (i > height / 2 && j == width - 1)
                    System.out.printf("*");
                else if (i == height - 1 && j < width)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    static void printH() {
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < height; j++) {
                if ((j == height - 1) || (i == height / 2))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    static void printI() {
        int i, j;
        for (i = 0; i < height; i++) {
            for (j = 0; j < height; j++) {
                if (i == 0 || i == height - 1)
                    System.out.printf("*");
                else if (j == height / 2)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    static void printJ() {
        int i, j;
        for (i = 0; i < height; i++) {
            for (j = 0; j < height; j++) {
                if (i == height - 1 && (j > 0 && j < height - 1))
                    System.out.printf("*");
                else if ((j == height - 1 && i != height - 1) || (i > (height / 2) - 1 && j == 0 && i != height - 1))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    static void printK() {
        int i, j, half = height / 2, dummy = half;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j <= half; j++) {
                if (j == abs(dummy))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            dummy--;
        }
    }

    static void printL() {
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j <= height; j++) {
                if (i == height - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    static void printM() {
        int i, j, counter = 0;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j <= height; j++) {
                if (j == height)
                    System.out.printf("*");
                else if (j == counter || j == height - counter - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            if (counter == height / 2) {
                counter = -99999;
            } else
                counter++;
            System.out.printf("\n");
        }
    }

    static void printN() {
        int i, j, counter = 0;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j <= height; j++) {
                if (j == height)
                    System.out.printf("*");
                else if (j == counter)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            counter++;
            System.out.printf("\n");
        }
    }

    static void printO() {
        int i, j, space = (height / 3);
        int width = height / 2 + height / 5 + space + space;
        for (i = 0; i < height; i++) {
            for (j = 0; j <= width; j++) {
                if (j == width - abs(space) || j == abs(space))
                    System.out.printf("*");
                else if ((i == 0 || i == height - 1) && j > abs(space) && j < width - abs(space))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            if (space != 0 && i < height / 2) {
                space--;
            } else if (i >= (height / 2 + height / 5))
                space--;
            System.out.printf("\n");
        }
    }

    static void printP() {
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < height; j++) {
                if ((i == 0 || i == height / 2) && j < height - 1)
                    System.out.printf("*");
                else if (i < height / 2 && j == height - 1 && i != 0)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    static void printQ() {
        printO();
        int i, j, d = height;
        for (i = 0; i < height / 2; i++) {
            for (j = 0; j <= d; j++) {
                if (j == d)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            d++;
        }
    }

    static void printR() {
        int i, j, half = (height / 2);
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < width; j++) {
                if ((i == 0 || i == half) && j < (width - 2))
                    System.out.printf("*");
                else if (j == (width - 2) && !(i == 0 || i == half))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    static void printS() {
        int i, j;
        for (i = 0; i < height; i++) {
            for (j = 0; j < height; j++) {
                if ((i == 0 || i == height / 2 || i == height - 1))
                    System.out.printf("*");
                else if (i < height / 2 && j == 0)
                    System.out.printf("*");
                else if (i > height / 2 && j == height - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    static void printT() {
        int i, j;
        for (i = 0; i < height; i++) {
            for (j = 0; j < height; j++) {
                if (i == 0)
                    System.out.printf("*");
                else if (j == height / 2)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    static void printU() {
        int i, j;
        for (i = 0; i < height; i++) {
            if (i != 0 && i != height - 1)
                System.out.printf("*");
            else
                System.out.printf(" ");
            for (j = 0; j < height; j++) {
                if (((i == height - 1) && j >= 0 && j < height - 1))
                    System.out.printf("*");
                else if (j == height - 1 && i != 0 && i != height - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    static void printV() {
        int i, j, counter = 0;
        for (i = 0; i < height; i++) {
            for (j = 0; j <= width; j++) {
                if (j == counter || j == width - counter - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            counter++;
            System.out.printf("\n");
        }
    }

    static void printW() {
        int i, j, counter = height / 2;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j <= height; j++) {
                if (j == height)
                    System.out.printf("*");
                else if ((i >= height / 2) && (j == counter || j == height - counter - 1))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            if (i >= height / 2) {
                counter++;
            }
            System.out.printf("\n");
        }
    }

    static void printX() {
        int i, j, counter = 0;
        for (i = 0; i <= height; i++) {
            for (j = 0; j <= height; j++) {
                if (j == counter || j == height - counter)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            counter++;
            System.out.printf("\n");
        }
    }

    static void printY() {
        int i, j, counter = 0;
        for (i = 0; i < height; i++) {
            for (j = 0; j <= height; j++) {
                if (j == counter || j == height - counter && i <= height / 2)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            if (i < height / 2)
                counter++;
        }
    }

    static void printZ() {
        int i, j, counter = height - 1;
        for (i = 0; i < height; i++) {
            for (j = 0; j < height; j++) {
                if (i == 0 || i == height - 1 || j == counter)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            counter--;
            System.out.printf("\n");
        }
    }

    static void printPattern(char character) {
        switch (character) {
            case 'A':
                printA();
                break;
            case 'B':
                printB();
                break;
            case 'C':
                printC();
                break;
            case 'D':
                printD();
                break;
            case 'E':
                printE();
                break;
            case 'F':
                printF();
                break;
            case 'G':
                printG();
                break;
            case 'H':
                printH();
                break;
            case 'I':
                printI();
                break;
            case 'J':
                printJ();
                break;
            case 'K':
                printK();
                break;
            case 'L':
                printL();
                break;
            case 'M':
                printM();
                break;
            case 'N':
                printN();
                break;
            case 'O':
                printO();
                break;
            case 'P':
                printP();
                break;
            case 'Q':
                printQ();
                break;
            case 'R':
                printR();
                break;
            case 'S':
                printS();
                break;
            case 'T':
                printT();
                break;
            case 'U':
                printU();
                break;
            case 'V':
                printV();
                break;
            case 'W':
                printW();
                break;
            case 'X':
                printX();
                break;
            case 'Y':
                printY();
                break;
            case 'Z':
                printZ();
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String firstName = scanner.next();
        System.out.println("Enter Your Last Name: ");
        String lastName = scanner.next();
        char ch_first = firstName.charAt(0);
        char ch_last = lastName.charAt(0);
        System.out.println();
        printPattern(ch_first);
        System.out.println();
        printPattern(ch_last);

    }
}

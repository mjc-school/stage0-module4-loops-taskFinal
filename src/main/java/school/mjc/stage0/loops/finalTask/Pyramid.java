package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j < cathetusLength + i; j++) {
                if (i > cathetusLength - j && j < cathetusLength ) {
                    System.out.print(cathetusLength - j + 1);
                } else if ( j > cathetusLength - 1 && cathetusLength > j - cathetusLength) {
                    System.out.print(j - cathetusLength + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
  String empty = " ";
  int lengthEmpty = cathetusLength - 1;
  int result = 1;
  int one = 1;
  int a = 1;
  int tens = 1;
  int tens2 = 1;
  int u;
  for(int j = 0; j < cathetusLength; j++) {
      for(int i = lengthEmpty; i > 0; i--) {
          System.out.print(empty);
      }
      for(int i = 0; i < one; i++) {
          System.out.print(result);
      }
      System.out.println();
      lengthEmpty--;
      result *= 10;
      tens2 *= 100;
      a++;
      u = (tens2 * a) + a;
      result += u;
  }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

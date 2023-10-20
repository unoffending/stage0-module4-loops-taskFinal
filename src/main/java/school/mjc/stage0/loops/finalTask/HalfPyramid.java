package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
         String symbol = "*";
     String empty = " ";
     int emptyL = cathetusLength - 1;
     int one = 1;
     for(int j = 0; j < cathetusLength; j++) {
      for(int i = emptyL; i > 0; i--) {
          System.out.print(empty);
      }
      for(int i = 0; i < one; i++) {
          System.out.print(symbol);
      }
      System.out.println();
      one++;
      emptyL--;
  }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}

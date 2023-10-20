package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
                if(numberTableToPrint < 0) {
            System.out.println("Please, input a positive integer!");      
        } else {
        for(int i = 1; i < 10; i++) {
            System.out.println(numberTableToPrint + " * " + i + " = " + numberTableToPrint * i);
        }
        }
    }
}

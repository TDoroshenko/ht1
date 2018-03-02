package multiTable;

class multiTable {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            for (int k = 1; k < 11; k++) {
                System.out.print( i + " * " + k + " = " + i*k + "   ");
                if(k == 10){
                    System.out.println(" ");
                }
            }

        }
    }
}

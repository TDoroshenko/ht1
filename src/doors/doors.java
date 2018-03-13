/*
Есть 100 дверей выстроенных в один ряд. Все двери изначально закрытые. Вы проходите мимо всех дверей 100 раз.
На первом проходе подходите к каждой двери, на втором к каждой второй(2, 4, 6 ...), на третьем к каждой третьей(3, 6, 9 ...)  и т.д.
Подходя к двери вы ее открываете, если она закрыта и закрываете, если открыта. В консоль нужно вывести состояние дверей после последнего прохода.
[X] - дверь закрыта
[О] - дверь открыта

*/
package doors;
import java.sql.Array;
import java.util.Arrays;

class doors {
    public static void main(String[] args) {
        String[] doors = new String[100];
        Arrays.fill(doors, "X");
        for (int i = 1; i <= 100; i++) {
            for (int a = 0; a < 100; a = a + i) {
                doors[a] = doors[a].equals("O") ? "X" : "O";
            }
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println("Door # " + i + " " +doors[i]);
        }
    }
}


package Paradigms;

public class HW_2 {
    public static void main(String[] args) {

        multiplicationTable(6);
    }

    public static void multiplicationTable(int n){
        int result = 0;
        for (int i = 1; i < 10; i++) {
            result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }
}
// В написании кода использую процедурную парадигму, так как функция multiplicationTable ничего не возвращает, является процедурой,  
//которая выполняет в цикле программу умножения(обрабатывает входные данные) и выводит результат на экран. выбрала эту парадигму, потому что
// код выглядит структурно, читабельно и функцию можно вызывать многократно из любой точки. 

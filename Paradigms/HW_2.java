package Paradigms;

public class HW_2 {
    public static void main(String[] args) {

        multiplicationTable(6);
    }

    public static void multiplicationTable(int n){
        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
// В написании кода использую структурную и процедурную парадигмы, так как функция multiplicationTable ничего не возвращает, является процедурой,  
//которая выполняет в цикле программу умножения(обрабатывает входные данные) и выводит результат на экран. выбрала эту парадигму, потому что
// код выглядит структурно, читабельно и функцию можно вызывать многократно из любой точки. 

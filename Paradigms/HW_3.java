package Paradigms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    public static boolean isWin = false;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nПриветствую вас и приглашаю сыграть в игру \"Крестики-нолики\"");

        randomPlayer();

        System.out.println("Введите число от 1 до 9" + '\n');

        char[][] playingField = {{'1','2','3'},
                         {'4','5','6'},
                         {'7','8','9'}};

        char crossOrZero;
        int switcher = 0;

        while (true) {
            if (switcher % 2 == 0)
                crossOrZero = 'x';
            else crossOrZero = 'o';

            printField(playingField);

            int number = Integer.parseInt(reader.readLine());
            if (Arrays.deepToString(playingField).contains(Integer.toString(number)) && number <= 9 && number > 0) {
                switch (number) {
                    case 1: playingField[0][0] = crossOrZero; break;
                    case 2: playingField[0][1] = crossOrZero; break;
                    case 3: playingField[0][2] = crossOrZero; break;
                    case 4: playingField[1][0] = crossOrZero; break;
                    case 5: playingField[1][1] = crossOrZero; break;
                    case 6: playingField[1][2] = crossOrZero; break;
                    case 7: playingField[2][0] = crossOrZero; break;
                    case 8: playingField[2][1] = crossOrZero; break;
                    case 9: playingField[2][2] = crossOrZero; break;
                }
            } else {
                System.out.println("Введите число из оставшихся на поле!");
                continue;
            }

            verifyMatches(playingField);

            if (isWin) {
                System.out.println("Поздравляю, вы победили!");
                printField(playingField);
                break;
            }
            switcher++;
            System.out.println("\nХод следующего игрока, введите число");
        }
    }

    public static void randomPlayer(){
        int randomPlayer = (int) (Math.random() * 2 + 1);
        if (randomPlayer == 1)
            System.out.println("Первым ходит Player1!" + '\n');
        else System.out.println("Первым ходит Player2!" + '\n');
    }

    public static void printField (char[][] playingField) { // печать поля
        System.out.print(" |---|---|---|\n");
        for (int i = 0; i < playingField.length; i++) {
            for (int j = 0; j < playingField[i].length; j++) {
                System.out.print(" | " + playingField[i][j]);
            }
            System.out.print(" | ");
            System.out.print("\n |---|---|---|\n");

        }
    }

    public static void verifyMatches (char[][] playingField) {

        for (int i = 0; i < playingField.length; i++) {
            if (playingField[i][0] == playingField[i][1] && playingField[i][0] == playingField[i][2] ||
                    playingField[0][i] == playingField[1][i] && playingField[0][i] == playingField[2][i] ||
                    playingField[0][0] == playingField[1][1] && playingField[0][0] == playingField[2][2] ||
                    playingField[2][0] == playingField[1][1] && playingField[2][0] == playingField[0][2]) {

                isWin = true;
                break;
            }
        }
    }

}

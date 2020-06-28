/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_ofakind;

import java.util.*;

/**
 *
 * @author david
 */
public class Score {

    int score;

    public int getScore() {
        return score;
    }

    public String getHand(ArrayList<Dice> die) {

        String result = "";

        if (isTwoOfAKind(die)) {
            result = "(Two of A Kind)";
            score = 2;
        } else if (isThreeOfAKind(die)) {
            result = "(Three Of A Kind)";
            score = 3;
        } else if (isFourOfAKind(die)) {
            result = "(Four Of A Kind)";
            score = 4;
        } else if (isFiveOfAKind(die)) {
            result = "(Five of A Kind)";
            score = 5;
        } else {
            result = "";
            score = 1;

        }

        return result;
    }

    private boolean isTwoOfAKind(ArrayList<Dice> die) {

        int[] numbers = sortNumbers(die);

        return (numbers[0] == 2 || numbers[1] == 2 || numbers[2] == 2
                || numbers[3] == 2 || numbers[4] == 2 || numbers[5] == 2);

    }

    private boolean isThreeOfAKind(ArrayList<Dice> die) {

        int[] numbers = sortNumbers(die);

        return (numbers[0] == 3 || numbers[1] == 3 || numbers[2] == 3
                || numbers[3] == 3 || numbers[4] == 3 || numbers[5] == 3);

    }

    private boolean isFourOfAKind(ArrayList<Dice> die) {

        int[] numbers = sortNumbers(die);

        return (numbers[0] == 4 || numbers[1] == 4 || numbers[2] == 4
                || numbers[3] == 4 || numbers[4] == 4 || numbers[5] == 4);

    }

    private boolean isFiveOfAKind(ArrayList<Dice> die) {
        int[] numbers = sortNumbers(die);
        return (numbers[0] == 5 || numbers[1] == 5 || numbers[2] == 5
                || numbers[3] == 5 || numbers[4] == 5 || numbers[5] == 5);

    }

    private int[] sortNumbers(ArrayList<Dice> die) {

        int numberOne = 0, numberTwo = 0, numberThree = 0, numberFour = 0,
                numberFive = 0, numberSix = 0;

        for (int i = 0; i < die.size(); i++) {
            if (die.get(i).getCurrentNumber() == 1) {
                numberOne++;
            }
            if (die.get(i).getCurrentNumber() == 2) {
                numberTwo++;
            }
            if (die.get(i).getCurrentNumber() == 3) {
                numberThree++;
            }
            if (die.get(i).getCurrentNumber() == 4) {
                numberFour++;
            }
            if (die.get(i).getCurrentNumber() == 5) {
                numberFive++;
            }
            if (die.get(i).getCurrentNumber() == 6) {
                numberSix++;
            }

        }
        int[] numbers = new int[]{numberOne, numberTwo, numberThree, numberFour,
            numberFive, numberSix};
        return numbers;
    }
}

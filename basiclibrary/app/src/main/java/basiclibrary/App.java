package basiclibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class App {
    public static void main(String[] args) {

        
        int[] dices = roll(6);
        System.out.println(Arrays.toString(dices));

        System.out.println(containsDuplicates(dices));

        System.out.println(calculatingAverages(dices));


        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        int[] mainArr = arraysOfArrays(weeklyMonthTemperatures);

        System.out.println("this is the lowest avg " +Arrays.toString(mainArr));


        weather(weeklyMonthTemperatures);


        // Lab03 --- most votes.
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        tally(votes);
    }

    public static int[] roll(int num) {
        int[] dice = new int[num];
        for (int i = 0; i < num; i++) {
            int random = 1 + (int) (Math.random() * 6);
            dice[i] = random;
        }
        return dice;
    }
    public static boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static double calculatingAverages(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (double)sum / (arr.length);
    }
    public static int[] arraysOfArrays(int[][] arr) {
        List<Double> sumOfArrays= new ArrayList<>();

        int sum = 0;
        double avg =0;
        for (int i = 0; i < arr.length; i++) {
            sum=0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            avg =(double) sum/ arr[i].length;
            sumOfArrays.add(avg);
        }
        double min = sumOfArrays.get(0);
        int index = 0;
        for (double i = 0; i < sumOfArrays.size(); i++) {
            double value = sumOfArrays.get((int)i);
            if (value < min){
                min =value;
                index = (int)i;
//                System.out.println("lowestAvg is :"+min);
//                System.out.println("index is :"+index);
//                System.out.println("-----------------");
            }
        }
//        System.out.println("index is :"+index);
        return arr[index];
    }
    public static void weather(int[][] arr) {

        // Add all numbers into one array
        List<Integer> ArrayWithAllNumbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                ArrayWithAllNumbers.add(arr[i][j]);
            }
        }

        // Get rid of all the duplicated values
        Set<Integer> uniqueTemp = new HashSet<>();
        uniqueTemp.addAll(ArrayWithAllNumbers);

        // Find the min mix values
        // store the length of the ArrayList in variable n
        int n = ArrayWithAllNumbers.size();

        int min = ArrayWithAllNumbers.get(0);
        int max = ArrayWithAllNumbers.get(0);
        // loop to find minimum from ArrayList
        for (int i = 1; i < n; i++) {
            if (ArrayWithAllNumbers.get(i) < min) {
                min = ArrayWithAllNumbers.get(i);
            }
            if (ArrayWithAllNumbers.get(i) > max) {
                max = ArrayWithAllNumbers.get(i);
            }
        }
        System.out.println("This is the minimum number: " + min);
        System.out.println("This is the maximum number: " + max);

        // Never saw temperature
        for (int i = min; i < max; i++) {
            if (!ArrayWithAllNumbers.contains(i)) {
                System.out.println("Never saw temperature: " + i);
            }
        }

        System.out.println(uniqueTemp);
        System.out.println("This is the length of the hashSet " + uniqueTemp.size());
    }
    public static void tally(List<String> votes) {
        // declear a string value to give it the name with highest votes
        String winner = "";

        // declear an integer value to compare the votes
        int temp = 0;

        // declear an array list to get rid of the dublicated values


        Set<String> getRidOfdub = new HashSet<>();
        getRidOfdub.addAll(votes);

        for (String vote : getRidOfdub) {

            int highiestVotesNumber = Collections.frequency(votes, vote);

            if (highiestVotesNumber > temp) {
                temp = highiestVotesNumber;
                winner = vote;
            }
        }
        System.out.println( winner + " received the most votes!");
    }

}

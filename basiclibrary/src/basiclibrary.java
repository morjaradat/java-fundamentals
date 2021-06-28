public class basiclibrary {
    public static void main(String[] args) {
        int[] dices = roll(6);
        for (int i = 0; i < dices.length; i++) {
            System.out.println(dices[i]);
        }
        System.out.println(containsDuplicates(dices));
        System.out.println(calculatingAverages(dices));
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] mainArr = arraysOfArrays(weeklyMonthTemperatures);
        for (int i = 0; i < mainArr.length; i++) {
            System.out.println(mainArr[i]);
        }
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
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / (arr.length);
        return avg;
    }
    public static int[] arraysOfArrays(int[][] arr) {
        int[] tempArr = new int[arr[0].length];
        int sum = 0;
        double avg =0;
        double temp = 2147483647;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            
            avg =sum/ arr[i].length;
            if (avg < temp) {
                for (int j = 0; j < arr[i].length; j++) {
                    tempArr[j] = arr[i][j];
                }
                temp= avg;
            }
        }
        return tempArr;
    }
}

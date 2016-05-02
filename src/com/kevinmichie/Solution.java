package com.kevinmichie;

import java.util.Scanner;

public class Solution {

    // YES if class is cancelled
    // NO if class is on
    // If Value in Array is less than or equal to 0, then they are early or on-time
    // If Value in Array is greater than 0, then they are late

    public void isClassCancelled(int threshold, int[] students){
        int onTimeOrEarly= 0;
        for(int i = 0; i < students.length; i++){
            if(students[i] <= 0){
                onTimeOrEarly+=1;
            }
        }
        if(onTimeOrEarly >= threshold){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int numberOfCases = scanner.nextInt();
        for(int i=0; i < numberOfCases; i++){
            int numberOfStudents = scanner.nextInt();
            int threshold = scanner.nextInt();
            int[] arrayOfStudents = new int[numberOfStudents];
            for(int j = 0; j < arrayOfStudents.length; j++){
                arrayOfStudents[j] = scanner.nextInt();
            }
            solution.isClassCancelled(threshold,arrayOfStudents);
        }
    }
}

package org.example.Collections;

import java.util.*;

public class SetTask {

    public  Set<Integer> findUniqueElements(int[] numArray) {

        Set<Integer> uniqueElements = new LinkedHashSet<>();

        for(int num : numArray) {
            uniqueElements.add(num);
        }

        return uniqueElements;
    }

    public int[] enterNumbers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int lenght = scanner.nextInt();

        int[] numArray = new int[lenght];

        System.out.println("Enter the elements of array: ");

        for (int i = 0; i < lenght; i++) {
            numArray[i] = scanner.nextInt();
        }
        return numArray;
    }

}

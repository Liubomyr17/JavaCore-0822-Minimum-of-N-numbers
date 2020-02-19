package com.company;

/*
0822 Minimum of N numbers

1. Enter with
2. Read N integers and fill them with a list - getIntegerList method.
3. Find the minimum number among the list items - getMinimum method.

Requirements:
1. The program should display the text on the screen.
2. The program should read the values ​​from the keyboard.
3. The Solution class should contain only three methods.
4. The getIntegerList () method should read the number N from the keyboard, then return a list of N items filled with numbers from the keyboard.
5. The getMinimum () method should return the minimum number among the list items.
6. The main () method should call the getIntegerList () method.
7. The main () method should call the getMinimum () method.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }
    public static int getMinimum(List<Integer>array) {
        int min = array.get(0);

        for(int i=0; i< array.size(); i++) {
            if(array.get(i) < min)
                min = array.get(i);
        }
        return min;
    }
    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        for (int i=0; i < N; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}



package guru.qa;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // массивы
        String[] strArr0 = new String[5];
        int[] intArr = new int[]{1, 42, -100};
        int[] intArr0 = new int[5];
        intArr0[0] = 1;
        intArr0[1] = 42;
        intArr0[2] = -100;
        intArr0[3] = -101;
        intArr0[4] = 102;
        int[][] twoDimensionalArray = new int[][]{intArr, intArr0};

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            int[] arr = twoDimensionalArray[i];
            for (int a = 0; a < arr.length; a++) {
                if (arr[a] == -101) {
                    System.out.println("Нашли: " + arr[a]);
                    break;
                }
                System.out.println("n i ");
            }
        }

        for (int element : intArr0) {
            if (element == -100) {
                System.out.println("Нашли: " + element);
                break;
            }
            System.out.println("n i ");
        }

        boolean founded = true;
        while (!founded) {
            // search process
            founded = true;
        }

        do {

        } while (!founded);

        int[] intArr2 = new int[5];
        intArr0[0] = 1;

        List<List<String>> intList = List.of(
                List.of("df", "42", "100"),
                List.of("sdf", "427", "104350")
        );

        Set<Integer> stringSet = Set.of(1, 42);

        Map<String, People> aMap = Map.of(
                "1234", new People(),
                "5234", new People()
        );

        List<Object> commonList = new ArrayList<>();
        commonList.add("Dima");
        commonList.add(Set.of(1, 2));

        Set<String> keySet = aMap.keySet();
        Collection<People> values = aMap.values();
        Set<Map.Entry<String, People>> entries = aMap.entrySet();
        for (Map.Entry<String, People> entry: entries) {
            if (entry.getKey().equals("5234")) {
                entry.getValue().sayRespect();
            }
        }

        for (String key: keySet) {
            if (key.equals("5234")) {
                aMap.get(key).sayRespect();
            }
        }


        // целые числа
        byte varByte = 0; // -128 .. 127
        short varShort = 0; // -32768 ... 32767
        // must have
        int varInt = 0;
        long varLong = 0L;


        // числа с плавающей точкой
        float varFloat = 0.0f;
        // must have
        double varDouble = 0.0d;

        // логический
        boolean varBool = false;

        // символьный
        char varChar = '0';

        String varStr = null;
        String varStr0 = "Hello, qa.guru";

        // ОПЕРАТОРЫ
        // 1. Присовения
        int varInt0 = 0;

        // 2. Математические + - * / % ++ --

        // 3. Сравнения  >, <, >=, <=, !=, ==

        // 4. Логические операторы &&, ||, !

//        if (varStr != null && varStr.length() == 10) {
//            System.out.println(varStr);
//        } else if (varStr != null && varStr.length() == 9) {
//            System.out.println("Извините, строка ровно из 9 символов");
//        } else {
//            System.out.println("Извините, не из 9 или 10 символов");
//        }
//        System.out.println("Hello, qa.guru");
    }
}
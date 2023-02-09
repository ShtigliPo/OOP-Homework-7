package ru.gb.Model.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ru.gb.Model.data.Partner;

public class DataReader {
    public static List<Partner> dataRead(String path) {

        List<Partner> list = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = bf.readLine()) != null) {

                String[] array = str.split("; ");
                list.add(new Partner(array[0], array[1], Integer.parseInt(array[2]), array[3], array[4], array[5], array[6], array[7]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}

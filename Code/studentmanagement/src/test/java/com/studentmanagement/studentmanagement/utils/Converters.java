package com.studentmanagement.studentmanagement.utils;

import com.studentmanagement.studentmanagement.model.entity.Student;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Converters {
    public static boolean equalLists(List<String> a, List<String> b) {
        // Check for sizes and nulls

        if (a == null && b == null) return true;


        if ((a == null && b != null) || (a != null && b == null) || (a.size() != b.size())) {
            return false;
        }

        // Sort and compare the two lists
        Collections.sort(a);
        Collections.sort(b);
        return a.equals(b);
    }

    public static List<String> convertList(List<Student> list) {

        List<String> strings = list.stream()
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toList());
        return strings;
    }

}

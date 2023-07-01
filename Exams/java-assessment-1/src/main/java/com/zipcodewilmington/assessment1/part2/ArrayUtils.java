package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if(objectToCount.equals(objectArray[i])){
                count += 1;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < objectArray.length; i++) {
            if(!(objectToRemove.equals(objectArray[i]))){
                arrayList.add(objectArray[i]);
            }
        }
        return arrayList.toArray(new Integer[arrayList.size()]);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {
        Integer count = 0;
        int mem = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if(count.intValue() < getNumberOfOccurrences(objectArray, objectArray[i]).intValue()){
                count = getNumberOfOccurrences(objectArray, objectArray[i]);
                mem = i;
            }
        }
        return objectArray[mem];
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Integer[] objectArray) {
        Integer count = Integer.MAX_VALUE;
        int mem = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if(count.intValue() > getNumberOfOccurrences(objectArray, objectArray[i]).intValue()){
                count = getNumberOfOccurrences(objectArray, objectArray[i]);
                mem = i;
            }
        }
        return objectArray[mem];
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < objectArray.length; i++) {
            arrayList.add(objectArray[i]);
        }
        for (int i = 0; i < objectArrayToAdd.length; i++) {
            arrayList.add(objectArrayToAdd[i]);
        }
        return arrayList.toArray(new Integer[objectArray.length + objectArrayToAdd.length]);
    }
}

package 选择排序;

import 线性查找法.Student;

// 改成范型后需要实现 Comparable 方法 然后才可以用compareTo去比较值
public class SelectionSort {
    private SelectionSort(){}
    public static <E extends Comparable<E>> void sort(E[] arr){
        // arr [0..i)是有序的 arr[i..n)是无序的


        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                } 
            }
            swap(arr, i, minIndex);
        }
    }
    private static <E> void swap(E[] arr , int i ,int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Integer[] arr = { 1 ,4, 9, 0 ,9,23 ,5,8};
        SelectionSort.sort(arr);
        for (Integer i : arr) {
            System.out.print(i + " ");    
        }

        Student[] students = {
            new Student("name1", 99),
            new Student("name2", 98),
            new Student("name3", 18),
        };
        SelectionSort.sort(students);

        for (Student student : students) {
            System.out.print(student + "");
        }

        
    }
}


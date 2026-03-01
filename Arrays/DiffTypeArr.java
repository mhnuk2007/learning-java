package Arrays;

import java.util.Arrays;

public class DiffTypeArr {
    public static void main(String[] args) {
        // Primitive types
        byte[] bytes = new byte[8];
        short[] shorts = new short[8];
        int[] ints = new int[8];
        long[] longs = new long[8];
        float[] floats = new float[8];
        double[] doubles = new double[8];
        char[] cs = new char[8];
        boolean[] bools = new boolean[8];
        System.out.println("Default byte value: " + bytes[0]);
        System.out.println("Default short value: " + shorts[0]);
        System.out.println("Default int value: " + ints[0]);
        System.out.println("Default long value: " + longs[0]);
        System.out.println("Default float value: " + floats[0]);
        System.out.println("Default double value: " + doubles[0]);
        System.out.println("Default char value: " + cs[0]);
        System.out.println("Default boolean value: " + bools[0]);

        System.out.println("Byte Array: " + Arrays.toString(bytes));
        System.out.println("Short Array: " + Arrays.toString(shorts));
        System.out.println("Int Array: " + Arrays.toString(ints));
        System.out.println("Long Array: " + Arrays.toString(longs));
        System.out.println("Float Array: " + Arrays.toString(floats));
        System.out.println("Double Array: " + Arrays.toString(doubles));
        System.out.println("Char Array: " + Arrays.toString(cs));
        System.out.println("Bool Array: " + Arrays.toString(bools));

        // Reference Types
        String[] strings = new String[8];
        Integer[] integers = new Integer[8];
        Object[] objects = new Object[8];

        System.out.println("Default String value: " + strings[0]);
        System.out.println("Default Integer value: " + integers[0]);
        System.out.println("Default Object value: " + objects[0]);


        // Anonymous array
        printArray(new int[]{1, 2, 3, 4});
    }
        static void printArray(int[] arr){
            for (int value : arr) {
                System.out.print(value + " ");
            }
        }

}

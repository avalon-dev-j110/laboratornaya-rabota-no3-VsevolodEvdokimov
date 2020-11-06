package com.company;

import java.util.Arrays;

public class Calculation implements ICalculator {

    public static void main(String[] args) {
        try {
            int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };
            var calculation = new Calculation();
            calculation.getSum(nums2);
            calculation.getPositiveSum(nums2);
            calculation.getFreeElements(null);
        }
        catch (CalculationException e) {
            System.out.printf("%s: %s\n", e.getMessage(), e.getErrorValue());
        }
    }

    @Override
    public double getSum(int[][] array) throws CalculationException {
        if(array == null)
            throw new CalculationException(array, "array has invalid value");

        var sum = 0;
        for (int[] line: array)
            for (int elem: line)
                sum += elem;

        return sum;
    }

    @Override
    public double getPositiveSum(int[][] array) throws CalculationException {
        if(array == null)
            throw new CalculationException(array, "array has invalid value");

        var sum = 0;
        for (int[] line: array)
            for (int elem: line)
                if(sum > 0)
                    sum += elem;

        return sum;
    }

    @Override
    public int getFreeElements(Object[] array) throws CalculationException {
        if(array == null)
            throw new CalculationException(array, "array has invalid value");

        var count = 0;
        for (Object elem: array)
            if(elem == null)
                count++;

        return count;
    }
}

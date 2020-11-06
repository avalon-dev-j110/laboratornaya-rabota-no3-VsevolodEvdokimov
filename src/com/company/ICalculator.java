package com.company;

public interface ICalculator {
    /**
     * Метод возвращает сумму всех элементов двумерного массива.
     *
     * @param array данный параметр задаёт исходный массив чисел.
     * @return сумма элементов массива.
     * @throws CalculationException выбрасывается в случае, если
     * ссылка array равна null.
     */
    double getSum(int[][] array) throws CalculationException;

    /**
     * Метод возвращает сумму только положительных элементов массива
     * array.
     *
     * @param array исходный массив.
     * @return сумма положительных элементов массива.
     * @throws CalculationException выбрасывается в случае, если
     * ссылка array равна null.
     */
    double getPositiveSum(int[][] array) throws CalculationException;

    /**
     * Метод подсчитывает в исходном массиве количество "свободных"
     * элементов массива (равных null).
     *
     * @param array исходный массив.
     * @return количество "свободных" элементов массива.
     * @throws CalculationException выбрасывается в случае, если ссылка
     * array равна null.
     */
    int getFreeElements(Object[] array) throws CalculationException;
}

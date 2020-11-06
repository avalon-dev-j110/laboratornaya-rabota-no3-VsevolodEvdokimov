package com.company;

public class DemoArray {
    public static void main(String[] args) {
        var demoArray = new DemoArray();

        var oneDimensionArray1 = demoArray.getOneDimensionArray(10);
        var oneDimensionArray2 = demoArray.getOneDimensionArray(-10);

        var twoDimensionArray1 = demoArray.getTwoDimensionArray(10, 3);
        var twoDimensionArray2 = demoArray.getTwoDimensionArray(-10, 3);
        var twoDimensionArray3 = demoArray.getTwoDimensionArray(10, -3);
        var twoDimensionArray4 = demoArray.getTwoDimensionArray(-10, -3);

        var triangleArray1 = demoArray.getTriangleArray(10);
        var triangleArray2 = demoArray.getTriangleArray(-10);

        var textArray1 = demoArray.getTextArray(10);
        var textArray2 = demoArray.getTextArray(-10);

        demoArray.setArray(5, true);
        demoArray.setArray(7, false);
    }



    /** Метод возвращает объект, представляющий одномерный массив, размер
     * которого задаётся параметром size. В случае, когда этот параметр
     * имеет отрицательное значение, массив не создаётся, а метод
     * возвращает значение null.
     */
    public int[] getOneDimensionArray (int size) {
        return (size < 0)
                ? null
                : new int[size];
    }

    /** Метод возвращает объект, представляющий двумерный массив, размер
     * которого задаётся параметрами firstSize и secondSize. В случае,
     * когда хотя бы один из этих параметров принимает отрицательное
     * значение, массив не создаётся, а метод возвращает значение null.
     */
    public int[][] getTwoDimensionArray (int firstSize, int secondSize ) {
        return (firstSize < 0 || secondSize < 0)
                ? null
                : new int[firstSize][secondSize];
    }

    /** Метод возвращает объект, представляющий двумерный массив, который
     * имеет «треугольный» вид. т.е. массив, в котором нулевая «строка»
     * содержит строго один элемент и каждая последующая «строка» с
     * индексом i содержит ровно i+1 элементов. Количество «строк» этого
     * массива задаётся параметром size. В случае, когда этот параметр
     * имеет отрицательное значение, массив не создаётся, а метод
     * возвращает значение null.
     */
    public int[][] getTriangleArray (int size) {
        if(size < 0)
            return null;

        var result = new int[size][];
        for(int i = 0; i < size; i++)
            result[i] = new int[i + 1];

        return  result;
    }

    /** Метод возвращает объект, представляющий одномерный массив* объектов типа Text (см.задание №3). Размер массива задаётся значением
     * параметра size. Если параметр size имеет значение больше 2, то
     * первые два элемента массива должны быть проинициализированы
     * ссылками на объекты типа Text. В случае, когда этот параметр имеет
     * отрицательное значение, то массив не создаётся, а данный метод
     * возвращает значение null.
     */
    public Text[] getTextArray (int size) {
        if(size < 0)
            return null;

        var result = new Text[size];
        if(size > 2)
        {
            result[0] = new Text();
            result[1] = new Text();
        }

        return result;
    }

    /** Метод заполняет одномерный целочисленный массив
     * последовательностью значений, начинающихся со значения first.
     * Если параметр increase имеет значение true, то каждый
     * последующий элемент массива получает значение на единицу больше,
     * чем значение предыдущего элемента. Если значение параметра
     * increase имеет значение false, то каждый последующий элемент
     * массива получает значение на единицу меньше, чем значение
     * предыдущего элемента.
     */
    public void setArray (int first, boolean increase) {
        var size = 10;
        var array = getOneDimensionArray(size);
        var increment = (increase) ? +1 : -1;
        for (int i = 0; i < size; i++) {
            array[i] = first;
            first += increment;
        }
    }
}

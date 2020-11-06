package com.company;

public class CalculationException extends Exception {

    public static void main(String[] args) throws CalculationException {
        var errorValue = 7;
        throw new CalculationException(errorValue, "Invalid value");
    }

    private Object errorValue;

    public CalculationException(){
        super();
    }

    public CalculationException(Object errorValue, String message){
        super(message);
        this.errorValue = errorValue;
    }

    public Object getErrorValue() {
        return errorValue;
    }
}

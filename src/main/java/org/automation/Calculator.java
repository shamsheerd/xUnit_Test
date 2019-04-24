package org.automation;

public class Calculator {
//@Steps**********************
//{N} where N is a zero-based positive integer that will be replaced by the Nth method argument
//{method} will be replaced by the annotated method name


    public double add(double a, double b){
        return a+b;
    }

    public double sub(double a, double b){
        return a-b;
    }

    public double mul(double a, double b){
        return a*b;
    }

    public double div(double a, double b){
        return a/b;
    }

    public double mod(double a, double b){
        return a%b;
    }
}

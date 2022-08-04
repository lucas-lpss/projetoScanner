package com.company;

public class booleansFuncoes {

    static boolean conjuncoes(boolean valorUm, boolean valorDois) {

        boolean valor = false;
        if (valorUm && valorDois)
            return true;
        else return false;
    }
        boolean disjuncao ( boolean valorUm, boolean valorDois) {
            if (valorUm || valorDois)
                return true;
            else return false;
        }
}

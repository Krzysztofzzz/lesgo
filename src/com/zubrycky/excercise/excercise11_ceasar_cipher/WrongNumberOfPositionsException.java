package com.zubrycky.excercise.excercise11_ceasar_cipher;

public class WrongNumberOfPositionsException extends Exception {

    public WrongNumberOfPositionsException() {
        super("'move' input must be between 0 and 26");
    }
}

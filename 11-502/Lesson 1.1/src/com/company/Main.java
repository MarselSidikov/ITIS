package com.company;

public class Main {

    public static void main(String[] args) {
	    Transport[] transports = new Transport[3];

        transports[0] = new Bike();
        transports[1] = new Auto();
        transports[2] = new Bike();

        for (int i = 0; i < transports.length; i++) {
            transports[i].go();
        }

        /*
        for (Transport transport : transports) {
            transport.go();
        }
        */
    }
}

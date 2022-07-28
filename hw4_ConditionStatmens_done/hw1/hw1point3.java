package com.softserve.hometasks.hometask1.hw4_ConditionStatmens_done.hw1;

public class hw1point3 {
    public static void main(String[] args) {
        int error = 103;
        HTTPError httpError = null;
        switch (error) {
            case 100:
                httpError = HTTPError.CONTINUE;
                break;
            case 101:
                httpError = HTTPError.SWITCHING_PROTOCOL;
                break;
            case 102:
                httpError = HTTPError.PROCESSING;
                break;
            case 103:
                httpError = HTTPError.EARLY_HINTS;
                break;
            default:
                System.out.println("No such error");
                System.exit(0);
        }
        System.out.println(httpError);
        int y = 0x2a;
        System.out.println(y);
    }
}


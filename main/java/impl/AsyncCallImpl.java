package main.java.impl;

import main.java.contract.AsyncCall;
import main.java.contract.AsyncCallV2;

public class AsyncCallImpl implements AsyncCall, AsyncCallV2 {

    @Override
    public void callback() {
        System.out.println("Inside AsyncCall implementation");
    }
}

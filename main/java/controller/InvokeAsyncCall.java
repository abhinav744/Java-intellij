package main.java.controller;

import main.java.contract.AsyncCall;
import main.java.contract.AsyncCallV2;
import main.java.impl.AsyncCallImpl;

public class InvokeAsyncCall {
    public static void main(String[] args) {
        AsyncCall objAsyncCall = new AsyncCallImpl();
        AsyncCallV2 objAsyncCallV2 = new AsyncCallImpl();
        AsyncCallImpl objAsyncCallImpl = new AsyncCallImpl();

        objAsyncCall.callback();
        objAsyncCallV2.callback();
        objAsyncCallImpl.callback();
    }
}

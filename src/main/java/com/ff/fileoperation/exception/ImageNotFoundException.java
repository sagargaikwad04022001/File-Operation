package com.ff.fileoperation.exception;

public class ImageNotFoundException extends RuntimeException {
    private String msg;

    public ImageNotFoundException(String message) {

        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}

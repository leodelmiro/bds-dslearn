package com.devsuperior.dslearnbds.services.exceptions;

import java.io.Serializable;

public class ForbiddenException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;

    public ForbiddenException(String msg){
        super(msg);
    }

}

package org.mohammed.ecommerce.controller;

public class ResponseController {

    private String massege;

   public ResponseController (String massege)
    {
        this.massege=massege;
    }
    public String getMessage()
    {
        return this.massege;
    }

}

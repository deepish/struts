package com.deepish.vannilla;
public class HelloWorld {

    private String message;

    private String userName;

    public HelloWorld() {
    }

    public String execute() {
    	System.out.println("I am heree!!!!");
        setMessage("Hello " + getUserName());
        return "SUCCESS";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
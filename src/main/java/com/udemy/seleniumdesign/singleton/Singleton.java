package com.udemy.seleniumdesign.singleton;
/*
 * https://levelup.gitconnected.com/confused-with-java-singleton-design-pattern-have-a-look-at-this-article-4515adcab93e
 * */

public class Singleton {

    //private constructor
    private Singleton(){

    }
    /*
    inner static class SingletonHelper is loaded when
    SingletonHelper.theSingletonInstance is executed/called.
     */
    private static class SingletonHelper {
        private static final Singleton theSingletonInstance = new Singleton();
    }
    //public static method to get theSingletonInstance
    public static Singleton getInstance(){
        return SingletonHelper.theSingletonInstance;
        /*
        when above line is executed SingletonHelper class is loaded and
        then static variable theSingletonInstance is initialized
         */
    }
}

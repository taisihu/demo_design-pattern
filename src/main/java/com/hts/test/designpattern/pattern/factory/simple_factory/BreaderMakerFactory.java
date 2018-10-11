package com.hts.test.designpattern.pattern.factory.simple_factory;


public class BreaderMakerFactory {

    public static BreadMaker produce(String type){

        if("toast".equals(type)){
            return new ToastMaker();
        }
        if("croissant".equals(type)){
            return new CroissantMaker();
        }

        return null;
    }

}

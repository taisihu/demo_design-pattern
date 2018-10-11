package com.hts.test.designpattern.pattern.factory.static_muti_method_factory;

import com.hts.test.designpattern.pattern.factory.simple_factory.BreadMaker;
import com.hts.test.designpattern.pattern.factory.simple_factory.CroissantMaker;
import com.hts.test.designpattern.pattern.factory.simple_factory.ToastMaker;

/**
 *
 * 
 *
 */
public class BreadFactory {

    public static BreadMaker produceToast(){
        return new ToastMaker();
    }

    public static  BreadMaker produceCroissantMaker(){
        return new CroissantMaker();
    }

}

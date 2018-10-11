package com.hts.test.designpattern.pattern.factory.mutiMethodFactory;

import com.hts.test.designpattern.pattern.factory.simple_factory.BreadMaker;
import com.hts.test.designpattern.pattern.factory.simple_factory.CroissantMaker;
import com.hts.test.designpattern.pattern.factory.simple_factory.ToastMaker;

/**
 *
 *
 *
 */
public class BreadFactory {

    public BreadMaker produceToast(){
        return new ToastMaker();
    }

    public BreadMaker produceCroissantMaker(){
        return new CroissantMaker();
    }

}

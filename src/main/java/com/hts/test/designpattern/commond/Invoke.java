package com.hts.test.designpattern.commond;

public class Invoke {

    private Commond commond;

    public Invoke(Commond commond) {
        this.commond = commond;
    }

    public void action(){
        commond.exe();
    }
}

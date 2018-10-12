package com.hts.test.designpattern.mediator;

public abstract class User {

    private Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }



    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}

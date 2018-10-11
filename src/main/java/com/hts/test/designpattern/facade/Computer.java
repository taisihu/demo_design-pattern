package com.hts.test.designpattern.facade;

import com.hts.test.designpattern.facade.module.CPU;
import com.hts.test.designpattern.facade.module.Disk;
import com.hts.test.designpattern.facade.module.Memory;

public class Computer {

    private CPU cpu;

    private Disk disk;

    private Memory memory;

    public Computer(){
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void start(){
        System.out.println("Computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("Computer start end");
    }

    public void shutdown(){
        System.out.println("Computer shutdown begin");
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
        System.out.println("Computer shutdown end");
    }

}

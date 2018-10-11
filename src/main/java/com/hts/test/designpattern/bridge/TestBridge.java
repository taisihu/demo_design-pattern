package com.hts.test.designpattern.bridge;

public class TestBridge {

    public static void main(String[] args) {

        DriverBridge driverBridge = new MyDriverBridge();

        MySqlDrive mySqlDrive = new MySqlDrive();
        driverBridge.setDriverable(mySqlDrive);
        driverBridge.drive();

        OracleDrive oracleDrive = new OracleDrive();
        driverBridge.setDriverable(oracleDrive);
        driverBridge.drive();

    }

}

package com.hts.test.designpattern.prototype;

import java.io.*;

public class Prototype implements Cloneable,Serializable {

    private String str;

    /**
     * 浅复制
     * @return
     * @throws CloneNotSupportedException
     */
    public Prototype shallowClone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }

    /**
     * 深复制
     * @return
     */
    public Object deepClone(){

        try {

            //读取
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

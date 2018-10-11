package com.hts.test.designpattern.composite;

public class KillVirusClient {

    public static void main(String[] args) {

        Forder forder = new Forder("hts");
        Forder textForder = new Forder("hts的文本文件夹");
        Forder imageForder = new Forder("hts的图片文件夹");

        AbstractFile textFile1 = new TextFile("test1.txt");
        AbstractFile textFile2 = new TextFile("text2.txt");
        AbstractFile imageFile1 = new ImageFile("image1.jpg");
        AbstractFile imageFile2 = new ImageFile("image2.jpg");

        textForder.add(textFile1);
        textForder.add(textFile2);
        imageForder.add(imageFile1);
        imageForder.add(imageFile2);

        forder.add(textForder);
        forder.add(imageForder);

        forder.killVirus();


    }

}

package com.nekolr.templatemethod;

public class Demo {

    public static void main(String[] args) {
        AbstractDataMiner docDataMiner = new DocDataMiner();
        docDataMiner.mine("d:\\test.doc");

        AbstractDataMiner csvDataMiner = new CsvDataMiner();
        csvDataMiner.mine("d:\\test.csv");
    }
}

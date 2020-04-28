package com.nekolr.decorator;

public class Demo {
    public static void main(String[] args) {

        DataSource dataSource = new FileDataSource("d:\\test.txt");
        DataSourceDecorator encryptionDecorator = new EncryptionDataSourceDecorator(dataSource);
        DataSourceDecorator compressionDecorator = new CompressionDataSourceDecorator(encryptionDecorator);

        compressionDecorator.writeData("a");
        String data = compressionDecorator.readData();
        System.out.println(data);
    }
}

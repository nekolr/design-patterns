package com.nekolr.decorator;

public interface DataSource {
    /**
     * 读数据
     */
    String readData();

    /**
     * 写数据
     *
     * @param data 数据
     */
    void writeData(String data);
}

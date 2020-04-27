package com.nekolr.decorator;

/**
 * 数据源装饰器
 */
public class DataSourceDecorator implements DataSource {

    private DataSource wrappedDataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.wrappedDataSource = dataSource;
    }

    @Override
    public String readData() {
        return wrappedDataSource.readData();
    }

    @Override
    public void writeData(String data) {
        wrappedDataSource.writeData(data);
    }
}

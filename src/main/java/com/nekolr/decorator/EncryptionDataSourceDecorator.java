package com.nekolr.decorator;

import lombok.Getter;
import lombok.Setter;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 *  加密装饰器，对读写数据提供加密和解密功能
 */
@Getter
@Setter
public class EncryptionDataSourceDecorator extends DataSourceDecorator {

    private Charset defaultCharset = Charset.forName("UTF-8");

    public EncryptionDataSourceDecorator(DataSource dataSource) {
        super(dataSource);
    }

    private String encode(String data) {
        byte[] result = data.getBytes(defaultCharset);
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }

    @Override
    public String readData() {
        return this.decode(super.readData());
    }

    @Override
    public void writeData(String data) {
        super.writeData(this.encode(data));
    }
}

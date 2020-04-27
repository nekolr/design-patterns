package com.nekolr.decorator;

import lombok.Getter;
import lombok.Setter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/**
 * 压缩装饰器，对读写数据提供压缩功能
 */
@Getter
@Setter
public class CompressionDataSourceDecorator extends DataSourceDecorator {

    private Charset defaultCharset = Charset.forName("UTF-8");
    private int compressLevel = Deflater.BEST_COMPRESSION;

    public CompressionDataSourceDecorator(DataSource dataSource) {
        super(dataSource);
    }

    private String compress(String data) {
        byte[] result = data.getBytes(this.defaultCharset);
        ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
        DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(this.compressLevel, true));
        try {
            dos.write(result);
            dos.close();
            return new String(bout.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String decompress(String data) {
        byte[] result = data.getBytes(defaultCharset);
        InputStream in = new ByteArrayInputStream(result);
        InflaterInputStream iin = new InflaterInputStream(in, new Inflater(true));
        ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
        int b;
        try {
            while ((b = iin.read()) != -1) {
                bout.write(b);
            }
            iin.close();
            bout.close();
            return new String(bout.toByteArray());
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }
}

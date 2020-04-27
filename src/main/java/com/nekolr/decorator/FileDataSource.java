package com.nekolr.decorator;

import java.io.*;
import java.nio.charset.Charset;

/**
 * 文件数据源，提供简单的读写文件功能
 */
public class FileDataSource implements DataSource {

    private String filePath;

    public FileDataSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String readData() {
        File file = new File(filePath);
        char[] buff = new char[(int) file.length()];
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(file), Charset.forName("UTF-8"))) {
            reader.read(buff);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buff);
    }

    @Override
    public void writeData(String data) {
        File file = new File(filePath);
        try (OutputStream out = new FileOutputStream(file)) {
            out.write(data.getBytes(Charset.forName("UTF-8")), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

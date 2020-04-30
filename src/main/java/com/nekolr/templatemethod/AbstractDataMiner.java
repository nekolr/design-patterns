package com.nekolr.templatemethod;

import java.io.*;

/**
 * 数据抽取分析器，从各种文档（doc、csv、pdf）中抽取并分析数据，并返回结构一致的结果
 */
public abstract class AbstractDataMiner {

    /**
     * 抽取数据
     *
     * @param inputStream 输入流
     * @return 原始数据
     */
    protected abstract RawData extractData(InputStream inputStream);

    /**
     * 解析数据
     *
     * @param rawData 原始数据
     * @return 解析转换后的数据
     */
    protected abstract Data parseData(RawData rawData);

    /**
     * 分析数据
     *
     * @param data 解析转换后的数据
     * @return 分析后的数据
     */
    protected abstract Analysis analyzeData(Data data);

    /**
     * 生成报告
     *
     * @param analysis 分析后的数据
     * @return 报告
     */
    protected abstract Report buildReport(Analysis analysis);

    /**
     * 钩子方法，通过继承可以改变返回值，从而影响模板方法的执行
     *
     * @return
     */
    protected boolean isReport() {
        return true;
    }

    /**
     * 模板方法
     *
     * @param path
     * @return
     */
    public Report mine(String path) {

        // 打开文件
        InputStream inputStream = this.openFile(path);
        // 抽取数据
        RawData rawData = this.extractData(inputStream);
        // 解析数据
        Data data = this.parseData(rawData);
        // 分析数据
        Analysis analysis = this.analyzeData(data);

        Report report = null;
        // 钩子方法
        if (this.isReport()) {
            // 生成报告
            report = this.buildReport(analysis);
        }
        // 关闭文件
        this.closeFile(inputStream);

        return report;
    }


    public InputStream openFile(String path) {
        try {
            return new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void closeFile(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

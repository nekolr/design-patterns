package com.nekolr.templatemethod;

import java.io.InputStream;

public class DocDataMiner extends AbstractDataMiner {

    @Override
    public RawData extractData(InputStream inputStream) {
        return null;
    }

    @Override
    public Data parseData(RawData rawData) {
        return null;
    }

    @Override
    public Analysis analyzeData(Data data) {
        return null;
    }

    @Override
    public Report buildReport(Analysis analysis) {
        return null;
    }

    @Override
    public boolean isReport() {
        return false;
    }
}

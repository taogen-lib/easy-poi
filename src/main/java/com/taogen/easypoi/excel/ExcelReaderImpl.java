package com.taogen.easypoi.excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author Taogen
 */
public class ExcelReaderImpl implements ExcelReader{
    @Override
    public <T> List<T> readExcel(InputStream inputStream, Class<T> clazz) throws IOException {
        Workbook workbook = new XSSFWorkbook(inputStream);

        return null;
    }

    @Override
    public <T> void readAndConsume(InputStream inputStream, Class<T> clazz, Consumer<T> consumer) {

    }

    @Override
    public <T> void readAndBatchConsume(InputStream inputStream, Class<T> clazz, Consumer<List<T>> consumer, int batchSize) {

    }

    @Override
    public <T, R> List<R> readAndDo(InputStream inputStream, Class<T> clazz, Function<T, R> function) {
        return null;
    }

    @Override
    public <T, R> List<R> readAndBatchDo(InputStream inputStream, Class<T> clazz, Function<List<T>, List<R>> function, int batchSize) {
        return null;
    }
}

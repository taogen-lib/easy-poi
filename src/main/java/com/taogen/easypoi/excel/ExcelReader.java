package com.taogen.easypoi.excel;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author Taogen
 */
public interface ExcelReader {
    <T> List<T> readExcel(InputStream inputStream, Class<T> clazz) throws IOException;

    <T> void readAndConsume(InputStream inputStream, Class<T> clazz, Consumer<T> consumer);

    <T> void readAndBatchConsume(InputStream inputStream, Class<T> clazz, Consumer<List<T>> consumer, int batchSize);

    <T, R> List<R> readAndDo(InputStream inputStream, Class<T> clazz, Function<T, R> function);

    <T, R> List<R> readAndBatchDo(InputStream inputStream, Class<T> clazz, Function<List<T>, List<R>> function, int batchSize);
}

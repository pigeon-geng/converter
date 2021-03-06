package com.hebaibai.converter.reader;

import com.hebaibai.converter.DataEnum;
import com.hebaibai.converter.FreeMarkerFtl;

import java.io.InputStream;
import java.util.Set;

/**
 * 报文数据解析
 */
public interface DataReader {

    /**
     * 读取数据
     *
     * @param stringData
     * @return
     */
    void read(String stringData) throws Exception;

    /**
     * 读取流中的数据
     *
     * @param inputStream
     * @return
     * @throws Exception
     */
    void read(InputStream inputStream) throws Exception;

    /**
     * 获取数据的所有节点名称
     *
     * @return
     */
    Set<String> getDataNodeNames();

    /**
     * 设置数据转换枚举
     *
     * @param dataEnum
     */
    void setDataEnum(DataEnum dataEnum);

    /**
     * 根据freemarker 模板装换数据
     *
     * @param ftl
     * @return
     */
    String converterFormat(FreeMarkerFtl ftl) throws Exception;
}

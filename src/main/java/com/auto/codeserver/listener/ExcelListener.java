package com.auto.codeserver.listener;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.auto.codeserver.listener.ExcelListener.ExcelData;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ExcelListener
 * @Description excel 解析监听器
 * @Author xudong.liao
 * @Date 2021/8/25 13:20
 * @Version 1.0
 **/
public class ExcelListener extends AnalysisEventListener<ExcelData> {

    /**
     * 自定义用于暂时存储data
     * 可以通过实例获取该值
     */
    private List<ExcelData> datas = new ArrayList<>();

    /**
     * 每解析一行都会回调invoke()方法
     *
     * @param context 内容
     */
    @Override
    public void invoke(ExcelData data, AnalysisContext context) {
        //数据存储到list，供批量处理，或后续自己业务逻辑处理。
        datas.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        //解析结束销毁不用的资源
        //注意不要调用datas.clear(),否则getDatas为null
    }

    static class ExcelData{

    }

    /**
     * 根据excel输入流，读取excel文件
     *
     * @return 返回双重list的集合
     **/
    public static void writeWithoutHead() {
        ExcelListener listener = new ExcelListener();
        EasyExcel.read("D:\\work\\idhub\\金融公司合作经销商(1)(1).xls", ExcelData.class, listener).sheet().doRead();
    }

}

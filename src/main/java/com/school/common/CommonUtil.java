package com.school.common;

import com.school.bean.po.ResultPlus;

import java.util.Map;

public class CommonUtil {
    /**
     * 请求成功
     * @param code 编码
     * @param data 数据
     * @return ResultPlus
     */
    public static ResultPlus requestSuccess(String code, Object data) {
        ResultPlus resultPlus = new ResultPlus();
        resultPlus.setCode(code);
        resultPlus.setData(data);
        return resultPlus;
    }

    /**
     * 请求失败
     * @return ResultPlus
     */
    public static ResultPlus requestError() {
        ResultPlus resultPlus = new ResultPlus();
        resultPlus.setCode("0");
        resultPlus.setData(null);
        return resultPlus;
    }

    /**
     * 分页查询成功
     * @param total 总数
     * @param pageSize 每页大小
     * @param pageIndex 页码
     * @param data 数据
     * @return ResultPlus
     */
    public static ResultPlus pageRequestSuccess(int total, Integer pageSize, Integer pageIndex, Object data) {
        ResultPlus result = new ResultPlus();
        result.setCode("1");
        result.setData(data);
        result.setTotal(total);
        result.setPageSize(pageSize);
        result.setPageIndex(pageIndex);
        return result;
    }
}

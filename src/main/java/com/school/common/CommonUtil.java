package com.school.common;

import com.school.bean.po.ResultPlus;

public class CommonUtil {
    // 请求成功
    public static ResultPlus requestSuccess(String code, Object data) {
        ResultPlus resultPlus = new ResultPlus();
        resultPlus.setStatus(code);
        resultPlus.setData(data);
        return resultPlus;
    }

    // 请求失败
    public static ResultPlus requestError() {
        ResultPlus resultPlus = new ResultPlus();
        resultPlus.setStatus("0");
        resultPlus.setData(null);
        return resultPlus;
    }
}

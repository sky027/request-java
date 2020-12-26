package com.school.bean.po;

public class ResultPlus {

    // 状态码
    private String code;

    // 数据
    private Object data;

    // 页码
    private Integer pageIndex;

    // 每页大小
    private Integer pageSize;

    // 总数
    private Integer total;

    public ResultPlus() {

    }


    public ResultPlus(String code, Object data, Integer pageIndex, Integer pageSize, Integer total) {
        this.code = code;
        this.data = data;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.total = total;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ResultPlus{" +
                "code='" + code + '\'' +
                ", data=" + data +
                ", pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", total=" + total +
                '}';
    }
}

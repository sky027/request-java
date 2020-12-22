package com.school.bean.po;

public class ResultPlus {

    private String status;

    private Object data;

    public ResultPlus() {

    }


    public ResultPlus(String status, Object data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultPlus{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}

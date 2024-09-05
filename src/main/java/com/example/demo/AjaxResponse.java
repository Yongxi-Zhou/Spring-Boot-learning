package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AjaxResponse {
    private int code;
    private boolean isOK;
    private String msg;
    private Object data;

    public static AjaxResponse success(Object data) {
        AjaxResponse resp = new AjaxResponse();
        resp.setCode(200);
        resp.setOK(true);
        resp.setData(data);
        resp.setMsg("success!!!!");
        return resp;
    }
}

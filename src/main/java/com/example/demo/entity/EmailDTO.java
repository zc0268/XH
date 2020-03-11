package com.example.demo.entity;


import lombok.Data;

@Data
public class EmailDTO {
    private String recipients;//收件人
    private String recipientsCode;//收件人账号
    private String EmailContent;//邮件内容

}

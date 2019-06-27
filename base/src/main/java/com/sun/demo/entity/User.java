package com.sun.demo.entity;


import javax.persistence.*;

/***
 *  java类简单作用描述.
 * @ClassName: User
 * @Description:
 * @author :   helloWorld
 * @CreateDate: 2019/5/31 15:33
 * @Version: 1.0
 * <p>Copyrigth:Baosight Software LTD.co Copyright (c) 2019</p>
 *
 */

@Table(name = "user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id = 0L;/*ID*/
    @Basic
    @Column(name = "REC_CREATOR", columnDefinition = "varchar(64) COMMENT '创建人' ")
    private String recCreator = " "; /*记录创建者*/
    @Basic
    @Column(name = "REC_CREATE_TIME", columnDefinition = "varchar(20) COMMENT '创建时间'")
    private String recCreateTime = " ";/*记录创建时间*/
    @Basic
    @Column(name = "REC_REVISTOR", columnDefinition = "varchar(64) COMMENT '修改人'")
    private String recRevistor = " ";/*记录修改人*/
    @Basic
    @Column(name = "RECREVISE_TIME", columnDefinition = "varchar(20) COMMENT '修改时间'")
    private String recreviseTime = " ";/*记录修改时间*/
    @Basic
    @Column(name = "LOGIN_ID", columnDefinition = "varchar(64) COMMENT '登录ID'")
    private String loginId = " ";/*登录ID*/
    @Basic
    @Column(name = "LOGIN_NAME",  columnDefinition = "varchar(200) COMMENT '登录名'")
    private String loginName = " ";/*登录名*/
    @Basic
    @Column(name = "PASSWORD",  columnDefinition = "varchar(20) COMMENT '密码'")
    private String password = " ";/*密码*/
    @Basic
    @Column(name = "PHONE", columnDefinition = " varchar(15) COMMENT '电话' DEFAULT '10086' ")
    private String phone = " ";/*电话*/


    public String getRecCreateTime() {
        return recCreateTime;
    }

    public void setRecCreateTime(String recCreateTime) {
        this.recCreateTime = recCreateTime;
    }


    public String getRecRevistor() {
        return recRevistor;
    }

    public void setRecRevistor(String recRevistor) {
        this.recRevistor = recRevistor;
    }


    public String getRecreviseTime() {
        return recreviseTime;
    }

    public void setRecreviseTime(String recreviseTime) {
        this.recreviseTime = recreviseTime;
    }


    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecCreator() {
        return recCreator;
    }

    public void setRecCreator(String recCreator) {
        this.recCreator = recCreator;
    }
}

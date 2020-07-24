package com.guoqingxian.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

@TableName(value = "category")
public class Category implements Serializable {
    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    @TableField(value = "cname")
    private String cname;

    @TableField(value = "ccount")
    private Integer ccount;

    private static final long serialVersionUID = 1L;

    public static final String COL_CID = "cid";

    public static final String COL_CNAME = "cname";

    public static final String COL_CCOUNT = "ccount";

    /**
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * @return cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * @param cname
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * @return ccount
     */
    public Integer getCcount() {
        return ccount;
    }

    /**
     * @param ccount
     */
    public void setCcount(Integer ccount) {
        this.ccount = ccount;
    }
}
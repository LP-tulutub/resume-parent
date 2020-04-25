package com.lp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Goods implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.GOODS_NAME
     *
     * @mbg.generated
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.GOODS_TITLE
     *
     * @mbg.generated
     */
    private String goodsTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.GOODS_IMG
     *
     * @mbg.generated
     */
    private String goodsImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.GOODS_PRICE
     *
     * @mbg.generated
     */
    private BigDecimal goodsPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.GOODS_STOCK
     *
     * @mbg.generated
     */
    private Integer goodsStock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods._SLOT
     *
     * @mbg.generated
     */
    private String slot;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.GOODS_DETAIL
     *
     * @mbg.generated
     */
    private String goodsDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.ID
     *
     * @return the value of goods.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.ID
     *
     * @param id the value for goods.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.GOODS_NAME
     *
     * @return the value of goods.GOODS_NAME
     *
     * @mbg.generated
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.GOODS_NAME
     *
     * @param goodsName the value for goods.GOODS_NAME
     *
     * @mbg.generated
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.GOODS_TITLE
     *
     * @return the value of goods.GOODS_TITLE
     *
     * @mbg.generated
     */
    public String getGoodsTitle() {
        return goodsTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.GOODS_TITLE
     *
     * @param goodsTitle the value for goods.GOODS_TITLE
     *
     * @mbg.generated
     */
    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle == null ? null : goodsTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.GOODS_IMG
     *
     * @return the value of goods.GOODS_IMG
     *
     * @mbg.generated
     */
    public String getGoodsImg() {
        return goodsImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.GOODS_IMG
     *
     * @param goodsImg the value for goods.GOODS_IMG
     *
     * @mbg.generated
     */
    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.GOODS_PRICE
     *
     * @return the value of goods.GOODS_PRICE
     *
     * @mbg.generated
     */
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.GOODS_PRICE
     *
     * @param goodsPrice the value for goods.GOODS_PRICE
     *
     * @mbg.generated
     */
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.GOODS_STOCK
     *
     * @return the value of goods.GOODS_STOCK
     *
     * @mbg.generated
     */
    public Integer getGoodsStock() {
        return goodsStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.GOODS_STOCK
     *
     * @param goodsStock the value for goods.GOODS_STOCK
     *
     * @mbg.generated
     */
    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods._SLOT
     *
     * @return the value of goods._SLOT
     *
     * @mbg.generated
     */
    public String getSlot() {
        return slot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods._SLOT
     *
     * @param slot the value for goods._SLOT
     *
     * @mbg.generated
     */
    public void setSlot(String slot) {
        this.slot = slot == null ? null : slot.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.GOODS_DETAIL
     *
     * @return the value of goods.GOODS_DETAIL
     *
     * @mbg.generated
     */
    public String getGoodsDetail() {
        return goodsDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.GOODS_DETAIL
     *
     * @param goodsDetail the value for goods.GOODS_DETAIL
     *
     * @mbg.generated
     */
    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail == null ? null : goodsDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsTitle=").append(goodsTitle);
        sb.append(", goodsImg=").append(goodsImg);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsStock=").append(goodsStock);
        sb.append(", slot=").append(slot);
        sb.append(", goodsDetail=").append(goodsDetail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
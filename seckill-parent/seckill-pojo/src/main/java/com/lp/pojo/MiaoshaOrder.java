package com.lp.pojo;

import java.io.Serializable;

public class MiaoshaOrder implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miaosha_order.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miaosha_order.USER_ID
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miaosha_order.ORDER_ID
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miaosha_order.GOODS_ID
     *
     * @mbg.generated
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miaosha_order._SLOT
     *
     * @mbg.generated
     */
    private String slot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miaosha_order
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miaosha_order.ID
     *
     * @return the value of miaosha_order.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miaosha_order.ID
     *
     * @param id the value for miaosha_order.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miaosha_order.USER_ID
     *
     * @return the value of miaosha_order.USER_ID
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miaosha_order.USER_ID
     *
     * @param userId the value for miaosha_order.USER_ID
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miaosha_order.ORDER_ID
     *
     * @return the value of miaosha_order.ORDER_ID
     *
     * @mbg.generated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miaosha_order.ORDER_ID
     *
     * @param orderId the value for miaosha_order.ORDER_ID
     *
     * @mbg.generated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miaosha_order.GOODS_ID
     *
     * @return the value of miaosha_order.GOODS_ID
     *
     * @mbg.generated
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miaosha_order.GOODS_ID
     *
     * @param goodsId the value for miaosha_order.GOODS_ID
     *
     * @mbg.generated
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miaosha_order._SLOT
     *
     * @return the value of miaosha_order._SLOT
     *
     * @mbg.generated
     */
    public String getSlot() {
        return slot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miaosha_order._SLOT
     *
     * @param slot the value for miaosha_order._SLOT
     *
     * @mbg.generated
     */
    public void setSlot(String slot) {
        this.slot = slot == null ? null : slot.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miaosha_order
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
        sb.append(", userId=").append(userId);
        sb.append(", orderId=").append(orderId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", slot=").append(slot);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
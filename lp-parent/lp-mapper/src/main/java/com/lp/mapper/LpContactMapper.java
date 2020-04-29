package com.lp.mapper;

import com.lp.pojo.LpContact;
import com.lp.pojo.LpContactExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LpContactMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_contact
     *
     * @mbg.generated
     */
    long countByExample(LpContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_contact
     *
     * @mbg.generated
     */
    int deleteByExample(LpContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_contact
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_contact
     *
     * @mbg.generated
     */
    int insert(LpContact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_contact
     *
     * @mbg.generated
     */
    int insertSelective(LpContact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_contact
     *
     * @mbg.generated
     */
    List<LpContact> selectByExample(LpContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_contact
     *
     * @mbg.generated
     */
    LpContact selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_contact
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LpContact record, @Param("example") LpContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_contact
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LpContact record, @Param("example") LpContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_contact
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LpContact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_contact
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LpContact record);
}
package com.lp.mapper;

import com.lp.pojo.LpBase;
import com.lp.pojo.LpBaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LpBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_base
     *
     * @mbg.generated
     */
    long countByExample(LpBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_base
     *
     * @mbg.generated
     */
    int deleteByExample(LpBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_base
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_base
     *
     * @mbg.generated
     */
    int insert(LpBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_base
     *
     * @mbg.generated
     */
    int insertSelective(LpBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_base
     *
     * @mbg.generated
     */
    List<LpBase> selectByExample(LpBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_base
     *
     * @mbg.generated
     */
    LpBase selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_base
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LpBase record, @Param("example") LpBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_base
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LpBase record, @Param("example") LpBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_base
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LpBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_base
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LpBase record);
}
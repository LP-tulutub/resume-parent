package com.lp.mapper;

import com.lp.pojo.LpSchool;
import com.lp.pojo.LpSchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LpSchoolMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_school
     *
     * @mbg.generated
     */
    long countByExample(LpSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_school
     *
     * @mbg.generated
     */
    int deleteByExample(LpSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_school
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_school
     *
     * @mbg.generated
     */
    int insert(LpSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_school
     *
     * @mbg.generated
     */
    int insertSelective(LpSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_school
     *
     * @mbg.generated
     */
    List<LpSchool> selectByExample(LpSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_school
     *
     * @mbg.generated
     */
    LpSchool selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_school
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LpSchool record, @Param("example") LpSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_school
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LpSchool record, @Param("example") LpSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_school
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LpSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_school
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LpSchool record);
}
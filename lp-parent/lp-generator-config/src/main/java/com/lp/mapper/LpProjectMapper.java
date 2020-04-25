package com.lp.mapper;

import com.lp.pojo.LpProject;
import com.lp.pojo.LpProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LpProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_project
     *
     * @mbg.generated
     */
    long countByExample(LpProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_project
     *
     * @mbg.generated
     */
    int deleteByExample(LpProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_project
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_project
     *
     * @mbg.generated
     */
    int insert(LpProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_project
     *
     * @mbg.generated
     */
    int insertSelective(LpProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_project
     *
     * @mbg.generated
     */
    List<LpProject> selectByExample(LpProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_project
     *
     * @mbg.generated
     */
    LpProject selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_project
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LpProject record, @Param("example") LpProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_project
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LpProject record, @Param("example") LpProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_project
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LpProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_project
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LpProject record);
}
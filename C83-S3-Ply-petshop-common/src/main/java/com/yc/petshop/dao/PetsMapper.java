package com.yc.petshop.dao;

import com.yc.petshop.bean.Pets;
import com.yc.petshop.bean.PetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PetsMapper {
    long countByExample(PetsExample example);

    int deleteByExample(PetsExample example);

    int insert(Pets record);

    int insertSelective(Pets record);

    List<Pets> selectByExample(PetsExample example);

    int updateByExampleSelective(@Param("record") Pets record, @Param("example") PetsExample example);

    int updateByExample(@Param("record") Pets record, @Param("example") PetsExample example);
}
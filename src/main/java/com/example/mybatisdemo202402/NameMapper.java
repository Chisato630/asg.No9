package com.example.mybatisdemo202402;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NameMapper {

    @Select("SELECT * FROM names WHERE name LIKE CONCAT(#{prefix}, '%') AND name LIKE CONCAT('%',#{suffix}) AND name LIKE CONCAT('%',#{keyword},'%')")
    List<Name> findNames(String prefix, String suffix, String keyword);
}
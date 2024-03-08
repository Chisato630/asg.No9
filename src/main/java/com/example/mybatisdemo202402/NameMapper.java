package com.example.mybatisdemo202402;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface NameMapper {

    @Select("SELECT * FROM names WHERE name LIKE CONCAT(#{prefix}, '%') AND name LIKE CONCAT('%',#{suffix}) AND name LIKE CONCAT('%',#{keyword},'%')")
    List<Name> findNames(String prefix, String suffix, String keyword);

    @Select("SELECT * FROM names WHERE id = #{id}")
    Optional<Name> findById(int id);    // Optional:findByIdの返り値
}
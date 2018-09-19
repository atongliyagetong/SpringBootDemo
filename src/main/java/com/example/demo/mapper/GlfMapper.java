package com.example.demo.mapper;

import com.example.demo.domain.Glf;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public interface GlfMapper {
    @Select("select * from ck_glf where bfh=#{bfh}")
    Glf findGlf(@Param("bfh") String bfh);

    @Select("select * from ck_glf ")
    Collection<Glf> findGlfAll();
}

package com.davidchoi.vocaApi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.davidchoi.vocaApi.dto.VocaDTO;


@Mapper
public interface VocaDAO {
	List<VocaDTO> getVocaList();
	List<VocaDTO> getVocaById(String id);
}

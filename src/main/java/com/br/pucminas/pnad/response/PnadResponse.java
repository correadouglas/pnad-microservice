package com.br.pucminas.pnad.response;

import java.util.List;

import com.br.pucminas.pnad.model.Pnad;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PnadResponse {
	
	private Integer quantidade;
	private List<Pnad> microdados;

}

package com.br.pucminas.pnad.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.br.pucminas.pnad.model.Pnad;

public class PnadRowMapper implements RowMapper<Pnad> {

	@Override
	public Pnad mapRow(ResultSet resultSet, int rowNumber) throws SQLException {

		PnadResultSetExtractor extractor = new PnadResultSetExtractor();
		
		return extractor.extractData(resultSet);
		
	}
	
}

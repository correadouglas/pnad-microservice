package com.br.pucminas.pnad.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.br.pucminas.pnad.extractor.PnadRowMapper;
import com.br.pucminas.pnad.model.Pnad;
import com.br.pucminas.pnad.repository.PnadRepository;

@Component
public class PnadDao extends BaseCrudDao<Pnad> {

	@Autowired
	private PnadRepository repository;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	protected PnadRepository getRepository() {
		return this.repository;
	}

	public List<Pnad> pesquisar(Integer limiteRegistros, Pnad pnad) {

		StringBuilder sql = new StringBuilder()
				.append(" select * from pnad.microdados p ")
				.append(" where 1 = 1 ");

		List<Object> params = new ArrayList<>();
		
		adicionarFiltros(sql, params, limiteRegistros, pnad);
		
		return this.jdbcTemplate.query(sql.toString(), params.toArray(), new PnadRowMapper());

	}
	
	private void adicionarFiltros(StringBuilder sql, List<Object> params, Integer limiteRegistros, Pnad pnad) {
		
		if (pnad.getAno() != null) {
			params.add(pnad.getAno());
			sql.append(" and p.ano = ? ");
		}

		if (pnad.getTrimestre() != null) {
			params.add(pnad.getTrimestre());
			sql.append(" and p.trimestre = ? ");
		}

		if (pnad.getUf() != null) {
			params.add(pnad.getUf());
			sql.append(" and p.uf = ? ");
		}

		if (pnad.getCapital() != null) {
			params.add(pnad.getCapital());
			sql.append(" and p.capital = ? ");
		}

		if (pnad.getRm_ride() != null) {
			params.add(pnad.getRm_ride());
			sql.append(" and p.rm_ride = ? ");
		}

		if (pnad.getUpa() != null) {
			params.add(pnad.getUpa());
			sql.append(" and p.upa = ? ");
		}

		if (pnad.getEstrato() != null) {
			params.add(pnad.getEstrato());
			sql.append(" and p.estrato = ? ");
		}

		if (pnad.getV1008() != null) {
			params.add(pnad.getV1008());
			sql.append(" and p.v1008 = ? ");
		}

		if (pnad.getV1014() != null) {
			params.add(pnad.getV1014());
			sql.append(" and p.v1014 = ? ");
		}

		if (pnad.getV1016() != null) {
			params.add(pnad.getV1016());
			sql.append(" and p.v1016 = ? ");
		}

		if (pnad.getV1022() != null) {
			params.add(pnad.getV1022());
			sql.append(" and p.v1022 = ? ");
		}

		if (pnad.getV1023() != null) {
			params.add(pnad.getV1023());
			sql.append(" and p.v1023 = ? ");
		}

		if (pnad.getV1027() != null) {
			params.add(pnad.getV1027());
			sql.append(" and p.v1027 = ? ");
		}

		if (pnad.getV1028() != null) {
			params.add(pnad.getV1028());
			sql.append(" and p.v1028 = ? ");
		}

		if (pnad.getV1029() != null) {
			params.add(pnad.getV1029());
			sql.append(" and p.v1029 = ? ");
		}

		if (pnad.getPosest() != null) {
			params.add(pnad.getPosest());
			sql.append(" and p.posest = ? ");
		}

		if (pnad.getV2001() != null) {
			params.add(pnad.getV2001());
			sql.append(" and p.v2001 = ? ");
		}

		if (pnad.getV2003() != null) {
			params.add(pnad.getV2003());
			sql.append(" and p.v2003 = ? ");
		}

		if (pnad.getV2005() != null) {
			params.add(pnad.getV2005());
			sql.append(" and p.v2005 = ? ");
		}

		if (pnad.getV2007() != null) {
			params.add(pnad.getV2007());
			sql.append(" and p.v2007 = ? ");
		}

		if (pnad.getV2008() != null) {
			params.add(pnad.getV2008());
			sql.append(" and p.v2008 = ? ");
		}

		if (pnad.getV20081() != null) {
			params.add(pnad.getV20081());
			sql.append(" and p.v20081 = ? ");
		}

		if (pnad.getV20082() != null) {
			params.add(pnad.getV20082());
			sql.append(" and p.v20082 = ? ");
		}

		if (pnad.getV2009() != null) {
			params.add(pnad.getV2009());
			sql.append(" and p.v2009 = ? ");
		}

		if (pnad.getV2010() != null) {
			params.add(pnad.getV2010());
			sql.append(" and p.v2010 = ? ");
		}

		if (pnad.getV3001() != null) {
			params.add(pnad.getV3001());
			sql.append(" and p.v3001 = ? ");
		}

		if (pnad.getV3002() != null) {
			params.add(pnad.getV3002());
			sql.append(" and p.v3002 = ? ");
		}

		if (pnad.getV3002a() != null) {
			params.add(pnad.getV3002a());
			sql.append(" and p.v3002a = ? ");
		}

		if (pnad.getV3003() != null) {
			params.add(pnad.getV3003());
			sql.append(" and p.v3003 = ? ");
		}

		if (pnad.getV3003a() != null) {
			params.add(pnad.getV3003a());
			sql.append(" and p.v3003a = ? ");
		}

		if (pnad.getV3004() != null) {
			params.add(pnad.getV3004());
			sql.append(" and p.v3004 = ? ");
		}

		if (pnad.getV3005() != null) {
			params.add(pnad.getV3005());
			sql.append(" and p.v3005 = ? ");
		}

		if (pnad.getV3005a() != null) {
			params.add(pnad.getV3005a());
			sql.append(" and p.v3005a = ? ");
		}

		if (pnad.getV3006() != null) {
			params.add(pnad.getV3006());
			sql.append(" and p.v3006 = ? ");
		}

		if (pnad.getV3007() != null) {
			params.add(pnad.getV3007());
			sql.append(" and p.v3007 = ? ");
		}

		if (pnad.getV3008() != null) {
			params.add(pnad.getV3008());
			sql.append(" and p.v3008 = ? ");
		}

		if (pnad.getV3009() != null) {
			params.add(pnad.getV3009());
			sql.append(" and p.v3009 = ? ");
		}

		if (pnad.getV3009a() != null) {
			params.add(pnad.getV3009a());
			sql.append(" and p.v3009a = ? ");
		}

		if (pnad.getV3010() != null) {
			params.add(pnad.getV3010());
			sql.append(" and p.v3010 = ? ");
		}

		if (pnad.getV3011() != null) {
			params.add(pnad.getV3011());
			sql.append(" and p.v3011 = ? ");
		}

		if (pnad.getV3011a() != null) {
			params.add(pnad.getV3011a());
			sql.append(" and p.v3011a = ? ");
		}

		if (pnad.getV3012() != null) {
			params.add(pnad.getV3012());
			sql.append(" and p.v3012 = ? ");
		}

		if (pnad.getV3013() != null) {
			params.add(pnad.getV3013());
			sql.append(" and p.v3013 = ? ");
		}

		if (pnad.getV3014() != null) {
			params.add(pnad.getV3014());
			sql.append(" and p.v3014 = ? ");
		}

		if (pnad.getV4001() != null) {
			params.add(pnad.getV4001());
			sql.append(" and p.v4001 = ? ");
		}

		if (pnad.getV4002() != null) {
			params.add(pnad.getV4002());
			sql.append(" and p.v4002 = ? ");
		}

		if (pnad.getV4003() != null) {
			params.add(pnad.getV4003());
			sql.append(" and p.v4003 = ? ");
		}

		if (pnad.getV4004() != null) {
			params.add(pnad.getV4004());
			sql.append(" and p.v4004 = ? ");
		}

		if (pnad.getV4005() != null) {
			params.add(pnad.getV4005());
			sql.append(" and p.v4005 = ? ");
		}

		if (pnad.getV4006() != null) {
			params.add(pnad.getV4006());
			sql.append(" and p.v4006 = ? ");
		}

		if (pnad.getV4006a() != null) {
			params.add(pnad.getV4006a());
			sql.append(" and p.v4006a = ? ");
		}

		if (pnad.getV4007() != null) {
			params.add(pnad.getV4007());
			sql.append(" and p.v4007 = ? ");
		}

		if (pnad.getV4008() != null) {
			params.add(pnad.getV4008());
			sql.append(" and p.v4008 = ? ");
		}

		if (pnad.getV40081() != null) {
			params.add(pnad.getV40081());
			sql.append(" and p.v40081 = ? ");
		}

		if (pnad.getV40082() != null) {
			params.add(pnad.getV40082());
			sql.append(" and p.v40082 = ? ");
		}

		if (pnad.getV40083() != null) {
			params.add(pnad.getV40083());
			sql.append(" and p.v40083 = ? ");
		}

		if (pnad.getV4009() != null) {
			params.add(pnad.getV4009());
			sql.append(" and p.v4009 = ? ");
		}

		if (pnad.getV4010() != null) {
			params.add(pnad.getV4010());
			sql.append(" and p.v4010 = ? ");
		}

		if (pnad.getV4012() != null) {
			params.add(pnad.getV4012());
			sql.append(" and p.v4012 = ? ");
		}

		if (pnad.getV40121() != null) {
			params.add(pnad.getV40121());
			sql.append(" and p.v40121 = ? ");
		}

		if (pnad.getV4013() != null) {
			params.add(pnad.getV4013());
			sql.append(" and p.v4013 = ? ");
		}

		if (pnad.getV40132() != null) {
			params.add(pnad.getV40132());
			sql.append(" and p.v40132 = ? ");
		}

		if (pnad.getV40132a() != null) {
			params.add(pnad.getV40132a());
			sql.append(" and p.v40132a = ? ");
		}

		if (pnad.getV4014() != null) {
			params.add(pnad.getV4014());
			sql.append(" and p.v4014 = ? ");
		}

		if (pnad.getV4015() != null) {
			params.add(pnad.getV4015());
			sql.append(" and p.v4015 = ? ");
		}

		if (pnad.getV40151() != null) {
			params.add(pnad.getV40151());
			sql.append(" and p.v40151 = ? ");
		}

		if (pnad.getV401511() != null) {
			params.add(pnad.getV401511());
			sql.append(" and p.v401511 = ? ");
		}

		if (pnad.getV401512() != null) {
			params.add(pnad.getV401512());
			sql.append(" and p.v401512 = ? ");
		}

		if (pnad.getV4016() != null) {
			params.add(pnad.getV4016());
			sql.append(" and p.v4016 = ? ");
		}

		if (pnad.getV40161() != null) {
			params.add(pnad.getV40161());
			sql.append(" and p.v40161 = ? ");
		}

		if (pnad.getV40162() != null) {
			params.add(pnad.getV40162());
			sql.append(" and p.v40162 = ? ");
		}

		if (pnad.getV40163() != null) {
			params.add(pnad.getV40163());
			sql.append(" and p.v40163 = ? ");
		}

		if (pnad.getV4017() != null) {
			params.add(pnad.getV4017());
			sql.append(" and p.v4017 = ? ");
		}

		if (pnad.getV40171() != null) {
			params.add(pnad.getV40171());
			sql.append(" and p.v40171 = ? ");
		}

		if (pnad.getV401711() != null) {
			params.add(pnad.getV401711());
			sql.append(" and p.v401711 = ? ");
		}

		if (pnad.getV4018() != null) {
			params.add(pnad.getV4018());
			sql.append(" and p.v4018 = ? ");
		}

		if (pnad.getV40181() != null) {
			params.add(pnad.getV40181());
			sql.append(" and p.v40181 = ? ");
		}

		if (pnad.getV40182() != null) {
			params.add(pnad.getV40182());
			sql.append(" and p.v40182 = ? ");
		}

		if (pnad.getV40183() != null) {
			params.add(pnad.getV40183());
			sql.append(" and p.v40183 = ? ");
		}

		if (pnad.getV4019() != null) {
			params.add(pnad.getV4019());
			sql.append(" and p.v4019 = ? ");
		}

		if (pnad.getV4024() != null) {
			params.add(pnad.getV4024());
			sql.append(" and p.v4024 = ? ");
		}

		if (pnad.getV4025() != null) {
			params.add(pnad.getV4025());
			sql.append(" and p.v4025 = ? ");
		}

		if (pnad.getV4026() != null) {
			params.add(pnad.getV4026());
			sql.append(" and p.v4026 = ? ");
		}

		if (pnad.getV4027() != null) {
			params.add(pnad.getV4027());
			sql.append(" and p.v4027 = ? ");
		}

		if (pnad.getV4028() != null) {
			params.add(pnad.getV4028());
			sql.append(" and p.v4028 = ? ");
		}

		if (pnad.getV4029() != null) {
			params.add(pnad.getV4029());
			sql.append(" and p.v4029 = ? ");
		}

		if (pnad.getV4032() != null) {
			params.add(pnad.getV4032());
			sql.append(" and p.v4032 = ? ");
		}

		if (pnad.getV4033() != null) {
			params.add(pnad.getV4033());
			sql.append(" and p.v4033 = ? ");
		}

		if (pnad.getV40331() != null) {
			params.add(pnad.getV40331());
			sql.append(" and p.v40331 = ? ");
		}

		if (pnad.getV403311() != null) {
			params.add(pnad.getV403311());
			sql.append(" and p.v403311 = ? ");
		}

		if (pnad.getV403312() != null) {
			params.add(pnad.getV403312());
			sql.append(" and p.v403312 = ? ");
		}

		if (pnad.getV40332() != null) {
			params.add(pnad.getV40332());
			sql.append(" and p.v40332 = ? ");
		}

		if (pnad.getV403321() != null) {
			params.add(pnad.getV403321());
			sql.append(" and p.v403321 = ? ");
		}

		if (pnad.getV403322() != null) {
			params.add(pnad.getV403322());
			sql.append(" and p.v403322 = ? ");
		}

		if (pnad.getV40333() != null) {
			params.add(pnad.getV40333());
			sql.append(" and p.v40333 = ? ");
		}

		if (pnad.getV403331() != null) {
			params.add(pnad.getV403331());
			sql.append(" and p.v403331 = ? ");
		}

		if (pnad.getV4034() != null) {
			params.add(pnad.getV4034());
			sql.append(" and p.v4034 = ? ");
		}

		if (pnad.getV40341() != null) {
			params.add(pnad.getV40341());
			sql.append(" and p.v40341 = ? ");
		}

		if (pnad.getV403411() != null) {
			params.add(pnad.getV403411());
			sql.append(" and p.v403411 = ? ");
		}

		if (pnad.getV403412() != null) {
			params.add(pnad.getV403412());
			sql.append(" and p.v403412 = ? ");
		}

		if (pnad.getV40342() != null) {
			params.add(pnad.getV40342());
			sql.append(" and p.v40342 = ? ");
		}

		if (pnad.getV403421() != null) {
			params.add(pnad.getV403421());
			sql.append(" and p.v403421 = ? ");
		}

		if (pnad.getV403422() != null) {
			params.add(pnad.getV403422());
			sql.append(" and p.v403422 = ? ");
		}

		if (pnad.getV4039() != null) {
			params.add(pnad.getV4039());
			sql.append(" and p.v4039 = ? ");
		}

		if (pnad.getV4039c() != null) {
			params.add(pnad.getV4039c());
			sql.append(" and p.v4039c = ? ");
		}

		if (pnad.getV4040() != null) {
			params.add(pnad.getV4040());
			sql.append(" and p.v4040 = ? ");
		}

		if (pnad.getV40401() != null) {
			params.add(pnad.getV40401());
			sql.append(" and p.v40401 = ? ");
		}

		if (pnad.getV40402() != null) {
			params.add(pnad.getV40402());
			sql.append(" and p.v40402 = ? ");
		}

		if (pnad.getV40403() != null) {
			params.add(pnad.getV40403());
			sql.append(" and p.v40403 = ? ");
		}

		if (pnad.getV4041() != null) {
			params.add(pnad.getV4041());
			sql.append(" and p.v4041 = ? ");
		}

		if (pnad.getV4043() != null) {
			params.add(pnad.getV4043());
			sql.append(" and p.v4043 = ? ");
		}

		if (pnad.getV40431() != null) {
			params.add(pnad.getV40431());
			sql.append(" and p.v40431 = ? ");
		}

		if (pnad.getV4044() != null) {
			params.add(pnad.getV4044());
			sql.append(" and p.v4044 = ? ");
		}

		if (pnad.getV4045() != null) {
			params.add(pnad.getV4045());
			sql.append(" and p.v4045 = ? ");
		}

		if (pnad.getV4046() != null) {
			params.add(pnad.getV4046());
			sql.append(" and p.v4046 = ? ");
		}

		if (pnad.getV4047() != null) {
			params.add(pnad.getV4047());
			sql.append(" and p.v4047 = ? ");
		}

		if (pnad.getV4048() != null) {
			params.add(pnad.getV4048());
			sql.append(" and p.v4048 = ? ");
		}

		if (pnad.getV4049() != null) {
			params.add(pnad.getV4049());
			sql.append(" and p.v4049 = ? ");
		}

		if (pnad.getV4050() != null) {
			params.add(pnad.getV4050());
			sql.append(" and p.v4050 = ? ");
		}

		if (pnad.getV40501() != null) {
			params.add(pnad.getV40501());
			sql.append(" and p.v40501 = ? ");
		}

		if (pnad.getV405011() != null) {
			params.add(pnad.getV405011());
			sql.append(" and p.v405011 = ? ");
		}

		if (pnad.getV405012() != null) {
			params.add(pnad.getV405012());
			sql.append(" and p.v405012 = ? ");
		}

		if (pnad.getV40502() != null) {
			params.add(pnad.getV40502());
			sql.append(" and p.v40502 = ? ");
		}

		if (pnad.getV405021() != null) {
			params.add(pnad.getV405021());
			sql.append(" and p.v405021 = ? ");
		}

		if (pnad.getV405022() != null) {
			params.add(pnad.getV405022());
			sql.append(" and p.v405022 = ? ");
		}

		if (pnad.getV40503() != null) {
			params.add(pnad.getV40503());
			sql.append(" and p.v40503 = ? ");
		}

		if (pnad.getV405031() != null) {
			params.add(pnad.getV405031());
			sql.append(" and p.v405031 = ? ");
		}

		if (pnad.getV4051() != null) {
			params.add(pnad.getV4051());
			sql.append(" and p.v4051 = ? ");
		}

		if (pnad.getV40511() != null) {
			params.add(pnad.getV40511());
			sql.append(" and p.v40511 = ? ");
		}

		if (pnad.getV405111() != null) {
			params.add(pnad.getV405111());
			sql.append(" and p.v405111 = ? ");
		}

		if (pnad.getV405112() != null) {
			params.add(pnad.getV405112());
			sql.append(" and p.v405112 = ? ");
		}

		if (pnad.getV40512() != null) {
			params.add(pnad.getV40512());
			sql.append(" and p.v40512 = ? ");
		}

		if (pnad.getV405121() != null) {
			params.add(pnad.getV405121());
			sql.append(" and p.v405121 = ? ");
		}

		if (pnad.getV405122() != null) {
			params.add(pnad.getV405122());
			sql.append(" and p.v405122 = ? ");
		}

		if (pnad.getV4056() != null) {
			params.add(pnad.getV4056());
			sql.append(" and p.v4056 = ? ");
		}

		if (pnad.getV4056c() != null) {
			params.add(pnad.getV4056c());
			sql.append(" and p.v4056c = ? ");
		}

		if (pnad.getV4057() != null) {
			params.add(pnad.getV4057());
			sql.append(" and p.v4057 = ? ");
		}

		if (pnad.getV4058() != null) {
			params.add(pnad.getV4058());
			sql.append(" and p.v4058 = ? ");
		}

		if (pnad.getV40581() != null) {
			params.add(pnad.getV40581());
			sql.append(" and p.v40581 = ? ");
		}

		if (pnad.getV405811() != null) {
			params.add(pnad.getV405811());
			sql.append(" and p.v405811 = ? ");
		}

		if (pnad.getV405812() != null) {
			params.add(pnad.getV405812());
			sql.append(" and p.v405812 = ? ");
		}

		if (pnad.getV40582() != null) {
			params.add(pnad.getV40582());
			sql.append(" and p.v40582 = ? ");
		}

		if (pnad.getV405821() != null) {
			params.add(pnad.getV405821());
			sql.append(" and p.v405821 = ? ");
		}

		if (pnad.getV405822() != null) {
			params.add(pnad.getV405822());
			sql.append(" and p.v405822 = ? ");
		}

		if (pnad.getV40583() != null) {
			params.add(pnad.getV40583());
			sql.append(" and p.v40583 = ? ");
		}

		if (pnad.getV405831() != null) {
			params.add(pnad.getV405831());
			sql.append(" and p.v405831 = ? ");
		}

		if (pnad.getV40584() != null) {
			params.add(pnad.getV40584());
			sql.append(" and p.v40584 = ? ");
		}

		if (pnad.getV4059() != null) {
			params.add(pnad.getV4059());
			sql.append(" and p.v4059 = ? ");
		}

		if (pnad.getV40591() != null) {
			params.add(pnad.getV40591());
			sql.append(" and p.v40591 = ? ");
		}

		if (pnad.getV405911() != null) {
			params.add(pnad.getV405911());
			sql.append(" and p.v405911 = ? ");
		}

		if (pnad.getV405912() != null) {
			params.add(pnad.getV405912());
			sql.append(" and p.v405912 = ? ");
		}

		if (pnad.getV40592() != null) {
			params.add(pnad.getV40592());
			sql.append(" and p.v40592 = ? ");
		}

		if (pnad.getV405921() != null) {
			params.add(pnad.getV405921());
			sql.append(" and p.v405921 = ? ");
		}

		if (pnad.getV405922() != null) {
			params.add(pnad.getV405922());
			sql.append(" and p.v405922 = ? ");
		}

		if (pnad.getV4062() != null) {
			params.add(pnad.getV4062());
			sql.append(" and p.v4062 = ? ");
		}

		if (pnad.getV4062c() != null) {
			params.add(pnad.getV4062c());
			sql.append(" and p.v4062c = ? ");
		}

		if (pnad.getV4063() != null) {
			params.add(pnad.getV4063());
			sql.append(" and p.v4063 = ? ");
		}

		if (pnad.getV4063a() != null) {
			params.add(pnad.getV4063a());
			sql.append(" and p.v4063a = ? ");
		}

		if (pnad.getV4064() != null) {
			params.add(pnad.getV4064());
			sql.append(" and p.v4064 = ? ");
		}

		if (pnad.getV4064a() != null) {
			params.add(pnad.getV4064a());
			sql.append(" and p.v4064a = ? ");
		}

		if (pnad.getV4071() != null) {
			params.add(pnad.getV4071());
			sql.append(" and p.v4071 = ? ");
		}

		if (pnad.getV4072() != null) {
			params.add(pnad.getV4072());
			sql.append(" and p.v4072 = ? ");
		}

		if (pnad.getV4072a() != null) {
			params.add(pnad.getV4072a());
			sql.append(" and p.v4072a = ? ");
		}

		if (pnad.getV4073() != null) {
			params.add(pnad.getV4073());
			sql.append(" and p.v4073 = ? ");
		}

		if (pnad.getV4074() != null) {
			params.add(pnad.getV4074());
			sql.append(" and p.v4074 = ? ");
		}

		if (pnad.getV4074a() != null) {
			params.add(pnad.getV4074a());
			sql.append(" and p.v4074a = ? ");
		}

		if (pnad.getV4075a() != null) {
			params.add(pnad.getV4075a());
			sql.append(" and p.v4075a = ? ");
		}

		if (pnad.getV4075a1() != null) {
			params.add(pnad.getV4075a1());
			sql.append(" and p.v4075a1 = ? ");
		}

		if (pnad.getV4076() != null) {
			params.add(pnad.getV4076());
			sql.append(" and p.v4076 = ? ");
		}

		if (pnad.getV40761() != null) {
			params.add(pnad.getV40761());
			sql.append(" and p.v40761 = ? ");
		}

		if (pnad.getV40762() != null) {
			params.add(pnad.getV40762());
			sql.append(" and p.v40762 = ? ");
		}

		if (pnad.getV40763() != null) {
			params.add(pnad.getV40763());
			sql.append(" and p.v40763 = ? ");
		}

		if (pnad.getV4077() != null) {
			params.add(pnad.getV4077());
			sql.append(" and p.v4077 = ? ");
		}

		if (pnad.getV4078() != null) {
			params.add(pnad.getV4078());
			sql.append(" and p.v4078 = ? ");
		}

		if (pnad.getV4078a() != null) {
			params.add(pnad.getV4078a());
			sql.append(" and p.v4078a = ? ");
		}

		if (pnad.getV4082() != null) {
			params.add(pnad.getV4082());
			sql.append(" and p.v4082 = ? ");
		}

		if (pnad.getVd2003() != null) {
			params.add(pnad.getVd2003());
			sql.append(" and p.vd2003 = ? ");
		}

		if (pnad.getVd3001() != null) {
			params.add(pnad.getVd3001());
			sql.append(" and p.vd3001 = ? ");
		}

		if (pnad.getVd4001() != null) {
			params.add(pnad.getVd4001());
			sql.append(" and p.vd4001 = ? ");
		}

		if (pnad.getVd4002() != null) {
			params.add(pnad.getVd4002());
			sql.append(" and p.vd4002 = ? ");
		}

		if (pnad.getVd4003() != null) {
			params.add(pnad.getVd4003());
			sql.append(" and p.vd4003 = ? ");
		}

		if (pnad.getVd4004() != null) {
			params.add(pnad.getVd4004());
			sql.append(" and p.vd4004 = ? ");
		}

		if (pnad.getVd4005() != null) {
			params.add(pnad.getVd4005());
			sql.append(" and p.vd4005 = ? ");
		}

		if (pnad.getVd4007() != null) {
			params.add(pnad.getVd4007());
			sql.append(" and p.vd4007 = ? ");
		}

		if (pnad.getVd4008() != null) {
			params.add(pnad.getVd4008());
			sql.append(" and p.vd4008 = ? ");
		}

		if (pnad.getVd4009() != null) {
			params.add(pnad.getVd4009());
			sql.append(" and p.vd4009 = ? ");
		}

		if (pnad.getVd4010() != null) {
			params.add(pnad.getVd4010());
			sql.append(" and p.vd4010 = ? ");
		}

		if (pnad.getVd4011() != null) {
			params.add(pnad.getVd4011());
			sql.append(" and p.vd4011 = ? ");
		}

		if (pnad.getVd4012() != null) {
			params.add(pnad.getVd4012());
			sql.append(" and p.vd4012 = ? ");
		}

		if (pnad.getVd4013() != null) {
			params.add(pnad.getVd4013());
			sql.append(" and p.vd4013 = ? ");
		}

		if (pnad.getVd4014() != null) {
			params.add(pnad.getVd4014());
			sql.append(" and p.vd4014 = ? ");
		}

		if (pnad.getVd4015() != null) {
			params.add(pnad.getVd4015());
			sql.append(" and p.vd4015 = ? ");
		}

		if (pnad.getVd4016() != null) {
			params.add(pnad.getVd4016());
			sql.append(" and p.vd4016 = ? ");
		}

		if (pnad.getVd4017() != null) {
			params.add(pnad.getVd4017());
			sql.append(" and p.vd4017 = ? ");
		}

		if (pnad.getVd4018() != null) {
			params.add(pnad.getVd4018());
			sql.append(" and p.vd4018 = ? ");
		}

		if (pnad.getVd4019() != null) {
			params.add(pnad.getVd4019());
			sql.append(" and p.vd4019 = ? ");
		}

		if (pnad.getVd4020() != null) {
			params.add(pnad.getVd4020());
			sql.append(" and p.vd4020 = ? ");
		}

		if (pnad.getVd4023() != null) {
			params.add(pnad.getVd4023());
			sql.append(" and p.vd4023 = ? ");
		}

		if (pnad.getVd4030() != null) {
			params.add(pnad.getVd4030());
			sql.append(" and p.vd4030 = ? ");
		}

		if (pnad.getVd4031() != null) {
			params.add(pnad.getVd4031());
			sql.append(" and p.vd4031 = ? ");
		}

		if (pnad.getVd4032() != null) {
			params.add(pnad.getVd4032());
			sql.append(" and p.vd4032 = ? ");
		}

		if (pnad.getVd4033() != null) {
			params.add(pnad.getVd4033());
			sql.append(" and p.vd4033 = ? ");
		}

		if (pnad.getVd4034() != null) {
			params.add(pnad.getVd4034());
			sql.append(" and p.vd4034 = ? ");
		}

		if (pnad.getVd4035() != null) {
			params.add(pnad.getVd4035());
			sql.append(" and p.vd4035 = ? ");
		}

		if (pnad.getVd4036() != null) {
			params.add(pnad.getVd4036());
			sql.append(" and p.vd4036 = ? ");
		}

		if (pnad.getVd4037() != null) {
			params.add(pnad.getVd4037());
			sql.append(" and p.vd4037 = ? ");
		}

		if (limiteRegistros != null) {
			sql.append(" limit ").append(limiteRegistros);			
		}		
		
	}
	
}

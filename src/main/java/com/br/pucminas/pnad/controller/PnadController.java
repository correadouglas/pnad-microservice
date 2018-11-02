package com.br.pucminas.pnad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.pucminas.pnad.dao.PnadDao;
import com.br.pucminas.pnad.model.Pnad;

@RestController
@RequestMapping("/pnad")
public class PnadController {
	
	@Autowired
	private PnadDao pnadDao;
	
	@GetMapping
	public List<Pnad> pesquisar(
			@RequestParam(value = "ano", required = false) String ano,
			@RequestParam(value = "trimestre", required = false) String trimestre,
			@RequestParam(value = "uf", required = false) String uf,
			@RequestParam(value = "capital", required = false) String capital,
			@RequestParam(value = "rm_ride", required = false) String rm_ride,
			@RequestParam(value = "upa", required = false) String upa,
			@RequestParam(value = "estrato", required = false) String estrato,
			@RequestParam(value = "v1008", required = false) String v1008,
			@RequestParam(value = "v1014", required = false) String v1014,
			@RequestParam(value = "v1016", required = false) String v1016,
			@RequestParam(value = "v1022", required = false) String v1022,
			@RequestParam(value = "v1023", required = false) String v1023,
			@RequestParam(value = "v1027", required = false) Double v1027,
			@RequestParam(value = "v1028", required = false) Double v1028,
			@RequestParam(value = "v1029", required = false) Integer v1029,
			@RequestParam(value = "posest", required = false) String posest,
			@RequestParam(value = "v2001", required = false) Integer v2001,
			@RequestParam(value = "v2003", required = false) String v2003,
			@RequestParam(value = "v2005", required = false) String v2005,
			@RequestParam(value = "v2007", required = false) String v2007,
			@RequestParam(value = "v2008", required = false) String v2008,
			@RequestParam(value = "v20081", required = false) String v20081,
			@RequestParam(value = "v20082", required = false) String v20082,
			@RequestParam(value = "v2009", required = false) Integer v2009,
			@RequestParam(value = "v2010", required = false) String v2010,
			@RequestParam(value = "v3001", required = false) String v3001,
			@RequestParam(value = "v3002", required = false) String v3002,
			@RequestParam(value = "v3002a", required = false) String v3002a,
			@RequestParam(value = "v3003", required = false) String v3003,
			@RequestParam(value = "v3003a", required = false) String v3003a,
			@RequestParam(value = "v3004", required = false) String v3004,
			@RequestParam(value = "v3005", required = false) String v3005,
			@RequestParam(value = "v3005a", required = false) String v3005a,
			@RequestParam(value = "v3006", required = false) String v3006,
			@RequestParam(value = "v3007", required = false) String v3007,
			@RequestParam(value = "v3008", required = false) String v3008,
			@RequestParam(value = "v3009", required = false) String v3009,
			@RequestParam(value = "v3009a", required = false) String v3009a,
			@RequestParam(value = "v3010", required = false) String v3010,
			@RequestParam(value = "v3011", required = false) String v3011,
			@RequestParam(value = "v3011a", required = false) String v3011a,
			@RequestParam(value = "v3012", required = false) String v3012,
			@RequestParam(value = "v3013", required = false) String v3013,
			@RequestParam(value = "v3014", required = false) String v3014,
			@RequestParam(value = "v4001", required = false) String v4001,
			@RequestParam(value = "v4002", required = false) String v4002,
			@RequestParam(value = "v4003", required = false) String v4003,
			@RequestParam(value = "v4004", required = false) String v4004,
			@RequestParam(value = "v4005", required = false) String v4005,
			@RequestParam(value = "v4006", required = false) String v4006,
			@RequestParam(value = "v4006a", required = false) String v4006a,
			@RequestParam(value = "v4007", required = false) String v4007,
			@RequestParam(value = "v4008", required = false) String v4008,
			@RequestParam(value = "v40081", required = false) String v40081,
			@RequestParam(value = "v40082", required = false) String v40082,
			@RequestParam(value = "v40083", required = false) String v40083,
			@RequestParam(value = "v4009", required = false) String v4009,
			@RequestParam(value = "v4010", required = false) String v4010,
			@RequestParam(value = "v4012", required = false) String v4012,
			@RequestParam(value = "v40121", required = false) String v40121,
			@RequestParam(value = "v4013", required = false) String v4013,
			@RequestParam(value = "v40132", required = false) String v40132,
			@RequestParam(value = "v40132a", required = false) String v40132a,
			@RequestParam(value = "v4014", required = false) String v4014,
			@RequestParam(value = "v4015", required = false) String v4015,
			@RequestParam(value = "v40151", required = false) String v40151,
			@RequestParam(value = "v401511", required = false) String v401511,
			@RequestParam(value = "v401512", required = false) String v401512,
			@RequestParam(value = "v4016", required = false) String v4016,
			@RequestParam(value = "v40161", required = false) String v40161,
			@RequestParam(value = "v40162", required = false) String v40162,
			@RequestParam(value = "v40163", required = false) String v40163,
			@RequestParam(value = "v4017", required = false) String v4017,
			@RequestParam(value = "v40171", required = false) String v40171,
			@RequestParam(value = "v401711", required = false) String v401711,
			@RequestParam(value = "v4018", required = false) String v4018,
			@RequestParam(value = "v40181", required = false) String v40181,
			@RequestParam(value = "v40182", required = false) String v40182,
			@RequestParam(value = "v40183", required = false) String v40183,
			@RequestParam(value = "v4019", required = false) String v4019,
			@RequestParam(value = "v4024", required = false) String v4024,
			@RequestParam(value = "v4025", required = false) String v4025,
			@RequestParam(value = "v4026", required = false) String v4026,
			@RequestParam(value = "v4027", required = false) String v4027,
			@RequestParam(value = "v4028", required = false) String v4028,
			@RequestParam(value = "v4029", required = false) String v4029,
			@RequestParam(value = "v4032", required = false) String v4032,
			@RequestParam(value = "v4033", required = false) String v4033,
			@RequestParam(value = "v40331", required = false) String v40331,
			@RequestParam(value = "v403311", required = false) String v403311,
			@RequestParam(value = "v403312", required = false) Integer v403312,
			@RequestParam(value = "v40332", required = false) String v40332,
			@RequestParam(value = "v403321", required = false) String v403321,
			@RequestParam(value = "v403322", required = false) Integer v403322,
			@RequestParam(value = "v40333", required = false) String v40333,
			@RequestParam(value = "v403331", required = false) String v403331,
			@RequestParam(value = "v4034", required = false) String v4034,
			@RequestParam(value = "v40341", required = false) String v40341,
			@RequestParam(value = "v403411", required = false) String v403411,
			@RequestParam(value = "v403412", required = false) Integer v403412,
			@RequestParam(value = "v40342", required = false) String v40342,
			@RequestParam(value = "v403421", required = false) String v403421,
			@RequestParam(value = "v403422", required = false) Integer v403422,
			@RequestParam(value = "v4039", required = false) Integer v4039,
			@RequestParam(value = "v4039c", required = false) Integer v4039c,
			@RequestParam(value = "v4040", required = false) String v4040,
			@RequestParam(value = "v40401", required = false) Integer v40401,
			@RequestParam(value = "v40402", required = false) Integer v40402,
			@RequestParam(value = "v40403", required = false) Integer v40403,
			@RequestParam(value = "v4041", required = false) String v4041,
			@RequestParam(value = "v4043", required = false) String v4043,
			@RequestParam(value = "v40431", required = false) String v40431,
			@RequestParam(value = "v4044", required = false) String v4044,
			@RequestParam(value = "v4045", required = false) String v4045,
			@RequestParam(value = "v4046", required = false) String v4046,
			@RequestParam(value = "v4047", required = false) String v4047,
			@RequestParam(value = "v4048", required = false) String v4048,
			@RequestParam(value = "v4049", required = false) String v4049,
			@RequestParam(value = "v4050", required = false) String v4050,
			@RequestParam(value = "v40501", required = false) String v40501,
			@RequestParam(value = "v405011", required = false) String v405011,
			@RequestParam(value = "v405012", required = false) Integer v405012,
			@RequestParam(value = "v40502", required = false) String v40502,
			@RequestParam(value = "v405021", required = false) String v405021,
			@RequestParam(value = "v405022", required = false) Integer v405022,
			@RequestParam(value = "v40503", required = false) String v40503,
			@RequestParam(value = "v405031", required = false) String v405031,
			@RequestParam(value = "v4051", required = false) String v4051,
			@RequestParam(value = "v40511", required = false) String v40511,
			@RequestParam(value = "v405111", required = false) String v405111,
			@RequestParam(value = "v405112", required = false) Integer v405112,
			@RequestParam(value = "v40512", required = false) String v40512,
			@RequestParam(value = "v405121", required = false) String v405121,
			@RequestParam(value = "v405122", required = false) Integer v405122,
			@RequestParam(value = "v4056", required = false) Integer v4056,
			@RequestParam(value = "v4056c", required = false) Integer v4056c,
			@RequestParam(value = "v4057", required = false) String v4057,
			@RequestParam(value = "v4058", required = false) String v4058,
			@RequestParam(value = "v40581", required = false) String v40581,
			@RequestParam(value = "v405811", required = false) String v405811,
			@RequestParam(value = "v405812", required = false) Integer v405812,
			@RequestParam(value = "v40582", required = false) String v40582,
			@RequestParam(value = "v405821", required = false) String v405821,
			@RequestParam(value = "v405822", required = false) Integer v405822,
			@RequestParam(value = "v40583", required = false) String v40583,
			@RequestParam(value = "v405831", required = false) String v405831,
			@RequestParam(value = "v40584", required = false) String v40584,
			@RequestParam(value = "v4059", required = false) String v4059,
			@RequestParam(value = "v40591", required = false) String v40591,
			@RequestParam(value = "v405911", required = false) String v405911,
			@RequestParam(value = "v405912", required = false) Integer v405912,
			@RequestParam(value = "v40592", required = false) String v40592,
			@RequestParam(value = "v405921", required = false) String v405921,
			@RequestParam(value = "v405922", required = false) Integer v405922,
			@RequestParam(value = "v4062", required = false) Integer v4062,
			@RequestParam(value = "v4062c", required = false) Integer v4062c,
			@RequestParam(value = "v4063", required = false) String v4063,
			@RequestParam(value = "v4063a", required = false) String v4063a,
			@RequestParam(value = "v4064", required = false) String v4064,
			@RequestParam(value = "v4064a", required = false) String v4064a,
			@RequestParam(value = "v4071", required = false) String v4071,
			@RequestParam(value = "v4072", required = false) String v4072,
			@RequestParam(value = "v4072a", required = false) String v4072a,
			@RequestParam(value = "v4073", required = false) String v4073,
			@RequestParam(value = "v4074", required = false) String v4074,
			@RequestParam(value = "v4074a", required = false) String v4074a,
			@RequestParam(value = "v4075a", required = false) String v4075a,
			@RequestParam(value = "v4075a1", required = false) String v4075a1,
			@RequestParam(value = "v4076", required = false) String v4076,
			@RequestParam(value = "v40761", required = false) Integer v40761,
			@RequestParam(value = "v40762", required = false) Integer v40762,
			@RequestParam(value = "v40763", required = false) Integer v40763,
			@RequestParam(value = "v4077", required = false) String v4077,
			@RequestParam(value = "v4078", required = false) String v4078,
			@RequestParam(value = "v4078a", required = false) String v4078a,
			@RequestParam(value = "v4082", required = false) String v4082,
			@RequestParam(value = "vd2003", required = false) Integer vd2003,
			@RequestParam(value = "vd3001", required = false) String vd3001,
			@RequestParam(value = "vd4001", required = false) String vd4001,
			@RequestParam(value = "vd4002", required = false) String vd4002,
			@RequestParam(value = "vd4003", required = false) String vd4003,
			@RequestParam(value = "vd4004", required = false) String vd4004,
			@RequestParam(value = "vd4005", required = false) String vd4005,
			@RequestParam(value = "vd4007", required = false) String vd4007,
			@RequestParam(value = "vd4008", required = false) String vd4008,
			@RequestParam(value = "vd4009", required = false) String vd4009,
			@RequestParam(value = "vd4010", required = false) String vd4010,
			@RequestParam(value = "vd4011", required = false) String vd4011,
			@RequestParam(value = "vd4012", required = false) String vd4012,
			@RequestParam(value = "vd4013", required = false) String vd4013,
			@RequestParam(value = "vd4014", required = false) String vd4014,
			@RequestParam(value = "vd4015", required = false) String vd4015,
			@RequestParam(value = "vd4016", required = false) Integer vd4016,
			@RequestParam(value = "vd4017", required = false) Integer vd4017,
			@RequestParam(value = "vd4018", required = false) String vd4018,
			@RequestParam(value = "vd4019", required = false) Integer vd4019,
			@RequestParam(value = "vd4020", required = false) Integer vd4020,
			@RequestParam(value = "vd4023", required = false) String vd4023,
			@RequestParam(value = "vd4030", required = false) String vd4030,
			@RequestParam(value = "vd4031", required = false) Integer vd4031,
			@RequestParam(value = "vd4032", required = false) Integer vd4032,
			@RequestParam(value = "vd4033", required = false) Integer vd4033,
			@RequestParam(value = "vd4034", required = false) Integer vd4034,
			@RequestParam(value = "vd4035", required = false) Integer vd4035,
			@RequestParam(value = "vd4036", required = false) String vd4036,
			@RequestParam(value = "vd4037", required = false) String vd4037) {
		
		Pnad pnad = new Pnad();
		pnad.setAno(ano);
		pnad.setTrimestre(trimestre);
		pnad.setUf(uf);
		pnad.setCapital(capital);
		pnad.setRm_ride(rm_ride);
		pnad.setUpa(upa);
		pnad.setEstrato(estrato);
		pnad.setV1008(v1008);
		pnad.setV1014(v1014);
		pnad.setV1016(v1016);
		pnad.setV1022(v1022);
		pnad.setV1023(v1023);
		pnad.setV1027(v1027);
		pnad.setV1028(v1028);
		pnad.setV1029(v1029);
		pnad.setPosest(posest);
		pnad.setV2001(v2001);
		pnad.setV2003(v2003);
		pnad.setV2005(v2005);
		pnad.setV2007(v2007);
		pnad.setV2008(v2008);
		pnad.setV20081(v20081);
		pnad.setV20082(v20082);
		pnad.setV2009(v2009);
		pnad.setV2010(v2010);
		pnad.setV3001(v3001);
		pnad.setV3002(v3002);
		pnad.setV3002a(v3002a);
		pnad.setV3003(v3003);
		pnad.setV3003a(v3003a);
		pnad.setV3004(v3004);
		pnad.setV3005(v3005);
		pnad.setV3005a(v3005a);
		pnad.setV3006(v3006);
		pnad.setV3007(v3007);
		pnad.setV3008(v3008);
		pnad.setV3009(v3009);
		pnad.setV3009a(v3009a);
		pnad.setV3010(v3010);
		pnad.setV3011(v3011);
		pnad.setV3011a(v3011a);
		pnad.setV3012(v3012);
		pnad.setV3013(v3013);
		pnad.setV3014(v3014);
		pnad.setV4001(v4001);
		pnad.setV4002(v4002);
		pnad.setV4003(v4003);
		pnad.setV4004(v4004);
		pnad.setV4005(v4005);
		pnad.setV4006(v4006);
		pnad.setV4006a(v4006a);
		pnad.setV4007(v4007);
		pnad.setV4008(v4008);
		pnad.setV40081(v40081);
		pnad.setV40082(v40082);
		pnad.setV40083(v40083);
		pnad.setV4009(v4009);
		pnad.setV4010(v4010);
		pnad.setV4012(v4012);
		pnad.setV40121(v40121);
		pnad.setV4013(v4013);
		pnad.setV40132(v40132);
		pnad.setV40132a(v40132a);
		pnad.setV4014(v4014);
		pnad.setV4015(v4015);
		pnad.setV40151(v40151);
		pnad.setV401511(v401511);
		pnad.setV401512(v401512);
		pnad.setV4016(v4016);
		pnad.setV40161(v40161);
		pnad.setV40162(v40162);
		pnad.setV40163(v40163);
		pnad.setV4017(v4017);
		pnad.setV40171(v40171);
		pnad.setV401711(v401711);
		pnad.setV4018(v4018);
		pnad.setV40181(v40181);
		pnad.setV40182(v40182);
		pnad.setV40183(v40183);
		pnad.setV4019(v4019);
		pnad.setV4024(v4024);
		pnad.setV4025(v4025);
		pnad.setV4026(v4026);
		pnad.setV4027(v4027);
		pnad.setV4028(v4028);
		pnad.setV4029(v4029);
		pnad.setV4032(v4032);
		pnad.setV4033(v4033);
		pnad.setV40331(v40331);
		pnad.setV403311(v403311);
		pnad.setV403312(v403312);
		pnad.setV40332(v40332);
		pnad.setV403321(v403321);
		pnad.setV403322(v403322);
		pnad.setV40333(v40333);
		pnad.setV403331(v403331);
		pnad.setV4034(v4034);
		pnad.setV40341(v40341);
		pnad.setV403411(v403411);
		pnad.setV403412(v403412);
		pnad.setV40342(v40342);
		pnad.setV403421(v403421);
		pnad.setV403422(v403422);
		pnad.setV4039(v4039);
		pnad.setV4039c(v4039c);
		pnad.setV4040(v4040);
		pnad.setV40401(v40401);
		pnad.setV40402(v40402);
		pnad.setV40403(v40403);
		pnad.setV4041(v4041);
		pnad.setV4043(v4043);
		pnad.setV40431(v40431);
		pnad.setV4044(v4044);
		pnad.setV4045(v4045);
		pnad.setV4046(v4046);
		pnad.setV4047(v4047);
		pnad.setV4048(v4048);
		pnad.setV4049(v4049);
		pnad.setV4050(v4050);
		pnad.setV40501(v40501);
		pnad.setV405011(v405011);
		pnad.setV405012(v405012);
		pnad.setV40502(v40502);
		pnad.setV405021(v405021);
		pnad.setV405022(v405022);
		pnad.setV40503(v40503);
		pnad.setV405031(v405031);
		pnad.setV4051(v4051);
		pnad.setV40511(v40511);
		pnad.setV405111(v405111);
		pnad.setV405112(v405112);
		pnad.setV40512(v40512);
		pnad.setV405121(v405121);
		pnad.setV405122(v405122);
		pnad.setV4056(v4056);
		pnad.setV4056c(v4056c);
		pnad.setV4057(v4057);
		pnad.setV4058(v4058);
		pnad.setV40581(v40581);
		pnad.setV405811(v405811);
		pnad.setV405812(v405812);
		pnad.setV40582(v40582);
		pnad.setV405821(v405821);
		pnad.setV405822(v405822);
		pnad.setV40583(v40583);
		pnad.setV405831(v405831);
		pnad.setV40584(v40584);
		pnad.setV4059(v4059);
		pnad.setV40591(v40591);
		pnad.setV405911(v405911);
		pnad.setV405912(v405912);
		pnad.setV40592(v40592);
		pnad.setV405921(v405921);
		pnad.setV405922(v405922);
		pnad.setV4062(v4062);
		pnad.setV4062c(v4062c);
		pnad.setV4063(v4063);
		pnad.setV4063a(v4063a);
		pnad.setV4064(v4064);
		pnad.setV4064a(v4064a);
		pnad.setV4071(v4071);
		pnad.setV4072(v4072);
		pnad.setV4072a(v4072a);
		pnad.setV4073(v4073);
		pnad.setV4074(v4074);
		pnad.setV4074a(v4074a);
		pnad.setV4075a(v4075a);
		pnad.setV4075a1(v4075a1);
		pnad.setV4076(v4076);
		pnad.setV40761(v40761);
		pnad.setV40762(v40762);
		pnad.setV40763(v40763);
		pnad.setV4077(v4077);
		pnad.setV4078(v4078);
		pnad.setV4078a(v4078a);
		pnad.setV4082(v4082);
		pnad.setVd2003(vd2003);
		pnad.setVd3001(vd3001);
		pnad.setVd4001(vd4001);
		pnad.setVd4002(vd4002);
		pnad.setVd4003(vd4003);
		pnad.setVd4004(vd4004);
		pnad.setVd4005(vd4005);
		pnad.setVd4007(vd4007);
		pnad.setVd4008(vd4008);
		pnad.setVd4009(vd4009);
		pnad.setVd4010(vd4010);
		pnad.setVd4011(vd4011);
		pnad.setVd4012(vd4012);
		pnad.setVd4013(vd4013);
		pnad.setVd4014(vd4014);
		pnad.setVd4015(vd4015);
		pnad.setVd4016(vd4016);
		pnad.setVd4017(vd4017);
		pnad.setVd4018(vd4018);
		pnad.setVd4019(vd4019);
		pnad.setVd4020(vd4020);
		pnad.setVd4023(vd4023);
		pnad.setVd4030(vd4030);
		pnad.setVd4031(vd4031);
		pnad.setVd4032(vd4032);
		pnad.setVd4033(vd4033);
		pnad.setVd4034(vd4034);
		pnad.setVd4035(vd4035);
		pnad.setVd4036(vd4036);
		pnad.setVd4037(vd4037);
		
		return pnadDao.pesquisar(pnad);
		
	}
	
}

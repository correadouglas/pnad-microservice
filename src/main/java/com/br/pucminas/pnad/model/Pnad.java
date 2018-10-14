package com.br.pucminas.pnad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "microdados", schema = "pnad")
public class Pnad {

	@Id
	@Column(name = "ano")
	private String ano;

	@Column(name = "trimestre")
	private String trimestre;

	@Column(name = "uf")
	private String uf;

	@Column(name = "capital")
	private String capital;

	@Column(name = "rm_ride")
	private String rm_ride;

	@Column(name = "upa")
	private String upa;

	@Column(name = "estrato")
	private String estrato;

	@Column(name = "v1008")
	private String v1008;

	@Column(name = "v1014")
	private String v1014;

	@Column(name = "v1016")
	private String v1016;

	@Column(name = "v1022")
	private String v1022;

	@Column(name = "v1023")
	private String v1023;

	@Column(name = "v1027")
	private Double v1027;

	@Column(name = "v1028")
	private Double v1028;

	@Column(name = "v1029")
	private Integer v1029;

	@Column(name = "posest")
	private String posest;

	@Column(name = "v2001")
	private Integer v2001;

	@Column(name = "v2003")
	private String v2003;

	@Column(name = "v2005")
	private String v2005;

	@Column(name = "v2007")
	private String v2007;

	@Column(name = "v2008")
	private String v2008;

	@Column(name = "v20081")
	private String v20081;

	@Column(name = "v20082")
	private String v20082;

	@Column(name = "v2009")
	private Integer v2009;

	@Column(name = "v2010")
	private String v2010;

	@Column(name = "v3001")
	private String v3001;

	@Column(name = "v3002")
	private String v3002;

	@Column(name = "v3002a")
	private String v3002a;

	@Column(name = "v3003")
	private String v3003;

	@Column(name = "v3003a")
	private String v3003a;

	@Column(name = "v3004")
	private String v3004;

	@Column(name = "v3005")
	private String v3005;

	@Column(name = "v3005a")
	private String v3005a;

	@Column(name = "v3006")
	private String v3006;

	@Column(name = "v3007")
	private String v3007;

	@Column(name = "v3008")
	private String v3008;

	@Column(name = "v3009")
	private String v3009;

	@Column(name = "v3009a")
	private String v3009a;

	@Column(name = "v3010")
	private String v3010;

	@Column(name = "v3011")
	private String v3011;

	@Column(name = "v3011a")
	private String v3011a;

	@Column(name = "v3012")
	private String v3012;

	@Column(name = "v3013")
	private String v3013;

	@Column(name = "v3014")
	private String v3014;

	@Column(name = "v4001")
	private String v4001;

	@Column(name = "v4002")
	private String v4002;

	@Column(name = "v4003")
	private String v4003;

	@Column(name = "v4004")
	private String v4004;

	@Column(name = "v4005")
	private String v4005;

	@Column(name = "v4006")
	private String v4006;

	@Column(name = "v4006a")
	private String v4006a;

	@Column(name = "v4007")
	private String v4007;

	@Column(name = "v4008")
	private String v4008;

	@Column(name = "v40081")
	private String v40081;

	@Column(name = "v40082")
	private String v40082;

	@Column(name = "v40083")
	private String v40083;

	@Column(name = "v4009")
	private String v4009;

	@Column(name = "v4010")
	private String v4010;

	@Column(name = "v4012")
	private String v4012;

	@Column(name = "v40121")
	private String v40121;

	@Column(name = "v4013")
	private String v4013;

	@Column(name = "v40132")
	private String v40132;

	@Column(name = "v40132a")
	private String v40132a;

	@Column(name = "v4014")
	private String v4014;

	@Column(name = "v4015")
	private String v4015;

	@Column(name = "v40151")
	private String v40151;

	@Column(name = "v401511")
	private String v401511;

	@Column(name = "v401512")
	private String v401512;

	@Column(name = "v4016")
	private String v4016;

	@Column(name = "v40161")
	private String v40161;

	@Column(name = "v40162")
	private String v40162;

	@Column(name = "v40163")
	private String v40163;

	@Column(name = "v4017")
	private String v4017;

	@Column(name = "v40171")
	private String v40171;

	@Column(name = "v401711")
	private String v401711;

	@Column(name = "v4018")
	private String v4018;

	@Column(name = "v40181")
	private String v40181;

	@Column(name = "v40182")
	private String v40182;

	@Column(name = "v40183")
	private String v40183;

	@Column(name = "v4019")
	private String v4019;

	@Column(name = "v4024")
	private String v4024;

	@Column(name = "v4025")
	private String v4025;

	@Column(name = "v4026")
	private String v4026;

	@Column(name = "v4027")
	private String v4027;

	@Column(name = "v4028")
	private String v4028;

	@Column(name = "v4029")
	private String v4029;

	@Column(name = "v4032")
	private String v4032;

	@Column(name = "v4033")
	private String v4033;

	@Column(name = "v40331")
	private String v40331;

	@Column(name = "v403311")
	private String v403311;

	@Column(name = "v403312")
	private Integer v403312;

	@Column(name = "v40332")
	private String v40332;

	@Column(name = "v403321")
	private String v403321;

	@Column(name = "v403322")
	private Integer v403322;

	@Column(name = "v40333")
	private String v40333;

	@Column(name = "v403331")
	private String v403331;

	@Column(name = "v4034")
	private String v4034;

	@Column(name = "v40341")
	private String v40341;

	@Column(name = "v403411")
	private String v403411;

	@Column(name = "v403412")
	private Integer v403412;

	@Column(name = "v40342")
	private String v40342;

	@Column(name = "v403421")
	private String v403421;

	@Column(name = "v403422")
	private Integer v403422;

	@Column(name = "v4039")
	private Integer v4039;

	@Column(name = "v4039c")
	private Integer v4039c;

	@Column(name = "v4040")
	private String v4040;

	@Column(name = "v40401")
	private Integer v40401;

	@Column(name = "v40402")
	private Integer v40402;

	@Column(name = "v40403")
	private Integer v40403;

	@Column(name = "v4041")
	private String v4041;

	@Column(name = "v4043")
	private String v4043;

	@Column(name = "v40431")
	private String v40431;

	@Column(name = "v4044")
	private String v4044;

	@Column(name = "v4045")
	private String v4045;

	@Column(name = "v4046")
	private String v4046;

	@Column(name = "v4047")
	private String v4047;

	@Column(name = "v4048")
	private String v4048;

	@Column(name = "v4049")
	private String v4049;

	@Column(name = "v4050")
	private String v4050;

	@Column(name = "v40501")
	private String v40501;

	@Column(name = "v405011")
	private String v405011;

	@Column(name = "v405012")
	private Integer v405012;

	@Column(name = "v40502")
	private String v40502;

	@Column(name = "v405021")
	private String v405021;

	@Column(name = "v405022")
	private Integer v405022;

	@Column(name = "v40503")
	private String v40503;

	@Column(name = "v405031")
	private String v405031;

	@Column(name = "v4051")
	private String v4051;

	@Column(name = "v40511")
	private String v40511;

	@Column(name = "v405111")
	private String v405111;

	@Column(name = "v405112")
	private Integer v405112;

	@Column(name = "v40512")
	private String v40512;

	@Column(name = "v405121")
	private String v405121;

	@Column(name = "v405122")
	private Integer v405122;

	@Column(name = "v4056")
	private Integer v4056;

	@Column(name = "v4056c")
	private Integer v4056c;

	@Column(name = "v4057")
	private String v4057;

	@Column(name = "v4058")
	private String v4058;

	@Column(name = "v40581")
	private String v40581;

	@Column(name = "v405811")
	private String v405811;

	@Column(name = "v405812")
	private Integer v405812;

	@Column(name = "v40582")
	private String v40582;

	@Column(name = "v405821")
	private String v405821;

	@Column(name = "v405822")
	private Integer v405822;

	@Column(name = "v40583")
	private String v40583;

	@Column(name = "v405831")
	private String v405831;

	@Column(name = "v40584")
	private String v40584;

	@Column(name = "v4059")
	private String v4059;

	@Column(name = "v40591")
	private String v40591;

	@Column(name = "v405911")
	private String v405911;

	@Column(name = "v405912")
	private Integer v405912;

	@Column(name = "v40592")
	private String v40592;

	@Column(name = "v405921")
	private String v405921;

	@Column(name = "v405922")
	private Integer v405922;

	@Column(name = "v4062")
	private Integer v4062;

	@Column(name = "v4062c")
	private Integer v4062c;

	@Column(name = "v4063")
	private String v4063;

	@Column(name = "v4063a")
	private String v4063a;

	@Column(name = "v4064")
	private String v4064;

	@Column(name = "v4064a")
	private String v4064a;

	@Column(name = "v4071")
	private String v4071;

	@Column(name = "v4072")
	private String v4072;

	@Column(name = "v4072a")
	private String v4072a;

	@Column(name = "v4073")
	private String v4073;

	@Column(name = "v4074")
	private String v4074;

	@Column(name = "v4074a")
	private String v4074a;

	@Column(name = "v4075a")
	private String v4075a;

	@Column(name = "v4075a1")
	private String v4075a1;

	@Column(name = "v4076")
	private String v4076;

	@Column(name = "v40761")
	private Integer v40761;

	@Column(name = "v40762")
	private Integer v40762;

	@Column(name = "v40763")
	private Integer v40763;

	@Column(name = "v4077")
	private String v4077;

	@Column(name = "v4078")
	private String v4078;

	@Column(name = "v4078a")
	private String v4078a;

	@Column(name = "v4082")
	private String v4082;

	@Column(name = "vd2003")
	private Integer vd2003;

	@Column(name = "vd3001")
	private String vd3001;

	@Column(name = "vd4001")
	private String vd4001;

	@Column(name = "vd4002")
	private String vd4002;

	@Column(name = "vd4003")
	private String vd4003;

	@Column(name = "vd4004")
	private String vd4004;

	@Column(name = "vd4005")
	private String vd4005;

	@Column(name = "vd4007")
	private String vd4007;

	@Column(name = "vd4008")
	private String vd4008;

	@Column(name = "vd4009")
	private String vd4009;

	@Column(name = "vd4010")
	private String vd4010;

	@Column(name = "vd4011")
	private String vd4011;

	@Column(name = "vd4012")
	private String vd4012;

	@Column(name = "vd4013")
	private String vd4013;

	@Column(name = "vd4014")
	private String vd4014;

	@Column(name = "vd4015")
	private String vd4015;

	@Column(name = "vd4016")
	private Integer vd4016;

	@Column(name = "vd4017")
	private Integer vd4017;

	@Column(name = "vd4018")
	private String vd4018;

	@Column(name = "vd4019")
	private Integer vd4019;

	@Column(name = "vd4020")
	private Integer vd4020;

	@Column(name = "vd4023")
	private String vd4023;

	@Column(name = "vd4030")
	private String vd4030;

	@Column(name = "vd4031")
	private Integer vd4031;

	@Column(name = "vd4032")
	private Integer vd4032;

	@Column(name = "vd4033")
	private Integer vd4033;

	@Column(name = "vd4034")
	private Integer vd4034;

	@Column(name = "vd4035")
	private Integer vd4035;

	@Column(name = "vd4036")
	private String vd4036;

	@Column(name = "vd4037")
	private String vd4037;

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getTrimestre() {
		return trimestre;
	}

	public void setTrimestre(String trimestre) {
		this.trimestre = trimestre;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getRm_ride() {
		return rm_ride;
	}

	public void setRm_ride(String rm_ride) {
		this.rm_ride = rm_ride;
	}

	public String getUpa() {
		return upa;
	}

	public void setUpa(String upa) {
		this.upa = upa;
	}

	public String getEstrato() {
		return estrato;
	}

	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}

	public String getV1008() {
		return v1008;
	}

	public void setV1008(String v1008) {
		this.v1008 = v1008;
	}

	public String getV1014() {
		return v1014;
	}

	public void setV1014(String v1014) {
		this.v1014 = v1014;
	}

	public String getV1016() {
		return v1016;
	}

	public void setV1016(String v1016) {
		this.v1016 = v1016;
	}

	public String getV1022() {
		return v1022;
	}

	public void setV1022(String v1022) {
		this.v1022 = v1022;
	}

	public String getV1023() {
		return v1023;
	}

	public void setV1023(String v1023) {
		this.v1023 = v1023;
	}

	public Double getV1027() {
		return v1027;
	}

	public void setV1027(Double v1027) {
		this.v1027 = v1027;
	}

	public Double getV1028() {
		return v1028;
	}

	public void setV1028(Double v1028) {
		this.v1028 = v1028;
	}

	public Integer getV1029() {
		return v1029;
	}

	public void setV1029(Integer v1029) {
		this.v1029 = v1029;
	}

	public String getPosest() {
		return posest;
	}

	public void setPosest(String posest) {
		this.posest = posest;
	}

	public Integer getV2001() {
		return v2001;
	}

	public void setV2001(Integer v2001) {
		this.v2001 = v2001;
	}

	public String getV2003() {
		return v2003;
	}

	public void setV2003(String v2003) {
		this.v2003 = v2003;
	}

	public String getV2005() {
		return v2005;
	}

	public void setV2005(String v2005) {
		this.v2005 = v2005;
	}

	public String getV2007() {
		return v2007;
	}

	public void setV2007(String v2007) {
		this.v2007 = v2007;
	}

	public String getV2008() {
		return v2008;
	}

	public void setV2008(String v2008) {
		this.v2008 = v2008;
	}

	public String getV20081() {
		return v20081;
	}

	public void setV20081(String v20081) {
		this.v20081 = v20081;
	}

	public String getV20082() {
		return v20082;
	}

	public void setV20082(String v20082) {
		this.v20082 = v20082;
	}

	public Integer getV2009() {
		return v2009;
	}

	public void setV2009(Integer v2009) {
		this.v2009 = v2009;
	}

	public String getV2010() {
		return v2010;
	}

	public void setV2010(String v2010) {
		this.v2010 = v2010;
	}

	public String getV3001() {
		return v3001;
	}

	public void setV3001(String v3001) {
		this.v3001 = v3001;
	}

	public String getV3002() {
		return v3002;
	}

	public void setV3002(String v3002) {
		this.v3002 = v3002;
	}

	public String getV3002a() {
		return v3002a;
	}

	public void setV3002a(String v3002a) {
		this.v3002a = v3002a;
	}

	public String getV3003() {
		return v3003;
	}

	public void setV3003(String v3003) {
		this.v3003 = v3003;
	}

	public String getV3003a() {
		return v3003a;
	}

	public void setV3003a(String v3003a) {
		this.v3003a = v3003a;
	}

	public String getV3004() {
		return v3004;
	}

	public void setV3004(String v3004) {
		this.v3004 = v3004;
	}

	public String getV3005() {
		return v3005;
	}

	public void setV3005(String v3005) {
		this.v3005 = v3005;
	}

	public String getV3005a() {
		return v3005a;
	}

	public void setV3005a(String v3005a) {
		this.v3005a = v3005a;
	}

	public String getV3006() {
		return v3006;
	}

	public void setV3006(String v3006) {
		this.v3006 = v3006;
	}

	public String getV3007() {
		return v3007;
	}

	public void setV3007(String v3007) {
		this.v3007 = v3007;
	}

	public String getV3008() {
		return v3008;
	}

	public void setV3008(String v3008) {
		this.v3008 = v3008;
	}

	public String getV3009() {
		return v3009;
	}

	public void setV3009(String v3009) {
		this.v3009 = v3009;
	}

	public String getV3009a() {
		return v3009a;
	}

	public void setV3009a(String v3009a) {
		this.v3009a = v3009a;
	}

	public String getV3010() {
		return v3010;
	}

	public void setV3010(String v3010) {
		this.v3010 = v3010;
	}

	public String getV3011() {
		return v3011;
	}

	public void setV3011(String v3011) {
		this.v3011 = v3011;
	}

	public String getV3011a() {
		return v3011a;
	}

	public void setV3011a(String v3011a) {
		this.v3011a = v3011a;
	}

	public String getV3012() {
		return v3012;
	}

	public void setV3012(String v3012) {
		this.v3012 = v3012;
	}

	public String getV3013() {
		return v3013;
	}

	public void setV3013(String v3013) {
		this.v3013 = v3013;
	}

	public String getV3014() {
		return v3014;
	}

	public void setV3014(String v3014) {
		this.v3014 = v3014;
	}

	public String getV4001() {
		return v4001;
	}

	public void setV4001(String v4001) {
		this.v4001 = v4001;
	}

	public String getV4002() {
		return v4002;
	}

	public void setV4002(String v4002) {
		this.v4002 = v4002;
	}

	public String getV4003() {
		return v4003;
	}

	public void setV4003(String v4003) {
		this.v4003 = v4003;
	}

	public String getV4004() {
		return v4004;
	}

	public void setV4004(String v4004) {
		this.v4004 = v4004;
	}

	public String getV4005() {
		return v4005;
	}

	public void setV4005(String v4005) {
		this.v4005 = v4005;
	}

	public String getV4006() {
		return v4006;
	}

	public void setV4006(String v4006) {
		this.v4006 = v4006;
	}

	public String getV4006a() {
		return v4006a;
	}

	public void setV4006a(String v4006a) {
		this.v4006a = v4006a;
	}

	public String getV4007() {
		return v4007;
	}

	public void setV4007(String v4007) {
		this.v4007 = v4007;
	}

	public String getV4008() {
		return v4008;
	}

	public void setV4008(String v4008) {
		this.v4008 = v4008;
	}

	public String getV40081() {
		return v40081;
	}

	public void setV40081(String v40081) {
		this.v40081 = v40081;
	}

	public String getV40082() {
		return v40082;
	}

	public void setV40082(String v40082) {
		this.v40082 = v40082;
	}

	public String getV40083() {
		return v40083;
	}

	public void setV40083(String v40083) {
		this.v40083 = v40083;
	}

	public String getV4009() {
		return v4009;
	}

	public void setV4009(String v4009) {
		this.v4009 = v4009;
	}

	public String getV4010() {
		return v4010;
	}

	public void setV4010(String v4010) {
		this.v4010 = v4010;
	}

	public String getV4012() {
		return v4012;
	}

	public void setV4012(String v4012) {
		this.v4012 = v4012;
	}

	public String getV40121() {
		return v40121;
	}

	public void setV40121(String v40121) {
		this.v40121 = v40121;
	}

	public String getV4013() {
		return v4013;
	}

	public void setV4013(String v4013) {
		this.v4013 = v4013;
	}

	public String getV40132() {
		return v40132;
	}

	public void setV40132(String v40132) {
		this.v40132 = v40132;
	}

	public String getV40132a() {
		return v40132a;
	}

	public void setV40132a(String v40132a) {
		this.v40132a = v40132a;
	}

	public String getV4014() {
		return v4014;
	}

	public void setV4014(String v4014) {
		this.v4014 = v4014;
	}

	public String getV4015() {
		return v4015;
	}

	public void setV4015(String v4015) {
		this.v4015 = v4015;
	}

	public String getV40151() {
		return v40151;
	}

	public void setV40151(String v40151) {
		this.v40151 = v40151;
	}

	public String getV401511() {
		return v401511;
	}

	public void setV401511(String v401511) {
		this.v401511 = v401511;
	}

	public String getV401512() {
		return v401512;
	}

	public void setV401512(String v401512) {
		this.v401512 = v401512;
	}

	public String getV4016() {
		return v4016;
	}

	public void setV4016(String v4016) {
		this.v4016 = v4016;
	}

	public String getV40161() {
		return v40161;
	}

	public void setV40161(String v40161) {
		this.v40161 = v40161;
	}

	public String getV40162() {
		return v40162;
	}

	public void setV40162(String v40162) {
		this.v40162 = v40162;
	}

	public String getV40163() {
		return v40163;
	}

	public void setV40163(String v40163) {
		this.v40163 = v40163;
	}

	public String getV4017() {
		return v4017;
	}

	public void setV4017(String v4017) {
		this.v4017 = v4017;
	}

	public String getV40171() {
		return v40171;
	}

	public void setV40171(String v40171) {
		this.v40171 = v40171;
	}

	public String getV401711() {
		return v401711;
	}

	public void setV401711(String v401711) {
		this.v401711 = v401711;
	}

	public String getV4018() {
		return v4018;
	}

	public void setV4018(String v4018) {
		this.v4018 = v4018;
	}

	public String getV40181() {
		return v40181;
	}

	public void setV40181(String v40181) {
		this.v40181 = v40181;
	}

	public String getV40182() {
		return v40182;
	}

	public void setV40182(String v40182) {
		this.v40182 = v40182;
	}

	public String getV40183() {
		return v40183;
	}

	public void setV40183(String v40183) {
		this.v40183 = v40183;
	}

	public String getV4019() {
		return v4019;
	}

	public void setV4019(String v4019) {
		this.v4019 = v4019;
	}

	public String getV4024() {
		return v4024;
	}

	public void setV4024(String v4024) {
		this.v4024 = v4024;
	}

	public String getV4025() {
		return v4025;
	}

	public void setV4025(String v4025) {
		this.v4025 = v4025;
	}

	public String getV4026() {
		return v4026;
	}

	public void setV4026(String v4026) {
		this.v4026 = v4026;
	}

	public String getV4027() {
		return v4027;
	}

	public void setV4027(String v4027) {
		this.v4027 = v4027;
	}

	public String getV4028() {
		return v4028;
	}

	public void setV4028(String v4028) {
		this.v4028 = v4028;
	}

	public String getV4029() {
		return v4029;
	}

	public void setV4029(String v4029) {
		this.v4029 = v4029;
	}

	public String getV4032() {
		return v4032;
	}

	public void setV4032(String v4032) {
		this.v4032 = v4032;
	}

	public String getV4033() {
		return v4033;
	}

	public void setV4033(String v4033) {
		this.v4033 = v4033;
	}

	public String getV40331() {
		return v40331;
	}

	public void setV40331(String v40331) {
		this.v40331 = v40331;
	}

	public String getV403311() {
		return v403311;
	}

	public void setV403311(String v403311) {
		this.v403311 = v403311;
	}

	public Integer getV403312() {
		return v403312;
	}

	public void setV403312(Integer v403312) {
		this.v403312 = v403312;
	}

	public String getV40332() {
		return v40332;
	}

	public void setV40332(String v40332) {
		this.v40332 = v40332;
	}

	public String getV403321() {
		return v403321;
	}

	public void setV403321(String v403321) {
		this.v403321 = v403321;
	}

	public Integer getV403322() {
		return v403322;
	}

	public void setV403322(Integer v403322) {
		this.v403322 = v403322;
	}

	public String getV40333() {
		return v40333;
	}

	public void setV40333(String v40333) {
		this.v40333 = v40333;
	}

	public String getV403331() {
		return v403331;
	}

	public void setV403331(String v403331) {
		this.v403331 = v403331;
	}

	public String getV4034() {
		return v4034;
	}

	public void setV4034(String v4034) {
		this.v4034 = v4034;
	}

	public String getV40341() {
		return v40341;
	}

	public void setV40341(String v40341) {
		this.v40341 = v40341;
	}

	public String getV403411() {
		return v403411;
	}

	public void setV403411(String v403411) {
		this.v403411 = v403411;
	}

	public Integer getV403412() {
		return v403412;
	}

	public void setV403412(Integer v403412) {
		this.v403412 = v403412;
	}

	public String getV40342() {
		return v40342;
	}

	public void setV40342(String v40342) {
		this.v40342 = v40342;
	}

	public String getV403421() {
		return v403421;
	}

	public void setV403421(String v403421) {
		this.v403421 = v403421;
	}

	public Integer getV403422() {
		return v403422;
	}

	public void setV403422(Integer v403422) {
		this.v403422 = v403422;
	}

	public Integer getV4039() {
		return v4039;
	}

	public void setV4039(Integer v4039) {
		this.v4039 = v4039;
	}

	public Integer getV4039c() {
		return v4039c;
	}

	public void setV4039c(Integer v4039c) {
		this.v4039c = v4039c;
	}

	public String getV4040() {
		return v4040;
	}

	public void setV4040(String v4040) {
		this.v4040 = v4040;
	}

	public Integer getV40401() {
		return v40401;
	}

	public void setV40401(Integer v40401) {
		this.v40401 = v40401;
	}

	public Integer getV40402() {
		return v40402;
	}

	public void setV40402(Integer v40402) {
		this.v40402 = v40402;
	}

	public Integer getV40403() {
		return v40403;
	}

	public void setV40403(Integer v40403) {
		this.v40403 = v40403;
	}

	public String getV4041() {
		return v4041;
	}

	public void setV4041(String v4041) {
		this.v4041 = v4041;
	}

	public String getV4043() {
		return v4043;
	}

	public void setV4043(String v4043) {
		this.v4043 = v4043;
	}

	public String getV40431() {
		return v40431;
	}

	public void setV40431(String v40431) {
		this.v40431 = v40431;
	}

	public String getV4044() {
		return v4044;
	}

	public void setV4044(String v4044) {
		this.v4044 = v4044;
	}

	public String getV4045() {
		return v4045;
	}

	public void setV4045(String v4045) {
		this.v4045 = v4045;
	}

	public String getV4046() {
		return v4046;
	}

	public void setV4046(String v4046) {
		this.v4046 = v4046;
	}

	public String getV4047() {
		return v4047;
	}

	public void setV4047(String v4047) {
		this.v4047 = v4047;
	}

	public String getV4048() {
		return v4048;
	}

	public void setV4048(String v4048) {
		this.v4048 = v4048;
	}

	public String getV4049() {
		return v4049;
	}

	public void setV4049(String v4049) {
		this.v4049 = v4049;
	}

	public String getV4050() {
		return v4050;
	}

	public void setV4050(String v4050) {
		this.v4050 = v4050;
	}

	public String getV40501() {
		return v40501;
	}

	public void setV40501(String v40501) {
		this.v40501 = v40501;
	}

	public String getV405011() {
		return v405011;
	}

	public void setV405011(String v405011) {
		this.v405011 = v405011;
	}

	public Integer getV405012() {
		return v405012;
	}

	public void setV405012(Integer v405012) {
		this.v405012 = v405012;
	}

	public String getV40502() {
		return v40502;
	}

	public void setV40502(String v40502) {
		this.v40502 = v40502;
	}

	public String getV405021() {
		return v405021;
	}

	public void setV405021(String v405021) {
		this.v405021 = v405021;
	}

	public Integer getV405022() {
		return v405022;
	}

	public void setV405022(Integer v405022) {
		this.v405022 = v405022;
	}

	public String getV40503() {
		return v40503;
	}

	public void setV40503(String v40503) {
		this.v40503 = v40503;
	}

	public String getV405031() {
		return v405031;
	}

	public void setV405031(String v405031) {
		this.v405031 = v405031;
	}

	public String getV4051() {
		return v4051;
	}

	public void setV4051(String v4051) {
		this.v4051 = v4051;
	}

	public String getV40511() {
		return v40511;
	}

	public void setV40511(String v40511) {
		this.v40511 = v40511;
	}

	public String getV405111() {
		return v405111;
	}

	public void setV405111(String v405111) {
		this.v405111 = v405111;
	}

	public Integer getV405112() {
		return v405112;
	}

	public void setV405112(Integer v405112) {
		this.v405112 = v405112;
	}

	public String getV40512() {
		return v40512;
	}

	public void setV40512(String v40512) {
		this.v40512 = v40512;
	}

	public String getV405121() {
		return v405121;
	}

	public void setV405121(String v405121) {
		this.v405121 = v405121;
	}

	public Integer getV405122() {
		return v405122;
	}

	public void setV405122(Integer v405122) {
		this.v405122 = v405122;
	}

	public Integer getV4056() {
		return v4056;
	}

	public void setV4056(Integer v4056) {
		this.v4056 = v4056;
	}

	public Integer getV4056c() {
		return v4056c;
	}

	public void setV4056c(Integer v4056c) {
		this.v4056c = v4056c;
	}

	public String getV4057() {
		return v4057;
	}

	public void setV4057(String v4057) {
		this.v4057 = v4057;
	}

	public String getV4058() {
		return v4058;
	}

	public void setV4058(String v4058) {
		this.v4058 = v4058;
	}

	public String getV40581() {
		return v40581;
	}

	public void setV40581(String v40581) {
		this.v40581 = v40581;
	}

	public String getV405811() {
		return v405811;
	}

	public void setV405811(String v405811) {
		this.v405811 = v405811;
	}

	public Integer getV405812() {
		return v405812;
	}

	public void setV405812(Integer v405812) {
		this.v405812 = v405812;
	}

	public String getV40582() {
		return v40582;
	}

	public void setV40582(String v40582) {
		this.v40582 = v40582;
	}

	public String getV405821() {
		return v405821;
	}

	public void setV405821(String v405821) {
		this.v405821 = v405821;
	}

	public Integer getV405822() {
		return v405822;
	}

	public void setV405822(Integer v405822) {
		this.v405822 = v405822;
	}

	public String getV40583() {
		return v40583;
	}

	public void setV40583(String v40583) {
		this.v40583 = v40583;
	}

	public String getV405831() {
		return v405831;
	}

	public void setV405831(String v405831) {
		this.v405831 = v405831;
	}

	public String getV40584() {
		return v40584;
	}

	public void setV40584(String v40584) {
		this.v40584 = v40584;
	}

	public String getV4059() {
		return v4059;
	}

	public void setV4059(String v4059) {
		this.v4059 = v4059;
	}

	public String getV40591() {
		return v40591;
	}

	public void setV40591(String v40591) {
		this.v40591 = v40591;
	}

	public String getV405911() {
		return v405911;
	}

	public void setV405911(String v405911) {
		this.v405911 = v405911;
	}

	public Integer getV405912() {
		return v405912;
	}

	public void setV405912(Integer v405912) {
		this.v405912 = v405912;
	}

	public String getV40592() {
		return v40592;
	}

	public void setV40592(String v40592) {
		this.v40592 = v40592;
	}

	public String getV405921() {
		return v405921;
	}

	public void setV405921(String v405921) {
		this.v405921 = v405921;
	}

	public Integer getV405922() {
		return v405922;
	}

	public void setV405922(Integer v405922) {
		this.v405922 = v405922;
	}

	public Integer getV4062() {
		return v4062;
	}

	public void setV4062(Integer v4062) {
		this.v4062 = v4062;
	}

	public Integer getV4062c() {
		return v4062c;
	}

	public void setV4062c(Integer v4062c) {
		this.v4062c = v4062c;
	}

	public String getV4063() {
		return v4063;
	}

	public void setV4063(String v4063) {
		this.v4063 = v4063;
	}

	public String getV4063a() {
		return v4063a;
	}

	public void setV4063a(String v4063a) {
		this.v4063a = v4063a;
	}

	public String getV4064() {
		return v4064;
	}

	public void setV4064(String v4064) {
		this.v4064 = v4064;
	}

	public String getV4064a() {
		return v4064a;
	}

	public void setV4064a(String v4064a) {
		this.v4064a = v4064a;
	}

	public String getV4071() {
		return v4071;
	}

	public void setV4071(String v4071) {
		this.v4071 = v4071;
	}

	public String getV4072() {
		return v4072;
	}

	public void setV4072(String v4072) {
		this.v4072 = v4072;
	}

	public String getV4072a() {
		return v4072a;
	}

	public void setV4072a(String v4072a) {
		this.v4072a = v4072a;
	}

	public String getV4073() {
		return v4073;
	}

	public void setV4073(String v4073) {
		this.v4073 = v4073;
	}

	public String getV4074() {
		return v4074;
	}

	public void setV4074(String v4074) {
		this.v4074 = v4074;
	}

	public String getV4074a() {
		return v4074a;
	}

	public void setV4074a(String v4074a) {
		this.v4074a = v4074a;
	}

	public String getV4075a() {
		return v4075a;
	}

	public void setV4075a(String v4075a) {
		this.v4075a = v4075a;
	}

	public String getV4075a1() {
		return v4075a1;
	}

	public void setV4075a1(String v4075a1) {
		this.v4075a1 = v4075a1;
	}

	public String getV4076() {
		return v4076;
	}

	public void setV4076(String v4076) {
		this.v4076 = v4076;
	}

	public Integer getV40761() {
		return v40761;
	}

	public void setV40761(Integer v40761) {
		this.v40761 = v40761;
	}

	public Integer getV40762() {
		return v40762;
	}

	public void setV40762(Integer v40762) {
		this.v40762 = v40762;
	}

	public Integer getV40763() {
		return v40763;
	}

	public void setV40763(Integer v40763) {
		this.v40763 = v40763;
	}

	public String getV4077() {
		return v4077;
	}

	public void setV4077(String v4077) {
		this.v4077 = v4077;
	}

	public String getV4078() {
		return v4078;
	}

	public void setV4078(String v4078) {
		this.v4078 = v4078;
	}

	public String getV4078a() {
		return v4078a;
	}

	public void setV4078a(String v4078a) {
		this.v4078a = v4078a;
	}

	public String getV4082() {
		return v4082;
	}

	public void setV4082(String v4082) {
		this.v4082 = v4082;
	}

	public Integer getVd2003() {
		return vd2003;
	}

	public void setVd2003(Integer vd2003) {
		this.vd2003 = vd2003;
	}

	public String getVd3001() {
		return vd3001;
	}

	public void setVd3001(String vd3001) {
		this.vd3001 = vd3001;
	}

	public String getVd4001() {
		return vd4001;
	}

	public void setVd4001(String vd4001) {
		this.vd4001 = vd4001;
	}

	public String getVd4002() {
		return vd4002;
	}

	public void setVd4002(String vd4002) {
		this.vd4002 = vd4002;
	}

	public String getVd4003() {
		return vd4003;
	}

	public void setVd4003(String vd4003) {
		this.vd4003 = vd4003;
	}

	public String getVd4004() {
		return vd4004;
	}

	public void setVd4004(String vd4004) {
		this.vd4004 = vd4004;
	}

	public String getVd4005() {
		return vd4005;
	}

	public void setVd4005(String vd4005) {
		this.vd4005 = vd4005;
	}

	public String getVd4007() {
		return vd4007;
	}

	public void setVd4007(String vd4007) {
		this.vd4007 = vd4007;
	}

	public String getVd4008() {
		return vd4008;
	}

	public void setVd4008(String vd4008) {
		this.vd4008 = vd4008;
	}

	public String getVd4009() {
		return vd4009;
	}

	public void setVd4009(String vd4009) {
		this.vd4009 = vd4009;
	}

	public String getVd4010() {
		return vd4010;
	}

	public void setVd4010(String vd4010) {
		this.vd4010 = vd4010;
	}

	public String getVd4011() {
		return vd4011;
	}

	public void setVd4011(String vd4011) {
		this.vd4011 = vd4011;
	}

	public String getVd4012() {
		return vd4012;
	}

	public void setVd4012(String vd4012) {
		this.vd4012 = vd4012;
	}

	public String getVd4013() {
		return vd4013;
	}

	public void setVd4013(String vd4013) {
		this.vd4013 = vd4013;
	}

	public String getVd4014() {
		return vd4014;
	}

	public void setVd4014(String vd4014) {
		this.vd4014 = vd4014;
	}

	public String getVd4015() {
		return vd4015;
	}

	public void setVd4015(String vd4015) {
		this.vd4015 = vd4015;
	}

	public Integer getVd4016() {
		return vd4016;
	}

	public void setVd4016(Integer vd4016) {
		this.vd4016 = vd4016;
	}

	public Integer getVd4017() {
		return vd4017;
	}

	public void setVd4017(Integer vd4017) {
		this.vd4017 = vd4017;
	}

	public String getVd4018() {
		return vd4018;
	}

	public void setVd4018(String vd4018) {
		this.vd4018 = vd4018;
	}

	public Integer getVd4019() {
		return vd4019;
	}

	public void setVd4019(Integer vd4019) {
		this.vd4019 = vd4019;
	}

	public Integer getVd4020() {
		return vd4020;
	}

	public void setVd4020(Integer vd4020) {
		this.vd4020 = vd4020;
	}

	public String getVd4023() {
		return vd4023;
	}

	public void setVd4023(String vd4023) {
		this.vd4023 = vd4023;
	}

	public String getVd4030() {
		return vd4030;
	}

	public void setVd4030(String vd4030) {
		this.vd4030 = vd4030;
	}

	public Integer getVd4031() {
		return vd4031;
	}

	public void setVd4031(Integer vd4031) {
		this.vd4031 = vd4031;
	}

	public Integer getVd4032() {
		return vd4032;
	}

	public void setVd4032(Integer vd4032) {
		this.vd4032 = vd4032;
	}

	public Integer getVd4033() {
		return vd4033;
	}

	public void setVd4033(Integer vd4033) {
		this.vd4033 = vd4033;
	}

	public Integer getVd4034() {
		return vd4034;
	}

	public void setVd4034(Integer vd4034) {
		this.vd4034 = vd4034;
	}

	public Integer getVd4035() {
		return vd4035;
	}

	public void setVd4035(Integer vd4035) {
		this.vd4035 = vd4035;
	}

	public String getVd4036() {
		return vd4036;
	}

	public void setVd4036(String vd4036) {
		this.vd4036 = vd4036;
	}

	public String getVd4037() {
		return vd4037;
	}

	public void setVd4037(String vd4037) {
		this.vd4037 = vd4037;
	}
}

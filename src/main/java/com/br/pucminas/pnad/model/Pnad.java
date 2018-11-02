package com.br.pucminas.pnad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "microdados", schema = "pnad")
@Getter @Setter
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

}

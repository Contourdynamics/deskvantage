package org.contourdynamics.deskvantage.Entities;

// Generated Jun 2, 2016 12:04:48 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * StatusCode generated by hbm2java
 */
@Entity
@Table(name = "StatusCode", catalog = "deskvantage")
public class StatusCode implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String description;

	private Set<BpContactAccount> bpContactAccounts = new HashSet<BpContactAccount>(
			0);
	private Set<Realm> realms = new HashSet<Realm>(0);
	private Set<BpRlspWtcnPrtl> bpRlspWtcnPrtls = new HashSet<BpRlspWtcnPrtl>(0);
	private Set<BpRlsp> bpRlsps = new HashSet<BpRlsp>(0);
	private Set<BpRlspGrupDtel> bpRlspGrupDtels = new HashSet<BpRlspGrupDtel>(0);
	private Set<BpRlspGrup> bpRlspGrups = new HashSet<BpRlspGrup>(0);
	private Set<BpRoles> bpRoleses = new HashSet<BpRoles>(0);
	private Set<BpMain> bpMains = new HashSet<BpMain>(0);
	private Set<BpAccounts> bpAccountses = new HashSet<BpAccounts>(0);
	private Set<BpSysUser> bpSysUsers = new HashSet<BpSysUser>(0);	
	public StatusCode() {
	}

	public StatusCode(String description,

			Set<BpContactAccount> bpContactAccounts,
			Set<BpRlspWtcnPrtl> bpRlspWtcnPrtls,
			Set<BpRlsp> bpRlsps,
			Set<BpRlspGrupDtel> bpRlspGrupDtels, Set<BpRlspGrup> bpRlspGrups,
			Set<BpRoles> bpRoleses,
			Set<BpMain> bpMains,
			Set<BpAccounts> bpAccountses,
			Set<BpSysUser> bpSysUsers, Set<Realm> realms) {
		this.description = description;
		this.bpContactAccounts = bpContactAccounts;
		this.realms = realms;
		this.bpRlspWtcnPrtls = bpRlspWtcnPrtls;
		this.bpRlsps = bpRlsps;
		this.bpRlspGrupDtels = bpRlspGrupDtels;
		this.bpRlspGrups = bpRlspGrups;
		this.bpRoleses = bpRoleses;
		this.bpMains = bpMains;
		this.bpAccountses = bpAccountses;
		this.bpSysUsers = bpSysUsers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusCode")
	public Set<BpContactAccount> getBpContactAccounts() {
		return this.bpContactAccounts;
	}

	public void setBpContactAccounts(Set<BpContactAccount> bpContactAccounts) {
		this.bpContactAccounts = bpContactAccounts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusCode")
	public Set<Realm> getRealms() {
		return this.realms;
	}

	public void setRealms(Set<Realm> realms) {
		this.realms = realms;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusCode")
	public Set<BpRlspWtcnPrtl> getBpRlspWtcnPrtls() {
		return this.bpRlspWtcnPrtls;
	}

	public void setBpRlspWtcnPrtls(Set<BpRlspWtcnPrtl> bpRlspWtcnPrtls) {
		this.bpRlspWtcnPrtls = bpRlspWtcnPrtls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusCode")
	public Set<BpRlsp> getBpRlsps() {
		return this.bpRlsps;
	}

	public void setBpRlsps(Set<BpRlsp> bpRlsps) {
		this.bpRlsps = bpRlsps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusCode")
	public Set<BpRlspGrupDtel> getBpRlspGrupDtels() {
		return this.bpRlspGrupDtels;
	}

	public void setBpRlspGrupDtels(Set<BpRlspGrupDtel> bpRlspGrupDtels) {
		this.bpRlspGrupDtels = bpRlspGrupDtels;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusCode")
	public Set<BpRlspGrup> getBpRlspGrups() {
		return this.bpRlspGrups;
	}

	public void setBpRlspGrups(Set<BpRlspGrup> bpRlspGrups) {
		this.bpRlspGrups = bpRlspGrups;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusCode")
	public Set<BpRoles> getBpRoleses() {
		return this.bpRoleses;
	}

	public void setBpRoleses(Set<BpRoles> bpRoleses) {
		this.bpRoleses = bpRoleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusCode")
	public Set<BpMain> getBpMains() {
		return this.bpMains;
	}

	public void setBpMains(Set<BpMain> bpMains) {
		this.bpMains = bpMains;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusCode")
	public Set<BpAccounts> getBpAccountses() {
		return this.bpAccountses;
	}

	public void setBpAccountses(Set<BpAccounts> bpAccountses) {
		this.bpAccountses = bpAccountses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusCode")
	public Set<BpSysUser> getBpSysUsers() {
		return this.bpSysUsers;
	}

	public void setBpSysUsers(Set<BpSysUser> bpSysUsers) {
		this.bpSysUsers = bpSysUsers;
	}
}

package org.contourdynamics.deskvantage.Entities;

// Generated May 16, 2016 12:41:31 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BpMain generated by hbm2java
 */
@Entity
@Table(name = "BP_Main", catalog = "deskvantage")
public class BpMain implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private BpSysUser bpSysUser;
	private BpTypeCode bpTypeCode;
	private StatusCode statusCode;
	private String description;
	private Set<BpRlspGrup> bpRlspGrups = new HashSet<BpRlspGrup>(0);
	private Set<BpRlsp> bpRlspsForSBpmain = new HashSet<BpRlsp>(0);
	private Set<BpRlsp> bpRlspsForPBpmain = new HashSet<BpRlsp>(0);
	private Set<BpIndv> bpIndvs = new HashSet<BpIndv>(0);
	private Set<BpAccounts> bpAccountses = new HashSet<BpAccounts>(0);
	private Set<BpRoles> bpRoleses = new HashSet<BpRoles>(0);
	private Set<BpCmpy> bpCmpies = new HashSet<BpCmpy>(0);
	private Set<BpContactAccount> bpContactAccounts = new HashSet<BpContactAccount>(0);


	public BpMain() {
	}

	public BpMain(BpSysUser bpSysUser, BpTypeCode bpTypeCode,
			StatusCode statusCode, String description,
			Set<BpRlspGrup> bpRlspGrups, Set<BpRlsp> bpRlspsForSBpmain,
			Set<BpRlsp> bpRlspsForPBpmain, Set<BpIndv> bpIndvs,Set<BpAccounts> bpAccountses,
			Set<BpRoles> bpRoleses, Set<BpCmpy> bpCmpies,Set<BpContactAccount> bpContactAccounts
			) {
		this.bpSysUser = bpSysUser;
		this.bpTypeCode = bpTypeCode;
		this.statusCode = statusCode;
		this.description = description;
		this.bpRlspGrups = bpRlspGrups;
		this.bpRlspsForSBpmain = bpRlspsForSBpmain;
		this.bpRlspsForPBpmain = bpRlspsForPBpmain;
		this.bpIndvs = bpIndvs;
		this.bpAccountses = bpAccountses;
		this.bpRoleses = bpRoleses;
		this.bpCmpies = bpCmpies;
		this.bpContactAccounts = bpContactAccounts;
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

	@ManyToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinColumn(name = "BP_SYS_User")
	public BpSysUser getBpSysUser() {
		return this.bpSysUser;
	}

	public void setBpSysUser(BpSysUser bpSysUser) {
		this.bpSysUser = bpSysUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type")
	public BpTypeCode getBpTypeCode() {
		return this.bpTypeCode;
	}

	public void setBpTypeCode(BpTypeCode bpTypeCode) {
		this.bpTypeCode = bpTypeCode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "StatusCode")
	public StatusCode getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(StatusCode statusCode) {
		this.statusCode = statusCode;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpMain",cascade = CascadeType.ALL)
	public Set<BpRlspGrup> getBpRlspGrups() {
		return this.bpRlspGrups;
	}

	public void setBpRlspGrups(Set<BpRlspGrup> bpRlspGrups) {
		this.bpRlspGrups = bpRlspGrups;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpMainBySBpmain",cascade = CascadeType.ALL)
	public Set<BpRlsp> getBpRlspsForSBpmain() {
		return this.bpRlspsForSBpmain;
	}

	public void setBpRlspsForSBpmain(Set<BpRlsp> bpRlspsForSBpmain) {
		this.bpRlspsForSBpmain = bpRlspsForSBpmain;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpMainByPBpmain",cascade = CascadeType.ALL)
	public Set<BpRlsp> getBpRlspsForPBpmain() {
		return this.bpRlspsForPBpmain;
	}

	public void setBpRlspsForPBpmain(Set<BpRlsp> bpRlspsForPBpmain) {
		this.bpRlspsForPBpmain = bpRlspsForPBpmain;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpMain",cascade = CascadeType.ALL)
	public Set<BpIndv> getBpIndvs() {
		return this.bpIndvs;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpMain",cascade = CascadeType.ALL)
	public Set<BpAccounts> getBpAccountses() {
		return this.bpAccountses;
	}

	public void setBpAccountses(Set<BpAccounts> bpAccountses) {
		this.bpAccountses =bpAccountses;
	}
	public void setBpIndvs(Set<BpIndv> bpIndvs) {
		this.bpIndvs = bpIndvs;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpMain",cascade = CascadeType.ALL)
	public Set<BpRoles> getBpRoleses() {
		return this.bpRoleses;
	}

	public void setBpRoleses(Set<BpRoles> bpRoleses) {
		this.bpRoleses = bpRoleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpMain",cascade = CascadeType.ALL)
	public Set<BpContactAccount> getBpContactAccounts() {
		return this.bpContactAccounts;
	}

	public void setBpContactAccounts(Set<BpContactAccount> bpContactAccounts) {
		this.bpContactAccounts = bpContactAccounts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpMain",cascade = CascadeType.ALL)
	public Set<BpCmpy> getBpCmpies() {
		return this.bpCmpies;
	}

	public void setBpCmpies(Set<BpCmpy> bpCmpies) {
		this.bpCmpies = bpCmpies;
	}
}
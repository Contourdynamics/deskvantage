package org.contourdynamics.deskvantage.Entities;

// Generated May 16, 2016 12:41:31 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BpRlspGrup generated by hbm2java
 */
@Entity
@Table(name = "BP_RLSP_GRUP", catalog = "deskvantage")
public class BpRlspGrup implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private StatusCode statusCode;
	private BpMain bpMain;
	private String groupName;
	private Set<BpRlspGrupDtel> bpRlspGrupDtels = new HashSet<BpRlspGrupDtel>(0);

	public BpRlspGrup() {
	}

	public BpRlspGrup(StatusCode statusCode, BpMain bpMain, String groupName,
			Set<BpRlspGrupDtel> bpRlspGrupDtels) {
		this.statusCode = statusCode;
		this.bpMain = bpMain;
		this.groupName = groupName;
		this.bpRlspGrupDtels = bpRlspGrupDtels;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STUS_CODE")
	public StatusCode getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(StatusCode statusCode) {
		this.statusCode = statusCode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BPMAIN")
	public BpMain getBpMain() {
		return this.bpMain;
	}

	public void setBpMain(BpMain bpMain) {
		this.bpMain = bpMain;
	}

	@Column(name = "GroupName")
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpRlspGrup")
	public Set<BpRlspGrupDtel> getBpRlspGrupDtels() {
		return this.bpRlspGrupDtels;
	}

	public void setBpRlspGrupDtels(Set<BpRlspGrupDtel> bpRlspGrupDtels) {
		this.bpRlspGrupDtels = bpRlspGrupDtels;
	}

}

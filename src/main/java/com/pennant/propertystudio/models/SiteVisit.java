package com.pennant.propertystudio.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name = "prs_site_visits")
public class SiteVisit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stvs_id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "stvs_enqr_id", nullable = false)
	private Enquiry enquiry;

	@Column(name = "stvs_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@Column(name = "stvs_remarks", length = 255)
	private String remarks;

	@ManyToOne
	@JoinColumn(name = "stvs_empl_id")
	private Employee employee;

	@Column(name = "stvs_status", length = 4)
	private String status;

	
}
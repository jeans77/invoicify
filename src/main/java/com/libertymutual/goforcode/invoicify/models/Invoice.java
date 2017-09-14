package com.libertymutual.goforcode.invoicify.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoicify_invoice")
public class Invoice {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}

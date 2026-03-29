package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolio_id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(nullable = false)
    private String portfolio_name;

    @Column(nullable = false)
    private Date created_at;

    protected Portfolio() {

    }

    public Portfolio(Client client, String portfolio_name, Date created_at) {
        this.client = client;
        this.portfolio_name = portfolio_name;
        this.created_at = created_at;
    }

    public long getPortfolio_id() {
        return portfolio_id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPortfolio_name() {
        return portfolio_name;
    }

    public void setPortfolio_name(String portfolio_name) {
        this.portfolio_name = portfolio_name;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}

package it.unisalento.db.crud.DTO;

import java.util.Date;

public class PersonaDTO {

    private int id;
    private String nome;
    private String cognome;
    private int eta;
    private String Indirizzo;
    private String citta;
    private String provincia;
    private Date dob;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String conome) {
        this.cognome = conome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getIndirizzo() {
        return Indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        Indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public PersonaDTO(){};


    public PersonaDTO(String nome, String cognome, int eta, String indirizzo, String citta, String provincia, Date dob) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        Indirizzo = indirizzo;
        this.citta = citta;
        this.provincia = provincia;
        this.dob = dob;
    }

    public PersonaDTO(int id, String nome, String cognome, int eta, String indirizzo, String citta, String provincia, Date dob) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        Indirizzo = indirizzo;
        this.citta = citta;
        this.provincia = provincia;
        this.dob = dob;
    }



}

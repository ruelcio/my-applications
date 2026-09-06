package ao.my_applications.my_app.model;

public class Candidatura {

    private Long id;
    private String nomeCandidato;
    private String vaga;
    private String email;

    public Candidatura() {
    }

    public Candidatura(Long id, String nomeCandidato, String vaga, String email) {
        this.id = id;
        this.nomeCandidato = nomeCandidato;
        this.vaga = vaga;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getVaga() {
        return vaga;
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
package proyectohastafinal.almac.myapplication.model;

import java.util.ArrayList;

public class Estilista {

    private String correo;
    private String nombreCompleto;
    private String contrasenha;
    private String nombreSalonDeBelleza;

    private ArrayList<Horario> horarios;

    private ArrayList<Agenda> agenda;

    public Estilista(String correo, String nombreCompleto, String contrasenha, SalonDeBelleza salonDeBelleza) {
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
        this.contrasenha = contrasenha;
    }

    public Estilista(){}

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public String getNombreSalonDeBelleza() {
        return nombreSalonDeBelleza;
    }

    public void setNombreSalonDeBelleza(String nombreSalonDeBelleza) {
        this.nombreSalonDeBelleza = nombreSalonDeBelleza;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Agenda> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Agenda> agenda) {
        this.agenda = agenda;
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList<Horario> horarios) {
        this.horarios = horarios;
    }
}
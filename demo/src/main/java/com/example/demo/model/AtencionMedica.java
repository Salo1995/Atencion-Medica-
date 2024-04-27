package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class AtencionMedica {
    private int idAtencion;
    private int idPaciente;
    private String motivoConsulta;
    private String diagnostico;
    private String tratamiento;
    private String medicamentosRecetados;
    private String fechaConsulta;
    private String doctorAsignado;
    private String estado;
    private String comentarios;
    //constructor sin argumentos
    public AtencionMedica() {
    }   
    // Constructor con los argumentos
    public AtencionMedica(int idAtencion, int idPaciente, String motivoConsulta, String diagnostico, String tratamiento,
                          String medicamentosRecetados, String fechaConsulta, String doctorAsignado, String estado,
                          String comentarios) {
        this.idAtencion = idAtencion;
        this.idPaciente = idPaciente;
        this.motivoConsulta = motivoConsulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.medicamentosRecetados = medicamentosRecetados;
        this.fechaConsulta = fechaConsulta;
        this.doctorAsignado = doctorAsignado;
        this.estado = estado;
        this.comentarios = comentarios;
    }
    

    // Getters y Setters
    public int getIdAtencion() {
        return idAtencion;
    }

    public void setIdAtencion(int idAtencion) {
        this.idAtencion = idAtencion;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getMedicamentosRecetados() {
        return medicamentosRecetados;
    }

    public void setMedicamentosRecetados(String medicamentosRecetados) {
        this.medicamentosRecetados = medicamentosRecetados;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getDoctorAsignado() {
        return doctorAsignado;
    }

    public void setDoctorAsignado(String doctorAsignado) {
        this.doctorAsignado = doctorAsignado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}


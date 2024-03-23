package com.example.demo;

public class AtencionMedica {
    private int id;
    private String nombrePaciente;
    private String rutPaciente;
    private String direccionPaciente;
    private String motivoConsulta;
    private String diagnostico;
    private String tratamiento;
    private String medicamentosRecetados;
    private String fechaConsulta;
    private String doctorAsignado;
    private String estado;
    private String comentarios;

    public AtencionMedica(int id, String nombrePaciente, String rutPaciente, String direccionPaciente, String motivoConsulta,
                          String diagnostico, String tratamiento, String medicamentosRecetados, String fechaConsulta,
                          String doctorAsignado, String estado, String comentarios)
    {
        this.id = id;
        this.nombrePaciente = nombrePaciente;
        this.rutPaciente = rutPaciente;
        this.direccionPaciente = direccionPaciente;
        this.motivoConsulta = motivoConsulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.medicamentosRecetados = medicamentosRecetados;
        this.fechaConsulta = fechaConsulta;
        this.doctorAsignado = doctorAsignado;
        this.estado = estado;
        this.comentarios = comentarios;
    }

    // Gets

    public int getId() {
        return id;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getRutPaciente() {
        return rutPaciente;
    }

    public String getDireccionPaciente() {
        return direccionPaciente;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public String getMedicamentosRecetados() {
        return medicamentosRecetados;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public String getDoctorAsignado() {
        return doctorAsignado;
    }

    public String getEstado() {
        return estado;
    }

    public String getComentarios() {
        return comentarios;
    }
}

package usil2026.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tt_persona", schema = "poo2")
public class PersonaEntity {


    @Id
    @Column(name="IDPERSONA")
    private Long idpersona;

    @Column(name="NOMBRE_PERSONA")
    private String nombre;

    @Column(name="APPATERNO")
    private String apellido_paterno;

    @Column(name="APPMATERNO")
    private String apeliido_materno;

    @Column(name="DNI")
    private String dni;

    @Column(name="EDAD")
    private Integer edad;

    @Column(name="ESTADO")
    private Integer estado;


    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApeliido_materno() {
        return apeliido_materno;
    }

    public void setApeliido_materno(String apeliido_materno) {
        this.apeliido_materno = apeliido_materno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }


}

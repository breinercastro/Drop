package Entity;
// Generated 15/01/2017 01:15:31 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TCliente generated by hbm2java
 */
public class TCliente  implements java.io.Serializable {


     private Integer tcliId;
     private TCasa TCasa;
     private TCodeudor TCodeudor;
     private TEmpresa TEmpresa;
     private TReferencia TReferencia;
     private String tcliCedula;
     private String tcliNombre;
     private String tcliApellido;
     private String tcliTel;
     private Set TPrestamos = new HashSet(0);

    public TCliente() {
    }

	
    public TCliente(TCasa TCasa, TCodeudor TCodeudor, TEmpresa TEmpresa, TReferencia TReferencia) {
        this.TCasa = TCasa;
        this.TCodeudor = TCodeudor;
        this.TEmpresa = TEmpresa;
        this.TReferencia = TReferencia;
    }
    public TCliente(TCasa TCasa, TCodeudor TCodeudor, TEmpresa TEmpresa, TReferencia TReferencia, String tcliCedula, String tcliNombre, String tcliApellido, String tcliTel, Set TPrestamos) {
       this.TCasa = TCasa;
       this.TCodeudor = TCodeudor;
       this.TEmpresa = TEmpresa;
       this.TReferencia = TReferencia;
       this.tcliCedula = tcliCedula;
       this.tcliNombre = tcliNombre;
       this.tcliApellido = tcliApellido;
       this.tcliTel = tcliTel;
       this.TPrestamos = TPrestamos;
    }
   
    public Integer getTcliId() {
        return this.tcliId;
    }
    
    public void setTcliId(Integer tcliId) {
        this.tcliId = tcliId;
    }
    public TCasa getTCasa() {
        return this.TCasa;
    }
    
    public void setTCasa(TCasa TCasa) {
        this.TCasa = TCasa;
    }
    public TCodeudor getTCodeudor() {
        return this.TCodeudor;
    }
    
    public void setTCodeudor(TCodeudor TCodeudor) {
        this.TCodeudor = TCodeudor;
    }
    public TEmpresa getTEmpresa() {
        return this.TEmpresa;
    }
    
    public void setTEmpresa(TEmpresa TEmpresa) {
        this.TEmpresa = TEmpresa;
    }
    public TReferencia getTReferencia() {
        return this.TReferencia;
    }
    
    public void setTReferencia(TReferencia TReferencia) {
        this.TReferencia = TReferencia;
    }
    public String getTcliCedula() {
        return this.tcliCedula;
    }
    
    public void setTcliCedula(String tcliCedula) {
        this.tcliCedula = tcliCedula;
    }
    public String getTcliNombre() {
        return this.tcliNombre;
    }
    
    public void setTcliNombre(String tcliNombre) {
        this.tcliNombre = tcliNombre;
    }
    public String getTcliApellido() {
        return this.tcliApellido;
    }
    
    public void setTcliApellido(String tcliApellido) {
        this.tcliApellido = tcliApellido;
    }
    public String getTcliTel() {
        return this.tcliTel;
    }
    
    public void setTcliTel(String tcliTel) {
        this.tcliTel = tcliTel;
    }
    public Set getTPrestamos() {
        return this.TPrestamos;
    }
    
    public void setTPrestamos(Set TPrestamos) {
        this.TPrestamos = TPrestamos;
    }




}


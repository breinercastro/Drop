package Entity;
// Generated 15/01/2017 01:15:31 PM by Hibernate Tools 4.3.1



/**
 * TRefPersona generated by hbm2java
 */
public class TRefPersona  implements java.io.Serializable {


     private int TReferenciaTrefId;
     private TReferencia TReferencia;
     private String trefpNombre;
     private String trefpApellido;
     private String trefpTel;

    public TRefPersona() {
    }

	
    public TRefPersona(TReferencia TReferencia) {
        this.TReferencia = TReferencia;
    }
    public TRefPersona(TReferencia TReferencia, String trefpNombre, String trefpApellido, String trefpTel) {
       this.TReferencia = TReferencia;
       this.trefpNombre = trefpNombre;
       this.trefpApellido = trefpApellido;
       this.trefpTel = trefpTel;
    }
   
    public int getTReferenciaTrefId() {
        return this.TReferenciaTrefId;
    }
    
    public void setTReferenciaTrefId(int TReferenciaTrefId) {
        this.TReferenciaTrefId = TReferenciaTrefId;
    }
    public TReferencia getTReferencia() {
        return this.TReferencia;
    }
    
    public void setTReferencia(TReferencia TReferencia) {
        this.TReferencia = TReferencia;
    }
    public String getTrefpNombre() {
        return this.trefpNombre;
    }
    
    public void setTrefpNombre(String trefpNombre) {
        this.trefpNombre = trefpNombre;
    }
    public String getTrefpApellido() {
        return this.trefpApellido;
    }
    
    public void setTrefpApellido(String trefpApellido) {
        this.trefpApellido = trefpApellido;
    }
    public String getTrefpTel() {
        return this.trefpTel;
    }
    
    public void setTrefpTel(String trefpTel) {
        this.trefpTel = trefpTel;
    }




}


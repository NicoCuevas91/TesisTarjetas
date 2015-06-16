package domainapp.dom.tarjeta;

import java.util.Date;

import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Title;

public abstract class Tarjeta 
{
	private int id;
	private int numTarjetaTesco;
	private Date fechaReporte;
	private Date fechaCarga;
	private String lugarObs;
	private String lineaNegocio;
	
	@MemberOrder (sequence = "1")
	@javax.jdo.annotations.Column(allowsNull = "false",length = 40)
	@Title(sequence = "1")
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	@MemberOrder (sequence = "2")
	@javax.jdo.annotations.Column(allowsNull = "false",length = 40)
	@Title(sequence = "2")
	public int getNumTarjetaTesco() 
	{
		return numTarjetaTesco;
	}
	public void setNumTarjetaTesco(int numTarjetaTesco) 
	{
		this.numTarjetaTesco = numTarjetaTesco;
	}
	@MemberOrder (sequence = "3")
	@javax.jdo.annotations.Column(allowsNull = "false",length = 40)
	@Title(sequence = "3")
	public Date getFechaReporte() 
	{
		return fechaReporte;
	}
	public void setFechaReporte(Date fechaReporte) 
	{
		this.fechaReporte = fechaReporte;
	}
	@MemberOrder (sequence = "4")
	@javax.jdo.annotations.Column(allowsNull = "false",length = 40)
	@Title(sequence = "4")
	public Date getFechaCarga() 
	{
		return fechaCarga;
	}
	public void setFechaCarga(Date fechaCarga) 
	{
		this.fechaCarga = fechaCarga;
	}
	@MemberOrder (sequence = "5")
	@javax.jdo.annotations.Column(allowsNull = "false",length = 40)
	@Title(sequence = "5")
	public String getLugarObs() 
	{
		return lugarObs;
	}
	public void setLugarObs(String lugarObs) 
	{
		this.lugarObs = lugarObs;
	}
	@MemberOrder (sequence = "6")
	@javax.jdo.annotations.Column(allowsNull = "false",length = 40)
	@Title(sequence = "6")
	public String getLineaNegocio() 
	{
		return lineaNegocio;
	}
	public void setLineaNegocio(String lineaNegocio) 
	{
		this.lineaNegocio = lineaNegocio;
	}
	
		
}

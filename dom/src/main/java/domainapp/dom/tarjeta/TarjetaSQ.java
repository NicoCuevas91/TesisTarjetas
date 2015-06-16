package domainapp.dom.tarjeta;

import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Title;

public class TarjetaSQ extends Tarjeta 
{
	private String loquesea;

	@MemberOrder (sequence = "7")
	@javax.jdo.annotations.Column(allowsNull = "false",length = 40)
	@Title(sequence = "7")
	public String getLoquesea() 
	{
		return loquesea;
	}

	public void setLoquesea(String loquesea) 
	{
		this.loquesea = loquesea;
	}

}

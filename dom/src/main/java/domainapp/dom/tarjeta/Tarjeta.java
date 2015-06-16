package domainapp.dom.tarjeta;


import javax.inject.Inject;
import javax.jdo.annotations.IdentityType;
import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Title;
import domainapp.dom.modulo.categoria.Category;


@javax.jdo.annotations.PersistenceCapable(identityType=IdentityType.DATASTORE)
public class Tarjeta {

	
	// {{ Nombre (property)
	private String nombre;

	@MemberOrder(sequence = "1")
	@javax.jdo.annotations.Column(allowsNull="false", length = 40)
    @Title(sequence="1")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	// }}
	
	// {{ Talle (property)
	private String talle;

	@MemberOrder(sequence = "2")
	@javax.jdo.annotations.Column(allowsNull="false", length = 40)
    @Title(sequence="2")
	public String getTalle() {
		return talle;
	}

	public void setTalle(final String talle) {
		this.talle = talle;
	}
	// }}
	
	// {{ Category (property)
	private Category category;

	@MemberOrder(sequence = "3")
	@javax.jdo.annotations.Column(allowsNull="false", length = 40)
    @Title(sequence="2")
	public Category getCategory() {
		return category;
	}

	public void setCategory(final Category category) {
		this.category = category;
	}
	// }}



@Inject
private ServicioTarjetas servicioRopa;
@Inject
private DomainObjectContainer container;
}

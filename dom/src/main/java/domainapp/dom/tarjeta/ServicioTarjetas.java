package domainapp.dom.tarjeta;

import org.apache.isis.applib.AbstractFactoryAndRepository;
import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.Optionality;
import org.apache.isis.applib.annotation.Parameter;
import org.apache.isis.applib.annotation.ParameterLayout;



@DomainServiceLayout(menuOrder = "30")
@DomainService(repositoryFor = Tarjeta.class)
public class ServicioTarjetas extends AbstractFactoryAndRepository 
{
	@javax.inject.Inject 
    DomainObjectContainer container;
	
	public Tarjeta cargarUnaTarjeta(@ParameterLayout (named="Numero de tarjeta") final String nombre,
							   @ParameterLayout (named="Detalle") final String talle,
							   @ParameterLayout(named="Lugar") final String description) 
	{
		final Tarjeta unaPrenda = container.newTransientInstance(Tarjeta.class);
        unaPrenda.setNombre(nombre);
        unaPrenda.setTalle(talle);
        container.persistIfNotAlready(unaPrenda);
		
		return unaPrenda;
		
	}
	public Tarjeta listarTarjetasCargadas(@ParameterLayout (named="Nombre") final String nombre,
			   @ParameterLayout (named="talle") final String talle,
			   @ParameterLayout(named="Description") final String description){
		return null;
	}
	
	
	
}
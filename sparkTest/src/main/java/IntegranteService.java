import java.util.Collection;

public interface IntegranteService {

    public void addIntegrante(Integrante integrante);
    public Collection<Integrante> getIntegrantes();
    public Integrante getIntegrante(String id);
    //Editar 1 integrante, y qeu me arroje exception si no puede editarlo
    public Integrante editIntegrante(Integrante integrante)
        throws IntegranteException;
    public void deleteIntegrante(String id);

    public boolean existIntegrante(String id);

}

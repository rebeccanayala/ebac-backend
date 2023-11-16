package service;
import dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        return null;
    }

    @Override
    public String excluir() {
        return null;
    }

    @Override
    public String atualizar() {
        return null;
    }
}

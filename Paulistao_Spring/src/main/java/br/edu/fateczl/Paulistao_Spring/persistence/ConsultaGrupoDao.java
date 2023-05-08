package br.edu.fateczl.Paulistao_Spring.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.fateczl.Paulistao_Spring.model.JogoInfo;

@Component
public class ConsultaGrupoDao implements IConsultaGrupoDao{

	@Autowired
	GenericDao gDao;

	@Override
	public List<JogoInfo> listainfo() throws SQLException, ClassNotFoundException {
		List<JogoInfo> jogoinf = new ArrayList<>();
		
		
		
		return jogoinf;
	}
}

package agenda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import tempo.*;

public class Agenda implements Serializable {
	private List<ItemAgenda> itensAgenda = new <ItemAgenda>LinkedList();
	
	public List<ItemAgenda> getItensAgenda() {
		return this.itensAgenda;
	}
	public void setItensAgenda(List<ItemAgenda> _itensAgenda) {
		this.itensAgenda = _itensAgenda;
	}
	public void inserir(Meta _meta) {
		this.itensAgenda.add(_meta);
	}
	public void inserir(Lembrete _lembrete) {
		this.itensAgenda.add(_lembrete);
	}
	public void inserir(Evento _Evento) {
		this.itensAgenda.add(_Evento);
	}
	
	static public void grava(String _nomeArquivo, Object _objeto) throws IOException {
		ObjectOutputStream buffer = new ObjectOutputStream(new FileOutputStream(_nomeArquivo));
		buffer.writeObject(_objeto);
		buffer.close();
	}
	
	/**
	 * Realiza leitura de um objeto no arquivo
	 * @param _nomeArquivo nome do arquivo a ser lido
	 * @return retorna uma instância da classe Object lida do arquivo
	 * @exception IOException problemas na leitura do arquivo
	 * @exception ClassNotFoundException problemas na conversão do objeto lido
	 */
	static public Object le(String _nomeArquivo) throws IOException, ClassNotFoundException  {
		ObjectInputStream buffer = new ObjectInputStream(new FileInputStream(_nomeArquivo));
		Object _objeto = buffer.readObject(); 
		buffer.close();
		return _objeto;
	}
	@Override
	public String toString() {
		StringBuilder agenda = new StringBuilder();
		for (int i = 0; i < this.getItensAgenda().size(); i++) {
			agenda.append("\n");
			agenda.append(this.getItensAgenda(i));
		}
		return agenda.toString();
		
	}
	
	
}
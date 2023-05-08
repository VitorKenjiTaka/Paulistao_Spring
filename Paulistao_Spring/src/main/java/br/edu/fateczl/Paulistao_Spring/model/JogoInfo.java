package br.edu.fateczl.Paulistao_Spring.model;

public class JogoInfo {
	public String Time;
	public int numJogos;
	public int Vitorias;
	public int Empates;
	public int Derrotas;
	public int Gols_Marcados;
	public int Gols_Sofridos;
	public int Saldo_Gols;
	public int Pontos;
	
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public int getNumJogos() {
		return numJogos;
	}
	public void setNumJogos(int numJogos) {
		this.numJogos = numJogos;
	}
	public int getVitorias() {
		return Vitorias;
	}
	public void setVitorias(int vitórias) {
		Vitorias = vitórias;
	}
	public int getEmpates() {
		return Empates;
	}
	public void setEmpates(int empates) {
		Empates = empates;
	}
	public int getDerrotas() {
		return Derrotas;
	}
	public void setDerrotas(int derrotas) {
		Derrotas = derrotas;
	}
	public int getGols_Marcados() {
		return Gols_Marcados;
	}
	public void setGols_Marcados(int gols_Marcados) {
		Gols_Marcados = gols_Marcados;
	}
	public int getGols_Sofridos() {
		return Gols_Sofridos;
	}
	public void setGols_Sofridos(int gols_Sofridos) {
		Gols_Sofridos = gols_Sofridos;
	}
	public int getSaldo_Gols() {
		return Saldo_Gols;
	}
	public void setSaldo_Gols(int saldo_Gols) {
		Saldo_Gols = saldo_Gols;
	}
	public int getPontos() {
		return Pontos;
	}
	public void setPontos(int pontos) {
		Pontos = pontos;
	}
	@Override
	public String toString() {
		return "JogoInfo [Time=" + Time + ", numJogos=" + numJogos + ", Vitórias=" + Vitorias + ", Empates=" + Empates
				+ ", Derrotas=" + Derrotas + ", Gols_Marcados=" + Gols_Marcados + ", Gols_Sofridos=" + Gols_Sofridos
				+ ", Saldo_Gols=" + Saldo_Gols + ", Pontos=" + Pontos + "]";
	}
}

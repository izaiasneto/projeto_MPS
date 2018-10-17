package business.model;

public class Data {

	 private int dia;
	 private int mes;
	 private int ano;

	public Data(int dd, int mm, int aa) {
		this.dia = dd;
	    this.mes = mm;
	    this.ano = aa;
	}
		
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int compareTo(Data d) {
        if (ano == d.ano) {
            if (mes == d.mes) {
                return dia - d.dia;
            } else {
                return mes - d.mes;
            }
        } else {
            return ano - d.ano;
        }
    }
}

package model.exeptions;

public class DomainException  extends RuntimeException{

	/* pode ser uma extensão da classe exception ou uma extensão da classe RunTimeException. A dif é que a Run é um tipo de 
	   excecao que o compilador  não obriga a tratar, se não se colocar um try catch no principal o compilador não se queixa. Se se colocar
	   só Exeption o compilador obriga a tratar, é o mesmo que acontece com a parseException*/
	/*esta classe é serializable, então precisa de ter um número de versão, quer dizer que classes que são serializables os objetos dessa classe podem ser convertidos par
	bytes e trafegarem em redes e ser gravados em arquivos, etc.., é um padrão do java*/
	private static final long serialVersionUID = 1L; //valor padrão de versão, declaração da classe serializeble

	public DomainException (String msg) { /*/ construtor com string como argumento passado para o construtor da super classe, serve para permitir que se possa instanciar 
											a exceção personalizada passando uma mensagem para ela que fica armazenada dentro da exceção*/
		super(msg);
	}


}

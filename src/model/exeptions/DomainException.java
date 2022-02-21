package model.exeptions;

public class DomainException  extends RuntimeException{

	/* pode ser uma extens�o da classe exception ou uma extens�o da classe RunTimeException. A dif � que a Run � um tipo de 
	   excecao que o compilador  n�o obriga a tratar, se n�o se colocar um try catch no principal o compilador n�o se queixa. Se se colocar
	   s� Exeption o compilador obriga a tratar, � o mesmo que acontece com a parseException*/
	/*esta classe � serializable, ent�o precisa de ter um n�mero de vers�o, quer dizer que classes que s�o serializables os objetos dessa classe podem ser convertidos par
	bytes e trafegarem em redes e ser gravados em arquivos, etc.., � um padr�o do java*/
	private static final long serialVersionUID = 1L; //valor padr�o de vers�o, declara��o da classe serializeble

	public DomainException (String msg) { /*/ construtor com string como argumento passado para o construtor da super classe, serve para permitir que se possa instanciar 
											a exce��o personalizada passando uma mensagem para ela que fica armazenada dentro da exce��o*/
		super(msg);
	}


}

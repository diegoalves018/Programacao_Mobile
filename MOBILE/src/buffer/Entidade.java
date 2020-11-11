package buffer;

public abstract class Entidade implements Runnable {
	
	protected String nome;
	protected IBuffer bufferShared;
	
	public Entidade(String nome, IBuffer bufferShared) {
		this.bufferShared = bufferShared;
		this.nome = nome;		
	}
	
	
	public String getNome() {
		return this.nome;
	}

	@Override
	public abstract void run();
	
	@Override
	public String toString() {
		return this.getClass().getName() + " " + this.nome;
	}
}


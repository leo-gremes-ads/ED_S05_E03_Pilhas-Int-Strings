package lib.model;

public class No
{
	int valor;
	No proximo;
	
	@Override
	public String toString()
	{
		return "[" + String.valueOf(valor) + "]";
	}
}
package lib.model;

public class No
{
	String valor;
	No proximo;
	
	@Override
	public String toString()
	{
		return "[" + String.valueOf(valor) + "]";
	}
}
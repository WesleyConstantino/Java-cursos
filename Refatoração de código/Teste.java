class Teste
{
	public static void main (String args[])
	{
		Aluno a1 = new Aluno("Martin Fowler",
							"ADS",
							"Gradua��o",
							11223344,
							true,
							920.50,
							20.5);
		Aluno a2 = new Aluno("Kent Beck",
							"Computa��o Aplicada",
							"Mestrado",
							22334455,
							false,
							2150.45,
							0);
		System.out.println(a1.getDados());
		System.out.println(a2.getDados());
	}
}

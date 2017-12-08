package check;

public class Checker 
{
	String code, str;
	int i, e, calcul, total, result, resultat, save;
	
	public Checker(String code)
	{
		this.code = code;
	}
	
	public boolean parsing()
	{
		i = 0;
		e = code.length() - 1;
		str = "";
		total = 0;
		result = 0;
		resultat = 0;
		save = 0;
		
		while (i < code.length() - 2)
		{
			i++;
		}
		while (i >= 1)
		{
			calcul = 0;
			calcul = Character.getNumericValue(code.charAt(i)) * 2;
			if (calcul > 9)
			{
				calcul = calcul - 9;
			}
			i = i - 2;
			total = total + calcul;
		}
		while (e >= 0)
		{
			save = 0;
			save = Character.getNumericValue(code.charAt(e));
			result = result + save;
			e = e - 2;
		}
		resultat = total + result;
		if ((resultat % 10) == 0)
		{
			System.out.println(String.valueOf(resultat));
			return (true);
		}
		else
		{
			return (false);
		}
	}
}

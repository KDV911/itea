package lecture6;

public enum Season
{
	WINTER("snow", 91),
	SUMMER("sun", 92),
	SPRING("8 march", 90),
	AUTUMN("november", 93);

	String accociation;
	int days;

	Season(String accociation, int days)
	{
		this.accociation = accociation;
		this.days = days;
	}


}

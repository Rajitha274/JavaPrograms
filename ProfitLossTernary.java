class ProfitLossTernary
{
	public static void main(String[] args)
	{
	int sellingPrice=20000, costPrice=20000;
	String s = (sellingPrice>costPrice)?"Profit":(sellingPrice<costPrice)?"Loss":"no loss no profit";
	System.out.println(s);
	}
}
class ProfitLoss
{
	public static void main(String[] args)
	{
		int costPrice = 20000, sellingPrice=15000;
          	if(sellingPrice>costPrice)
		{
			System.out.println("profit");
			double profit =sellingPrice - costPrice;
			double profitPer =(profit/costPrice)*100;
			System.out.println(profitPer);
		}
		else if(sellingPrice<costPrice)
		{
			System.out.println("loss");
 			double loss = costPrice-sellingPrice;
			double lossPer =(loss/costPrice)*100;
           		System.out.println(lossPer);

		}
		else
		{
			System.out.println("No profit No loss");
          	}
	}
}
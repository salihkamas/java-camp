package Concretes;

import Abstracts.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService {

	@Override
	public void sell(User user, Game game) {
		System.out.println(
				game.getName() + " was successfully sold to " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void sellWithCampign(User user, Game game, Campaign campaign) {
		double newPrice = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100);
		System.out.println(game.getName() + " was successfully sold to " + user.getFirstName() + " "
				+ user.getLastName() + " with a campaign : New Price : " + newPrice);
	}

}

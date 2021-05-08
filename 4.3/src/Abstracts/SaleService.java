package Abstracts;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface SaleService {
	void sell(User user, Game game);

	void sellWithCampign(User user, Game game, Campaign campaign);
}

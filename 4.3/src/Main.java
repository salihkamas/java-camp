import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.SaleManager;
import Concretes.UserCheckManager;
import Concretes.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(1998, 9, 26);
		Game game = new Game(1, "GTA V", 200);
		User salih = new User(1, "Salih", "Kamaş", dateOfBirth, "11111111111");
		Campaign campaign = new Campaign(1, "TestCampaign", 50);
		MernisServiceAdapter checkManager = new MernisServiceAdapter();
		UserManager userManager = new UserManager();
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		SaleManager saleManager = new SaleManager();

		gameManager.add(game);
		userManager.add(salih);
		campaignManager.add(campaign);
		// checkManager.CheckIfRealPerson(salih);
		saleManager.sell(salih, game);
		saleManager.sellWithCampign(salih, game, campaign);

	}

}

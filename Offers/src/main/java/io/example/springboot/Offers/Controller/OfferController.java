package io.example.springboot.Offers.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfferController {

	@RequestMapping("/offers")
	public List<Offer> getAllOffers() {
		return Arrays.asList(
				new Offer("1","Offer1","Cash Transactor Product"),
				new Offer("2","Offer2","Offset Product"),
				new Offer("3","Offer3","Online Product")
				);
	}
}

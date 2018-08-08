package guestlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import guestlist.dao.GuestDAO;
import guestlist.entity.Guest;

@Controller
@RequestMapping("/guest")
public class GuestController {
	
	@Autowired
	private GuestDAO guestDAO;
	
	@RequestMapping("/list")
	public String listGuest(Model theModel){
		List<Guest> theGuests = guestDAO.getGuests();
		
		theModel.addAttribute("guests",theGuests);
		
				
		return "guests-list";
	}
	
	@RequestMapping("/showFormForAdd")
	public String dodajGoscia(Model theModel) {
		
		Guest theGuest = new Guest();
		
		theModel.addAttribute("guest", theGuest);
		
		return "add-guest";
	}
	@RequestMapping("/showFormForUpdate")
	public String aktualizujGoscia(@ModelAttribute("guestId")int theId, Model theModel)
	{
		Guest theGuest = guestDAO.getGuest(theId);
		theModel.addAttribute("guest", theGuest);
		return "add-guest";
	}
	
	@PostMapping("/saveGuest")
	public String saveGuest(@ModelAttribute("guest")Guest theGuest)
	{
		guestDAO.saveGuest(theGuest);
		
		return "redirect:/guest/list";
		
	}
	@RequestMapping("/showFormForDelete")
	public String showFormForDelete(@ModelAttribute("guestId")int theId)
	{
		guestDAO.deleteGuest(theId);
		
		return "redirect:/guest/list";
	}

}

package guestlist.dao;

import java.util.List;

import guestlist.entity.Guest;

public interface GuestDAO {
	
	public List<Guest> getGuests();

	public void saveGuest(Guest theGuest);

	public Guest getGuest(int theId);

	public void deleteGuest(int theId);



}

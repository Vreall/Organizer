package guestlist.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import guestlist.entity.Guest;

@Repository
public class GuestDAOImpl implements GuestDAO {

	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Guest> getGuests() {
		Session currentSession= sessionFactory.getCurrentSession();
		Query<Guest> theQuery = currentSession.createQuery("from Guest", Guest.class);
		
		List<Guest> guests = theQuery.getResultList();
		
		
		return guests;
	}

	@Override
	@Transactional
	public void saveGuest(Guest theGuest) {
		Session currentSession = sessionFactory.getCurrentSession();
		
	currentSession.saveOrUpdate(theGuest);
		
		
	}

	@Override
	@Transactional
	public Guest getGuest(int theId) {
		Session currentSesstion = sessionFactory.getCurrentSession();
		Guest theGuest = currentSesstion.get(Guest.class, theId);
		
		return theGuest;
	}

	@Override
	@Transactional
	public void deleteGuest(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Guest theGuest = currentSession.get(Guest.class, theId);
	currentSession.delete(theGuest);
	
	}

}

package com.hcl.pcf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pcf.dao.TicketBookingDao;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);
	}

}

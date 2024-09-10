package com.example.DrawLoterya.service;

import com.example.DrawLoterya.dto.TicketDto;
import com.example.DrawLoterya.dto.UserDto;
import com.example.DrawLoterya.model.Ticket;
import com.example.DrawLoterya.model.User;
import com.example.DrawLoterya.repositories.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketCrudService implements UserService<TicketDto> {
    private final TicketRepository ticketRepository;

    public TicketCrudService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void create(TicketDto ticketDto) {
        Ticket ticket = mapToEntity(ticketDto);
        ticketRepository.save(ticket);
    }

    @Override
    public void update(TicketDto ticketDto) {

    }

    @Override
    public String get(String key) {
        return null;
    }
    public static TicketDto mapToDto(Ticket ticket) {
        TicketDto ticketDto = new TicketDto();
        ticketDto.setId(ticket.getId());
        ticketDto.setName(ticket.getName());
        ticketDto.setDescription(ticket.getDescription());
        ticketDto.setPrice(ticket.getPrice());
        ticketDto.setUser(
                ticket.getUser().getEmail());
        return ticketDto;
    }
    public static Ticket mapToEntity(TicketDto ticketDto) {
        Ticket ticket = new Ticket();
        ticket.setId(ticketDto.getId());
        ticket.setName(ticketDto.getName());
        ticket.setDescription(ticketDto.getDescription());
        ticket.setPrice(ticketDto.getPrice());

        return ticket;
    }
}

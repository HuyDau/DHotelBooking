package com.DHotel.DHotel.service.Booking;

import com.DHotel.DHotel.dto.Response;
import com.DHotel.DHotel.entity.Booking;

public interface IBookingService {
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}

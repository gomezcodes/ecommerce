package com.gomez.microservices.customer_microservice.customer;


/**
 * Represents a response containing customer information.
 *
 * @param id        the unique identifier of the customer
 * @param firstName the customer's first name
 * @param lastName  the customer's last name
 * @param email     the customer's email address
 * @param phone     the customer's phone number
 * @param address   the customer's street address
 * @param city      the customer's city of residence
 */
public record CustomerResponse(
    String id,
    String firstName,
    String lastName,
    String email,
    String phone,
    String address,
    String city
) {

}

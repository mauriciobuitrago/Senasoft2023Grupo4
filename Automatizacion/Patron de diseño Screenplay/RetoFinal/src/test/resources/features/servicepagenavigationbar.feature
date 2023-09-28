Feature: utility navigation bar

  Scenario: It will be validated that the anchor element "Booking.com" redirects to the Vuelos page.
    Given the user is on the home page of the application
    When  the user clicks on a navigation button "Vuelos"
    Then user will then see on the screen the page title Compara y reserva vuelos fácilmente Vuelos

  Scenario: It will be validated that the anchor element "Booking.com" redirects to the Alquileres de coche page.
    Given the user is on the home page of the application
    When  the user clicks on a navigation button "Alquiler de coches"
    Then user will then see on the screen the page title Compara y reserva vuelos fácilmente Alquiler de coches

  Scenario: It will be validated that the anchor element "Booking.com" redirects to the Atracciones turisticas page.
    Given the user is on the home page of the application
    When  the user clicks on a navigation button "Atracciones turisticas"
    Then user will then see on the screen the page title Compara y reserva vuelos fácilmente Atracciones turisticas

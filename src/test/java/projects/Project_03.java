package projects;

public class Project_03 {
    /* Test Case 01 - Validate the default Book your trip form
        Navigate to https://techglobal-training.com/frontend/project-3
        Validate that the “One way” radio button is displayed enabled and selected by default
        Validate that the “Round trip” radio button is displayed enabled and not selected by default
        Validate that the “Cabin Class” label and dropdown are displayed
        Validate that the “From” label and dropdown are displayed
        Validate that the “To” label and dropdown are displayed
        Validate that the “Depart” label and date picker is displayed
        Validate that the “Return” label and date picker is displayed and disabled
        Validate that the “Number of passengers” label and dropdown are displayed and 1 is the default
        Validate that the “Passenger 1” category label and dropdown are displayed and “Adult (16-64)” is the default
        Validate that the “BOOK” button is displayed and enabled
     */

    /* Test Case 02 - Validate the Book your trip form when Round trip is selected
        Navigate to https://techglobal-training.com/frontend/project-3
        Click on the “Round trip” radio button and validate it is selected
        Validate that the “One way” radio button is not selected
        Validate that the “Cabin Class” label and dropdown are displayed
        Validate that the “From” label and dropdown are displayed
        Validate that the “To” label and dropdown are displayed
        Validate that the “Depart” label and date picker is displayed
        Validate that the “Return” label and date picker is displayed
        Validate that the “Number of passengers” label and dropdown are displayed and 1 is the default
        Validate that the “Passenger 1” label and dropdown are displayed and “Adult (16-64)” is the default
        Validate that the “BOOK” button is displayed and enabled
     */

    /* Test Case 03 - Validate the booking for 1 passenger and one way
        Navigate to https://techglobal-training.com/frontend/project-3
        Select the “One way” radio button
        Select “Business” for the “Cabin Class” dropdown
        Select “Illinois” for the “From” dropdown
        Select “Florida” for the “To” dropdown
        Select the next week for the ”Depart”
        Select “1” for the “Number of passengers” dropdown
        Select “Senior (65+)” for the Passenger 1 dropdown
        Click on the “BOOK” button
        Validate the booking information displayed below
        DEPART
        IL to FL
        {dynamic date}
        Number of passengers: 1
        Passenger 1: Senior (65+)
        Cabin Class: Business
     */

    /* Test Case 04 - Validate the booking for 1 passenger and round trip
        Navigate to https://techglobal-training.com/frontend/project-3
        Select the “Round trip” radio button
        Select “First” for the “Cabin Class” dropdown
        Select “California” for the “From” dropdown
        Select “Illinois” for the “To” dropdown
        Select the next week for the ”Depart”
        Select the next month for the “Return”
        Select “1” for the “Number of passengers” dropdown
        Select “Adult (16-64)” for the Passenger 1 dropdown
        Click on the “BOOK” button
        Validate the booking information displayed below
        DEPART
        CA to IL
        {dynamic date}
        Number of passengers: 1
        Passenger 1: Adult (16-64)
        Cabin Class: First
        RETURN
        IL to CA
        {dynamic date}
     */

    /* Test Case 05 - Validate the booking for 2 passengers and one way
        Navigate to https://techglobal-training.com/frontend/project-3
        Select the “One way” radio button
        Select “Premium Economy” for the “Cabin Class” dropdown
        Select “New York” for the “From” dropdown
        Select “Texas” for the “To” dropdown
        Select the next day for the ”Depart”
        Select “2” for the “Number of passengers” dropdown
        Select “Adult (16-64)” for the Passenger 1 dropdown
        Select “Child (2-11)” for the Passenger 2 dropdown
        Click on the “BOOK” button
        Validate the booking information displayed below
        DEPART
        NY to TX
        {dynamic date}
        Number of passengers: 2
        Passenger 1: Adult (16-64)
        Passenger 2: Child (2-11)
        Cabin Class: Premium Economy
     */


}

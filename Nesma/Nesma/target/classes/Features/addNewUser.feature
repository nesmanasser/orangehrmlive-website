Feature: Add New User and Verify User Count

  Scenario: Verify user count increases after adding a new user
    Given the User Is On The Login Page
    When the User Enter "admin" As Username And "admin123" As Password
    And clicks On The Admin Tab To Add New User
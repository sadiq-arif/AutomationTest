Feature: Automation Test

#Login to application
#- Change the sorting dropdown from “Name (A to Z)” to “Name (Z to A)
#- Perform the transactions
#o Place order(s), if the price of the item is less than $15.99.
#o Don’t check prices of individual products. Please use any logic to check and compare
#the amount using the loops.
#o Click on the cart.
#o Now you will be on the Cart page, we have one more issue with the placed order.
#You have to check if any product price is less the 9, than it is ok, but if the value is
#greater than 9 then we have to remove the product.
#o Once the Cart list is finalized, press the checkout. Information page will be open.
#o Press continue without filling the form. An error will be generated, Place the
#assertion on the error.
#o Now fill the form, and press continue.
#o Press the finish button.
#o Once the order is placed. Thank you page will open. Get the thank you message
#from the page and write it on the console

  @regression
  Scenario: Task 1
    Given user enter valid username in username field
    And   user enter valid password in password field
    When  user click on login button
    Then  user logged in successfully
    And   user change the dropdown from Z to A
    And   user add to cart the less price products
    And   user click on cart button
    Then  user remove the product of higher price
    And   user click on checkout button
    When  user click on continue button
    Then  user will see the error
    And   user fill the checkout information
    And   user click on finish button
    Then  user will see the thankyou message

#    Now open new tab, and the open the new URL:
#https://courses.ultimateqa.com/users/sign_in
#- Enter the same username and password, and press the sign in button

  @regression
  Scenario: Task 2
    Given user redirects to ultimatega page in new tab
    And   user enters username of ultimatega
    And   user enters password of ultimatega
    Then  user clicks on Sign In of ultimatega

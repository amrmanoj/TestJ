Feature: Facebook title testing using firefox

  Scenario: Title test
    Given open firefox browser
    When launch website "https:\\www.facebook.com"
    Then the title should be "Facebook"
    When teardown site
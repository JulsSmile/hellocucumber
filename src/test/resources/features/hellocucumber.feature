Feature: Translate a word
  As usual user
  I want to use Google Translator


  Background: User navigates to Google Translator page
    Given I am on the Standard form of translator page on URL "https://translate.google.com"
    Then I should see empty form to input text for translation

  Scenario: Looking up the translation of 'apple'

    Given the user is on the google translate page
    And selected languages from 'английский' to 'украинский'
    When the user looks up the translation of the word 'apple'
    Then they should see the translation 'яблуко'
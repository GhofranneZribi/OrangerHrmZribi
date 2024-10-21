#Auteur: zribi
Feature: Consultation du menu de HomePage

  Scenario Outline: Acceder au chaque menu de la page dacceuil
    Given Admin est connecte avec le bon username "Admin" et le bon password "admin123"
    When Admin clique sur le "<menu>"
    Then La page du menu est affichee et contient le nom de "<menu>"

    Examples: 
      | menu        |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |
      | Maintenance |
      | Claim       |
      | Buzz        |

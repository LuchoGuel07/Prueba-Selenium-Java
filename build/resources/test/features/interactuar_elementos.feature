Feature: Buscar un libro dentro de DemoQA

  Scenario Outline: Yo como usuario quiero buscar un libro y ver su informacion
    Given Ingresar al portal
    When Seleccionar la opcion de Book Store Aplicattion y buscar el libro <titulo>
    Then Puedo ver la informacion del libro con el titulo <titulo>

    Examples:
      | titulo                     |
      | Understanding ECMAScript 6 |
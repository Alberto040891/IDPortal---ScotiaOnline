@tag1
Feature: Demo de ScotiaOnline

Rule: El usuario podrá registrar sus datos de una solicitud de TDC.

Background: Navegar a IDPortal.
    Given Navego a la pagina del IDPortal
    When Ingreso con un usuario
    And Una contraseña
    And Doy click en botón Entrar

Scenario: Montrar la funcionalidad de la plantilla ScotiaOnline
    And Selecciono la opción de la base cliente DGPNomina
    Then Selecciono la opción Digitalización
    And Despues Nuevo Documento Electronico
    Then Elijo el expediente ScotiaBank
    Then Lleno los campos solicitados en la primer pagina 
    And Doy click en check de autorizacion
    And Doy click en botón Continuar
    Then En la segunda pagina seguimos llenando los datos solicitados
    And Doy click en botón Continuar pagina 2
    Then En la tercera pagina seguimos llenando los datos solicitados
    And Doy click en botón Continuar 3
    And Click en botón continuar
    Then Finalizo dando clicn en botón Continuar para publicar el expediente

    



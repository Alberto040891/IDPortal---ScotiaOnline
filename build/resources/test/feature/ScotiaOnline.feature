Feature: Demo de ScotiaOnline

Scenario: Montrar la funcionalidad de la plantilla ScotiaOnline
    Given Estoy en la pagina del IDPortal
    When Ingreso con un usuario
    And Una contraseña
    And Doy click en botón Entrar
    And Selecciono la opción de la base cliente DGPNomina
    Then Selecciono la opción Digitalización
    And Despues Nuevo Documento Electronico
    Then Elijo el expediente ScotiaBank
    Then Lleno los campos solicitados en la primer pagina 
    And Doy click en botón Continuar
    Then En la segunda pagina seguimos llenando los datos solicitados
    And Doy click en botón Continuar
    Then En la tercera pagina seguimos llenando los datos solicitados
    And Doy click en botón Continuar
    Then Finalizo dando clicn en botón Continuar para publicar el expediente

    



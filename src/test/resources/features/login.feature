Feature: Iniciar sesion en la pagina
  Yo como usuario
  Necesito iniciar sesion en la pagina
  Para ver los productos

  Scenario: Validar el inicio de sesion correcto
    Given el usuario navega al sitio web
    When ingresa credenciales validas
    Then deberia ver la pagina de productos
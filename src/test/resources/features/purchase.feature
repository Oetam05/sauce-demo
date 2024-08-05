Feature: Proceso de compra
  Yo como usuario
  Necesito realizar todo el proceso de compra
  Para verificar su funcionamiento

  Background:
    Given el usuario navega al sitio web
    When ingresa credenciales validas

  Scenario: Validar el proceso de compra correcto
    And agrega productos al carrito de compra
    And completa todo el registro de la orden
    Then el sistema deberia procesar la compra


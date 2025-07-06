#Author: Alexander Valencia Delgado #Language: en

Feature: Autenticacion en OrangeHRM
  Como usuario del sistema OrangeHRM
  Quiero poder iniciar sesion con mis credenciales
  Para acceder al dashboard del sistema

  Scenario: Login exitoso con credenciales válidas
    Given que estoy en la pagina de login de OrangeHRM
    When ingreso el usuario "Admin" y la contrasena "admin123"
    And hago clic en el boton "Login"
    Then debo estar autenticado y ver el dashboard
    And debo ver el nombre de usuario en la esquina superior derecha

  Scenario: Validar elementos del dashboard después del login
    Given que estoy en la pagina de login de OrangeHRM
    When ingreso credenciales validas y me autentico
    Then debo ver el menu principal con las opciones:
  | Admin        |
  | PIM          |
  | Leave        |
  | Time         |
  | Recruitment  |
  | My Info      |
  | Performance  |
  | Dashboard    |
  | Directory    |

  Scenario: Navegar al módulo Leave y verificar su carga
    Given que estoy en la página de "Leave"
    When la página se carga completamente
    Then debo ver los filtros "From Date", "To Date", "Show Leave with Status", "Leave Type", "Employee Name", "Sub Unit", e "Include Past Employees"
    And debo ver las columnas de la tabla "Date", "Employee Name", "Leave Type", "Leave Balance (Days)", "Number of Days", "Status", "Comments", y "Actions"
    And si no hay registros, debo ver el mensaje "No Records Found"

  Scenario: Filtrar por tipo de licencia y validar resultados
  Given que estoy en la página de "Leave"
  When selecciono el tipo de licencia "CAN - Vacation"
  And hago clic en el botón "Search"
  Then debo ver resultados en la tabla de licencias

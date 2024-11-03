# Agenda Online Desde Cero

Aplicación de agenda en Android que permite agregar, ver y gestionar contactos usando SQLite. La aplicación incluye opciones de configuración y una sección "Acerca de" para ver información sobre el desarrollador.

## Características

- **Crear Base de Datos**: Inicializa la base de datos SQLite.
- **Agregar Contacto**: Permite agregar nuevos contactos.
- **Ver Contactos**: Muestra todos los contactos almacenados.
## Estructura del Proyecto

### MainActivity

- **onCreateOptionsMenu**: Muestra el menú de opciones de la app.
- **onOptionsItemSelected**: Controla la selección de opciones del menú.
    - `crearBase()`: Crea la base de datos.
    - `nuevoRegistro()`: Abre una actividad para agregar un nuevo contacto.
    - `verContactos()`: Abre una lista de todos los contactos.

### DBHelper

Clase que extiende `SQLiteOpenHelper` para gestionar la base de datos.

- **onCreate**: Crea la tabla de contactos.
- **onUpgrade**: Actualiza la base de datos si hay una nueva versión.

### VerContactosActivity

## Instalación

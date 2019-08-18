# PruebaMarble
Prueba técnica QA automatizada para el proceso de selección con Marble

1. Información general
Proyecto de automatización web

El proyecto de automatización valida los siguiente pasos:
a. Iniciar una instancia en Google Chrome
b. Navegar a la URL htts://www.google.com.co
c. digitar la palabra “pruebaz”
d. Validar que se cargue la palabra correcta “pruebas”
e. Hacer click sobre la palabra correcta
f. Obtener la lista de los resultados y validar que la cantidad de resultados sea mayor a 6.


2. objetivo del caso de automatización
Verifique la escritura correcta de la palabra "pruebas".
Como usuario de la página de google.
Quiero verificar la escritura correcta de la palabra "pruebas".
Para cumplir con una búsqueda correcta de resultados.

3. Configuraciones requeridas para la ejecución del proyecto
  3.1. Versión Gradle: 4.10
  3.2. Versión Java: 1.8
  3.3. Versión Google Chrome 76.0 o superior
  3.4. para el Debug Configurations en el IDE, la opción Shorten command line, seleccionar classpath file
  
4. Ejecución de la prueba
Importar la carpeta <<co.com.proyectobase.screenplay>> del proyecto desde la IDE (IntelliJ IDEA o Eclipse) para la ejecución, y dirigirse a la siguiente ruta del proyecto
co.com.proyectobase.screenplay\src\test\java\co\com\proyectobase\screenplay\runners\VerifyCorrectWritingOfWord

una vez abierto la clase runner a ejecutar <<VerifyCorrectWritingOfWord>> ubicamos la pestaña Run/Ejecutar (tener en cuenta el idioma)
y clic en la opción que nos indique para ejecutar <<VerifyCorrectWritingOfWord>> y esto nos ejecuta el escenario de prueba planteado desde el navegador Google Chrome

5. Utilidades
  5.1. Serenity
  5.2. Java
  5.3. Gradle
  5.4. cucumbre
  5.5. Selenium
  5.6. JUnit

6. Uso de Serenitu
Pasos a seguir para generar el reporte de serenity por la temrinal del ID de desarrollo:
a.Ubicarse en la sección de terminal.
b.Verificar que este en la ruta correcta del proyecto
c.Ejecutar el comando y dar enter.
	Comando: mvn serenity:aggregate
d.Esperar a que se ejecute el proceso.
e.Finalizado el proceso del comando anterior, sale en pantalla un BUILD SUCCESS.
f.Ir a la ruta co.com.proyectobase.screenplay\target\site\serenity\XXXX.html
	(Estando en serenity, buscar el primer archivo con extensión ".html")
g.Abrir el archivo con extensión html con el navegador de preferencia y revisar los reportes generados por serenity.

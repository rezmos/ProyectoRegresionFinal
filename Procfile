--Crear un proyecto en Heroku-Maven y Git
--Ubicarse en el directorio donde almacenara su proyecto
--Abrir una consola Git bash
--loggearse con Heroku - consola DOS
heroku login
--Clonar proyecto heroku con la estructura necesaria
git clone https://github.com/heroku/java-getting-started.git regresion-lineal-proyecto
--Ubicarse dentro del proyecto cloneado y crear heroku
heroku create
--Desplegarel codigo
git push heroku master
--Asegurese que por lo menos una instancia se este ejecutando
heroku ps:scale web=1
--Abrir la aplicacion
heroku open
--construir aplicacion maven
mvn clean install
--Ejecutar localmente
heroku local web -f Procfile.windows
--Pruebe:
Localhost:500/hello
--Importe el proyecto en netbeans, realice los cambios
--a. cambiar nombre de proyecto
--b. modifique la entrada /..


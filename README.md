# Api BS ApiRestPokeAPI

[![npm version](https://img.shields.io/github/workflow/status/dlfigueira/spring-pokeapi/CI)](https://img.shields.io/github/workflow/status/dlfigueira/spring-pokeapi/CI)
[![Actions](https://github.com/gothinkster/spring-boot-realworld-example-app/workflows/Java%20CI/badge.svg)](https://github.com/gothinkster/spring-boot-realworld-example-app/actions)
[![npm version](https://img.shields.io/badge/realese-1.0.0-green?style=plastic&logo=git)](https://img.shields.io/badge/realese-1.0.0-green?style=plastic&logo=git)
[![codecov](https://codecov.io/gh/ZOMELI/ApiRestPokeAPI/branch/main/graph/badge.svg?token=SfmqQhg9qy)](https://codecov.io/gh/ZOMELI/ApiRestPokeAPI?style=plastic)

El Api BS ApiRestPokeAPI, consume la información de los pokemons, el detalle de estos y las evoluciones expuesta en [PokéAPI](https://pokeapi.co/).

### URL: [https://zomeli-villanueva-48491134.herokuapp.com](https://zomeli-villanueva-48491134.herokuapp.com) 

#### * GET
>   [/pokemon/](https://zomeli-villanueva-48491134.herokuapp.com) : Consulta la información de los pokemones, el detalle de estos, como Tipo de pokemón(type), Peso(weight) y Lista de habilidades(ability).

#### * GET
>   [/pokemon/{id}](https://zomeli-villanueva-48491134.herokuapp.com) : Consulta la información del pokemon, el detalle como Tipo de pokemón(type), Peso(weight) y Lista de habilidades(ability); por Identificador de Pokemón.

#### * GET
>   [/evolution/{id}](https://zomeli-villanueva-48491134.herokuapp.com) : Consulta la información del pokemon(Description), y sus evoluciones(Evolutions); por Identificador de Evolución.

### CheckList Api BS ApiRestPokeAPI
- [x] Historia 1: Developer funcionalidad (Consultar sista Pokemón,y detalles como type,weight,ability ).
- [x] Historia 2: funcionalidad (Consultar Pokemon y sus evoluciones).
- [x] Subir a repositorio (Se utilizo repositorio [Github-ApiRestPokeAPI](https://github.com/ZOMELI/ApiRestPokeAPI))
- [x] Covertura de test (Junit5, Mochito), se integro con [Codecov-ApiRestPokeAPI](https://app.codecov.io/gh/ZOMELI/ApiRestPokeAPI).
- [x] Implementación de memoria en cache (Se utilizo Ecache).
- [x] Despliegue Api BS ApiRestPokeAPI en la nube (Se utilizo Heroku Cloud como nube [herokuCloud-ApiRestPokeAPI](https://zomeli-villanueva-48491134.herokuapp.com))
- [x] Documentar el despliegue de API en la nube.
- [x] Manejar listado de errores.
- [ ] Consumir API desde front-end (opcional).

## Install

### Configuración del entorno
Requisitos mínimos: asegúrese de que el siguiente software esté instalado en su PC:
* [JAVA JDK 8](https://adoptium.net/releases.html?variant=openjdk17&jvmVariant=hotspot)
* [Maven 3.6.3](https://maven.apache.org/) 

### Maven Repository
Para este proyecto se utilizaron los siquientes recursos:

* [SpringBoot 2.7.2](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web)
* [SpringBoot DevTools](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
* [Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok)
* [Junit 5](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.9.0)
* [Retrofit 2](https://mvnrepository.com/artifact/com.squareup.retrofit2/retrofit)
* [RxJava2](https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxjava)
* [EhCache](https://mvnrepository.com/artifact/org.ehcache/ehcache)
* [Swagger2](https://mvnrepository.com/artifact/io.springfox/springfox-swagger2)
* [Jacoco](https://mvnrepository.com/artifact/org.jacoco/jacoco-maven-plugin/0.8.8)


## License
Este proyecto no tiene licencia.

## Ejecución
El proyecto ejecutar con IntellijIdea o usar maven para construir el proyecto y ejecutar pruebas.


Construir el proyecto,ejecución de test unitarios (así como generar informes de jacoco):
```
mvn clean install
```
Ejecución de test unitarios
```
mvn test
```
Arrancar directamente con Spring Boot
```
mvn spring-boot:run
```

## Desplegar Api ApiRestPokeAPI con Heroku Cloud
[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://heroku.com/deploy)
#### Instalación
Necesitas tener una cuenta de Heroku. Si no tienes uno, puede crearlo desde [Heroku’s Signup Page](https://signup.heroku.com/).

1. Descargue e instale la CLI de Heroku:

    Puede descargar Heroku CLI desde [Heroku Dev Center](https://devcenter.heroku.com/articles/heroku-cli#download-and-install).

#### uso de heroku CLI
2. Inicie sesión con su email y password:
```
heroku login
```
Se le pedirá que ingrese el correo electrónico y la contraseña de su cuenta de Heroku.
```
    heroku: Press any key to open up the browser to login or q to exit: 
    Opening browser to https://cli-auth.heroku.com/auth/cli/browser/888fc87d-092a-4bc8-8d3e-84f01f3e4eca?requestor=SFMyNTY.g2gDbQAAAAwzOC4yNS4xNS4yMDduBgC4gASAggFiAAFRgA.Ov5Qw929rGNZjqcbqyZNSRgnyw91JCaFHWEwMlRf_fE
    Logging in... done
    Logged in as zomeli.villanueva@gmail.com
```
¡Eso es todo! Has iniciado sesión en Heroku. Ahora podemos continuar con el despliegue.
3. Descargar Git de repositorio [ApiRestPokeAPI](https://github.com/ZOMELI/ApiRestPokeAPI.git).
```
git clone -b main https://github.com/ZOMELI/ApiRestPokeAPI.git
```
4. cree una nueva aplicación de heroku usando un `heroku create <YOUR_UNIQUE_APP_NAME>`:
```
heroku create heroku-deploy-48491134
```
```
    Creating stark-sword-398... done, stack is cedar
    http://heroku-deploy-48491134.herokuapp.com/ | git@heroku.com:heroku-deploy-48491134.git
    Git remote heroku added
```

5. Implementar la API en Heroku, usando el comando `git push heroku <YOUR_BRANCH_GIT>`:
```
git push heroku main
```
```
    Counting objects: 47, done.
    Delta compression using up to 4 threads.
    Compressing objects: 100% (25/25), done.
    Writing objects: 100% (47/47), 10.25 KiB, done.
    Total 47 (delta 19), reused 42 (delta 17)

    -----> Heroku receiving push
    -----> Java app detected
    -----> Installing OpenJDK 1.8... done
    -----> Installing Maven 3.6.2... done
    -----> Installing settings.xml... done
    -----> executing /app/tmp/repo.git/.cache/.maven/bin/mvn -B -Duser.home=/tmp/build_3k0p14ghrmdzs -Dmaven.repo.local=/app/tmp/repo.git/.cache/.m2/repository -s /app/tmp/repo.git/.cache/.m2/settings.xml -DskipTests=true clean install
           [INFO] Scanning for projects...
           [INFO]                                                                         
           [INFO] ------------------------------------------------------------------------
           [INFO] Building ApiRestPokeAPI-1.0-SNAPSHOT
           [INFO] ------------------------------------------------------------------------
           ...
           [INFO] ------------------------------------------------------------------------
           [INFO] BUILD SUCCESS
           [INFO] ------------------------------------------------------------------------
           [INFO] Total time: 10.062s
           [INFO] Finished at: Tue Mon 08 23:27:20 UTC 2022
           [INFO] Final Memory: 12M/490M
           [INFO] ------------------------------------------------------------------------
    -----> Discovering process types
           Procfile declares types -> web
    -----> Compiled slug size is 948K
    -----> Launching... done, v3
           http://heroku-deploy-48491134.herokuapp.com deployed to Heroku
```
Ahora, revisemos el estado de los procesos de la aplicación, con el comando `heroku ps --app <YOUR_UNIQUE_APP_NAME>`:
```
heroku ps --app heroku-deploy-48491134
```
```
    === web (Free): java -Dserver.port=$PORT $JAVA_OPTS -jar target/ApiRestPokeAPI-0.0.1-SNAPSHOT.jar (1)
    web.1: idle 2022/08/08 19:16:18 -0500 (~ 18m ago)
```
El proceso web está activo. Revise los registros para obtener más información, con el comando `heroku logs --tail --app <YOUR_UNIQUE_APP_NAME>`:
```
heroku logs --tail --app heroku-deploy-48491134
```
``` 
    2022-08-08T22:43:37 app[web.1]: .   ____          _            __ _ _
    2022-08-08T22:43:37 app[web.1]: /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    2022-08-08T22:43:37 app[web.1]: ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
    2022-08-08T22:43:37 app[web.1]: \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
    2022-08-08T22:43:37 app[web.1]: '  |____| .__|_| |_|_| |_\__, | / / / /
    2022-08-08T22:43:37 app[web.1]: =========|_|==============|___/=/_/_/_/
    2022-08-08T22:43:37 app[web.1]: :: Spring Boot ::                (v2.7.2)
    2022-08-08T22:43:37 app[web.1]:
    2022-08-08T22:43:37 app[web.1]: 2022-08-08 22:43:37.662  INFO 4 --- [           main] c.z.v.a.ApiRestPokeApiApplication        : Starting ApiRestPokeApiApplication v0.0.1-SNAPSHOT using Java 1.8.0_332-heroku on 8e71da91
    -54a2-438a-8530-63a4eb21b926 with PID 4 (/app/target/ApiRestPokeAPI-0.0.1-SNAPSHOT.jar started by u14902 in /app)
    2022-08-08T22:43:37 app[web.1]: 2022-08-08 22:43:37.665  INFO 4 --- [           main] c.z.v.a.ApiRestPokeApiApplication        : No active profile set, falling back to 1 default profile: "default"
    2022-08-08T22:43:38 app[api]: Build succeeded
    2022-08-08T22:43:40 app[web.1]: 2022-08-08 22:43:40.619  INFO 4 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 58981 (http)
    2022-08-08T22:43:40 app[web.1]: 2022-08-08 22:43:40.629  INFO 4 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
    2022-08-08T22:43:40 app[web.1]: 2022-08-08 22:43:40.630  INFO 4 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.65]
    2022-08-08T22:43:41 app[web.1]: 2022-08-08 22:43:41.315  INFO 4 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
    2022-08-08T22:43:41 app[web.1]: 2022-08-08 22:43:41.315  INFO 4 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2964 ms
    2022-08-08T22:43:43 app[web.1]: 2022-08-08 22:43:43.452  INFO 4 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 58981 (http) with context path ''
    2022-08-08T22:43:43 app[web.1]: 2022-08-08 22:43:43.460  INFO 4 --- [           main] c.z.v.a.ApiRestPokeApiApplication        : Started ApiRestPokeApiApplication in 6.584 seconds (JVM running for 6.946)
    2022-08-08T22:43:43 heroku[web.1]: State changed from starting to up
```
6.Se ve bien!. Ahora podemos visitar la aplicación con `heroku open --app <YOUR_UNIQUE_APP_NAME>`.
```
heroku open --app heroku-deploy-48491134
```
## Consumir EndPoint's Api BS RestPokeAPI

### 1. GET Response Pokemon's With parameter limit 2 and offset 4
```
curl --location --request GET 'https://zomeli-villanueva-48491134.herokuapp.com/pokemon?limit=2&offset=4'
```
Response:
```json
   {
      "count": 1154,
      "previous": "https://zomeli-villanueva-48491134/pokemon/?offset=2&limit=2",
      "next": "https://zomeli-villanueva-48491134/pokemon/?offset=6&limit=2",
      "pokemons": [
         {
            "id": "5",
            "name": "charmeleon",
            "url": "https://zomeli-villanueva-48491134/pokemon/5/",
            "weight": "190",
            "types": [
               {
                  "name": "fire",
                  "url": "https://zomeli-villanueva-48491134/type/10/"
               }
            ],
            "abilities": [
               {
                  "name": "blaze",
                  "url": "https://zomeli-villanueva-48491134/ability/66/"
               },
               {
                  "name": "solar-power",
                  "url": "https://zomeli-villanueva-48491134/ability/94/"
               }
            ]
         },
         {
            "id": "6",
            "name": "charizard",
            "url": "https://zomeli-villanueva-48491134/pokemon/6/",
            "weight": "905",
            "types": [
               {
                  "name": "fire",
                  "url": "https://zomeli-villanueva-48491134/type/10/"
               },
               {
                  "name": "flying",
                  "url": "https://zomeli-villanueva-48491134/type/3/"
               }
            ],
            "abilities": [
               {
                  "name": "blaze",
                  "url": "https://zomeli-villanueva-48491134/ability/66/"
               },
               {
                  "name": "solar-power",
                  "url": "https://zomeli-villanueva-48491134/ability/94/"
               }
            ]
         }
      ]
   }
```



### 2. GET Response Pokemon With path parameter Id Pokemon
```
curl --location --request GET 'https://zomeli-villanueva-48491134.herokuapp.com/pokemon/4/'
```
Response:
```json
   {
      "id": "4",
      "name": "charmander",
      "url": "https://zomeli-villanueva-48491134/pokemon-species/4/",
      "weight": "85",
      "types": [
         {
            "name": "fire",
            "url": "https://zomeli-villanueva-48491134/type/10/"
         }
      ],
      "abilities": [
         {
            "name": "blaze",
            "url": "https://zomeli-villanueva-48491134/ability/66/"
         },
         {
            "name": "solar-power",
            "url": "https://zomeli-villanueva-48491134/ability/94/"
         }
      ]
   }
```



### 3. GET Response Evolution Pokemon With path parameter Id Evolution
```
curl --location --request GET 'https://zomeli-villanueva-48491134.herokuapp.com/evolution/10'
```
Response:
```json
   {
      "id": "10",
      "pokemon": "pichu",
      "url": "https://zomeli-villanueva-48491134/pokemon/172/",
      "evolutions": [
         {
            "name": "pikachu",
            "url": "https://zomeli-villanueva-48491134/pokemon/25/"
         },
         {
            "name": "raichu",
            "url": "https://zomeli-villanueva-48491134/pokemon/26/"
         }
      ]
   }
```



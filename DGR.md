# Historial de revisiones

  
# Introducción
## Propósito
## Alcance
## Visión general

# Descripción general del producto
## Funciones del producto
## Suposiciones y dependencias
## Restricciones
## Requisitos futuros

# Requerimientos específicos
## Requisitos funcionales


### RF01 Acceso a la partida.

#### RF01.1 Nombre de jugador. Deberán introducir el nombre por teclado cada uno de forma ordenada.
#### RF01.2 Jugador 1. Deberá ser el primer nombre introducido.
#### RF01.3 Jugador 2. Deberá ser el segundo nombre introducido.


### RF02 Jugar una partida.

#### RF02.1 Ronda
##### RF02.1.1 Nº de rondas. Habrá tantas rondas como letras del abecedario, excepto la ñ.
##### RF02.1.2 Pregunta de la letra. Se realiza la pregunta aleatoria de la letra correspondiente. Referencia al RF06
##### RF02.1.3 Cronómetro. Cuando se lanza la pregunta se inicia un contador de 15 segundos. Depende de RF02.1.1
######  RF02.1.3.1 Reinicio. En caso de rebote se reinicia el contador, ya que no cambia la ronda.
##### RF02.1.4 Respuesta del usuario. 
######  RF02.1.4.1 Entrada. La palabra sera introducida por teclado en el formato indicado. Depende de RF06.
######  RF02.1.4.2 Respuesta Correcta. En caso de acierto, puntúa al jugador correspondiente y pasa a la siguiente ronda.
######  RF02.1.4.3 Respuesta Incorrecta. 
####### RF02.1.4.3.1 Jugador que inicia la ronda. Si éste falla, se produciría el rebote al otro jugador.
####### RF02.1.4.3.2 Jugador que recibe el rebote. Si éste falla, se pasa a la siguiente ronda (letra) sin que ninguno puntúe.

#### RF02.2 Turnos
##### RF02.2.1 Definición.  El turno de cada ronda se corresponde al jugador que empieza respondiendo. 
##### RF02.2.2 Primer turno. Le corresponde al jugador 1. 
##### RF02.2.3 Orden alternado. En cada ronda se deberá alternar el orden de inicio entre los jugadores.

#### RF02.3 Final

### RF03 Sistema de puntuacion

### RF04 Interfaz

### RF05 Preguntas

### RF06 Respuestas

###  1-RF Respecto a los jugadores:

####    1.1 Deben poder jugar dos usuarios simultáneamente.
####    1.2 Los usuarios deben poder acceder aportando su nombre de jugador.
####    1.3 El jugador 1 será el primer nombre introducido.
####    1.4 Debe empezar el jugador 1.

### 2-RF Respecto al funcionamiento del juego:

####    2.1-Sistema de juego:

#####       2.1.1 La respuesta debe ser introducida por teclado.
#####       2.1.2 
#####       2.1.3 Deberá haber un rebote en caso del que el primer jugador en responder falle, para que el otro jugador tenga la oportunidad de ganar la letra.
#####       2.1.4 Deberá lanzarse la misma pregunta al jugador que no ha respondido primero.
#####       2.1.5 Deberá pasar a la siguiente letra haya acierto o fallo, llevándose la letra o no cualquiera de los jugadores.
#####       2.1.6 Al acabar cada ronda se pasará a la siguiente letra.
#####       2.1.7 Cada jugador deberá tener asociado un contador con el número de aciertos (puntos) que lleva en el juego.
#####       2.1.8 Deberá haber una cuenta atrás de 15 segundos que comienze al mostrar la pregunta, y se resetee al cambiar el turno.
#####       2.1.9 La última letra deberá ser la z
#####       2.1.10 Ganará el jugador con más aciertos.
 


####    2.2-Interfaz:

#####       2.2.1 Se deberá mostrar por pantalla la pregunta al jugador correspondiente. 
#####       2.2.2 Deberá aparecer la letra que se está respondiendo en la parte central de la interfaz.
#####       2.2.3 Deberá aparecer a la izquierda las preguntas del jugador1.
#####       2.2.4 Deberá aparecer a la derecha las preguntas del jugador2.
#####       2.2.5 La cuenta atrás de 15 segundos deberá mostrarse.
#####       2.2.6 En la interfaz, en los aciertos deberá mostrarse por pantalla "CORRECTO".
#####       2.2.7 Al acertar aumentará el contador, reflejándose en la interfaz.
#####       2.2.7 En los errores deberá mostrarse por pantalla "INCORRECTO".
#####       2.2.8 Al fallar el jugador el rebote, deberá mostrarse por pantalla la solucion.
#####       2.2.9 Al terminar la cuenta atrás, deberá darse como incorrecta la pregunta, y mostrar por pantalla "¡TIEMPO!". 
#####       2.2.10 Se deberá mostrar por pantalla el número de aciertos de cada jugador.
#####       2.2.11 En una letra aleatoria deberá mostrarse por pantalla el mensaje : "Las dos próximas letras tendrán bonus". 
#####       2.2.12 En las dos rondas de bonus deberá mostrarse que la puntuación es doble.
#####       2.2.13 Deberá mostrarse el resultado del juego mostrando por pantalla el ganador en caso de que lo haya.

####    2.3-Puntuacion:

#####       2.3.1 Se deberá sumar un punto por cada pregunta respondida correctamente. 

#####       2.3.2-Bonus:

######          2.3.2.1 Deberá ser una ronda normal, donde se ve alterada la puntuación.
######          2.3.2.2 Las preguntas bonus deberán sumar 2 puntos.
######          2.3.2.3 La letra de la primera pregunta bonus deberá ser aleatoria.
######          2.3.2.4 En la siguiente ronda, que corresponde a la siguiente letra del abecedario (exceptuando la ñ), también contendrá bonus.

####    2.4-Preguntas:

#####       2.4.1-Características:

######          2.4.1.1 Debe haber mínimo una pregunta por cada letra del abecedario (exceptuando la ñ).
######          2.4.1.2 La pregunta o definición contiene si la respuesta comienza o contiene la letra correspondiente.

#####       2.4.2-Tipos:

######          2.4.2.1 Debe haber definiciones que se deben adivinar.
######          2.4.2.2 Debe haber preguntas que deben ser respondidas con una única palabra.

#####       2.4.3-Respuestas:

######          2.4.3.1 No se tendrán en cuenta las tildes.
######          2.4.3.2 La ñ no puede formar parte de la respuesta.
######          2.4.3.3 Las palabras no pueden ser compuestas.
######          2.4.3.4 Deberá escribirse la respuesta sin espacios.
######          2.4.3.5 Deberá ser una única palabra.


### Extra:
* RF Las letras acertadas aparecen en la parte de la interfaz correspondiente a ese jugador.
* RF En los aciertos se deberá mostrar por pantalla el color verde.
* RF A su vez, en los errores deberá mostrarse por pantalla el color rojo.
* RF Deberá ganar siempre un jugador.
* RF Deberá haber preguntas extras con letras aleatorias.



## Requisitos no funcionales
* RNF01 El sistema estará soportado por PC.
* RNF02 La batería de palabras estará almacenada en ficheros.
* RNF03 Los jugadores tendrán un maximo de 15 segundos para responder cada pregunta.
* RNF04 El sistema no distingue entre mayúsculas y minúsculas.
* RNF05 El sistema no reconocerá las tildes, por lo que el uso de tildes será respuesta incorrecta.
* RNF06 La temática del juego será orientada al conocimiento deportivo.
* RNF07 Las respuestas deben contener o comenzar por la letra correspondiente al turno.
* RNF08 El sistema recibe la respuesta en la entrada por teclado.
* RNF09 El tiempo restante para responder se mostrará en el formato de segundos.
* RNF10 La letra aleotoria bonus no podrá ser la z.


# Apéndices adicionales

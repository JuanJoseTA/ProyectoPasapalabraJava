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
* RF01 Deben poder jugar dos usuarios simultáneamente. 
* RF02 Los usuarios deben poder acceder aportando su nombre de jugador.
* RF03 Debe empezar el jugador 1.
* RF04 En cada letra se deberá alternar el orden de inicio entre los jugadores.
* RF05 Debe lanzarse la pregunta de la primera letra al jugador 1.
* RF06 Deberá haber un rebote en caso del que el primer jugador en responer falle, para que el otro jugador tenga la oportunidad de ganar la letra.
* RF07 Deberá pasar a la siguiente letra haya acierto o fallo, llevándose la letra o no cualquiera de los jugadores.
* RF08 Al acabar cada ronda se pasará a la siguiente letra.
* RF09 Se deberá mostrar por pantalla la pregunta al jugador correspondiente. 
* RF10 La respuesta debe ser introducida por teclado.
* RF11 En la interfaz, en los aciertos deberá mostrarse por pantalla "CORRECTO".
* RF12 A su vez, en los errores deberá mostrarse por pantalla "INCORRECTO"
* RF13 Deberá aparecer a la izquierda las preguntas del jugador1.
* RF14 Deberá aparecer a la derecha las preguntas del jugador2.
* RF15 Deberá aparecer la letra que se está respondiendo en la parte central de la interfaz.
* RF16 Deberá mostrarse el resultado del juego mostrando por pantalla el ganador en caso de que lo haya.
* RF17 Cada letra debe tener asignada una pregunta como mínimo.
* RF18 En una letra aleatoria deberá mostrarse por pantalla el mensaje : "Las dos próximas letras tendrán bonus".
* RF19 El bonus deberá tener una puntuación doble.
* RF20 Cada jugador deberá tener asociado un contador con el número de aciertos (puntos) que lleva en el juego.
* RF21 Se deberá mostrar por pantalla el número de aciertos de cada jugador.
* RF22 Al mostrar la letra a responder, debe haber un mensaje indicando si la respuesta empieza o contiene la letra.
* RF23 Deberá estar señalizado a quién le toca responder en cada momento.
* RF24 Deberá haber una cuenta atrás de 10 segundos que comienze al mostrar la pregunta, y se resetee al cambiar el turno
* RF25 Al terminar la cuenta atrás, deberá darse como incorrecta la pregunta, y mostrar por pantalla "¡TIEMPO!".
RESUMEN REQUISITOS FUNCIONALES:
    RFO2->NOMBRE JUGADOR
    RF03->JUGADOR 1 EMPIEZA
    RF04->ORDEN ALTERNADO
    RF05->PRIMERA PREGUNTA
    RF06->REBOTE
    RF07->PASO LETRA
    RF08->FIN DE RONDA
    RF09->MOSTRAR PREGUNTA
    RF10->RESPUESTA TECLADO
    RF11->ACIERTOS
    RF12->ERRORES
    RF13->POSICIÓN JUGADOR 1
    RF14->POSICIÓN JUGADOR 2
    RF15->LETRA PREGUNTA
    RF16->MOSTRAR RESULTADO
    RF17->MÍNIMO PREGUNTAS LETRA
    RF18->BONUS
    RF19->PUNTUACIÓN BONUS
    RF20->CONTADOR ACIERTOS
    RF21->ACIERTOS TOTALES
    RF22->EMPIEZA O CONTIENE
    RF23->TURNO
    RF24->CUENTA ATRÁS
    RF25->EXCESO TIEMPO

### Extra:
* RF Deberá haber una letra aleatoria con bonus (da más puntos).
* RF Las letras acertadas aparecen en la parte de la interfaz correspondiente a ese jugador.
* RF En los aciertos se deberá mostrar por pantalla el color verde.
* RF A su vez, en los errores deberá mostrarse por pantalla el color rojo.
* RF Deberá ganar siempre un jugador.
* RF Deberá haber preguntas extras con letras aleatorias.
* RF Deberá mostrar al final de la partida, el tiempo utilizado por cada uno de los jugadores.


## Requisitos no funcionales
* RNF01 El sistema estará soportado por PC.
* RNF02 La batería de palabras estará almacenada en una base de datos.
* RNF03 Los jugadores tendrán un maximo de 10 segundos para responder cada pregunta.
* RNF04 El sistema no distingue entre mayúsculas y minúsculas.
* RNF05 El sistema no reconocerá las tildes, por lo que el uso de tildes será respuesta incorrecta.
* RNF06 La temática del juego será orientada al conocimiento deportivo.
* RNF07 Las respuestas deben contener o comenzar por la letra correspondiente al turno.
* RNF08 El sistema recibe la respuesta en la entrada por teclado.
* RNF09 El tiempo restante para responder se mostrará en el formato de segundos.
RESUMEN REQUISITOS NO FUNCIONALES:
    RNF01->SOPORTE
    RNF02->ALMACENAMIENTO PALABRAS
    RNF03->TIEMPO RESPUESTA
    RNF04->FORMATO LETRAS
    RNF05->TILDES
    RNF06->TEMÁTICA
    RNF07->RESPUESTA LETRA
    RNF08->ENTRADA TECLADO

# Apéndices adicionales
